package com.uam.SISPAC.controller;

import com.uam.SISPAC.model.Author;
import com.uam.SISPAC.service.IServiceAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class ControllerAuthor {
    @Qualifier("ServiceAuthor")
    @Autowired
    public IServiceAuthor serviceAuthor;
    @GetMapping("/all")
    public List<Author> getAll() {
        return serviceAuthor.getAll();
    }
    @PostMapping("/save")
    public Author saveAuthor(@RequestBody Author author) {
        return serviceAuthor.save(author);
    }
    @PutMapping(value = "/update")
    public Author updateAuthor(@RequestBody Author author) throws Exception {
        if (author.getId() == null) {
            throw new Exception("Please, send the Id vallue");
        }
        return serviceAuthor.save(author);
    }
    @DeleteMapping(value="/delete/{id}")
    public void deleteLibro(@PathVariable String id) {
        serviceAuthor.deleteById(id);
    }


}
