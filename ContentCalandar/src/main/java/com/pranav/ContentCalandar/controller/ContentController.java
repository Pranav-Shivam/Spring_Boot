package com.pranav.ContentCalandar.controller;

import com.pranav.ContentCalandar.model.Content;
import com.pranav.ContentCalandar.model.Status;
import com.pranav.ContentCalandar.model.Type;
import com.pranav.ContentCalandar.repository.ContentCollectionRepository;
import com.pranav.ContentCalandar.repository.ContentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {
    @Autowired
    private ContentRepository repository;

    @GetMapping
    public List<Content> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Content findById(@PathVariable Integer id) {
        return repository.findById(id).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content Not found !!"));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void createContent(@Valid @RequestBody Content c) {
        repository.save(c);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("/{id}")
    public void updateContent(@RequestBody Content content, @PathVariable Integer id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content Not Found !!");
        }
        repository.save(content);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("/{id}")
    public void deleteContent(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @GetMapping("/filter/{keyword}")
    public List<Content> findByKeyword(@PathVariable String keyword)
    {
        return repository.findContentByKeyword(keyword);
    }

    @GetMapping("/filter/status/{status}")
    public List<Content> findByStatus(@PathVariable Status status)
    {
        return repository.findContentByStatus(status);
    }
}
