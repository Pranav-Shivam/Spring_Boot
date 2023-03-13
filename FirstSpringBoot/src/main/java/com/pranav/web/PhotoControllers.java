package com.pranav.web;

import com.pranav.model.Photo;
import com.pranav.service.PhotoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.*;

@RestController
public class PhotoControllers {
    @Autowired
    private final PhotoService photoService;

    public PhotoControllers(PhotoService photoService) {
        this.photoService = photoService;
    }

    @GetMapping("/")
    public String test() {
        return "Hello World";
    }

    @GetMapping("/photos")
    public Iterable<Photo> get() {

        return photoService.get();
    }

    @GetMapping("/photos/{id}")
    public Photo get(@PathVariable Integer id) {
        Photo pic = photoService.get(id);
        if (pic == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return pic;
    }

    @DeleteMapping("/photos/{id}")
    public void delete(@PathVariable Integer id) {
        photoService.remove(id);

//        (async function deletePhoto(id) {
//            await fetch("http://localhost:8080/photos/" + id, {
//            method: "DELETE"
//          })
//})("5")
    }

    @PostMapping("/photos")
    public Photo create(@RequestParam("data") MultipartFile file) throws IOException {
        return photoService.save(file.getOriginalFilename(), file.getContentType(), file.getBytes());

//        (async function createPhoto(){
//        let photo={"fileName":"Shivam.jpg"};
//        await fetch("http://localhost:8080/photos",
//                {
//                        method:"POST",
//                headers:{
//            Accept:'application/json',
//                    'Content-Type':'application/json',
//        },
//        body:JSON.stringify(photo)
//                }).then(result=>result.text())
//    .then(text=>alert(text))
//    })();
    }
}
