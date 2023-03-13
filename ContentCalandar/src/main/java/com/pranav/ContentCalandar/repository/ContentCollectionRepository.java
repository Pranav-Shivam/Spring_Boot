package com.pranav.ContentCalandar.repository;

import com.pranav.ContentCalandar.model.Content;
import com.pranav.ContentCalandar.model.Status;
import com.pranav.ContentCalandar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contents=new ArrayList<>();

    public List<Content> findAll() {
        return contents;
    }
    public Optional<Content> findById(Integer id)
    {
        return contents.stream().filter(c->c.id().equals(id)).findFirst();
    }
    @PostConstruct
    public void addContents() {
        Content c = new Content(
                12,
                "my first vlog",
                "I am posting new blog",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                "");
        contents.add(c);
    }

    public void save(Content con) {
        contents.removeIf(c->c.id().equals(con.id()));
        contents.add(con);
    }

    public boolean existById(Integer id) {
        return  contents.stream().filter(c->c.id().equals(id)).count()==1;
    }

    public void delete(Integer id) {
        contents.removeIf(c->c.id().equals(id));
    }
}
