package com.uam.SISPAC.controller.inventory;

import com.uam.SISPAC.dto.inventory.BookDto;
import com.uam.SISPAC.model.inventory.Book;
import com.uam.SISPAC.service.inventory.IServiceBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Book")
@CrossOrigin("192.*.*.*")
public class ControllerBook {
    @Qualifier("ServiceBook")
    @Autowired
    private IServiceBook service;

    @GetMapping("/all")
    public List<Book> getAll() {
        return service.getAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody BookDto book) {
        service.save(book);
    }

    @PutMapping(value = "/update")
    public void updateBook(@RequestBody BookDto bookDto) throws Exception {
        if (bookDto.getIdBook() == null) {
            throw new Exception("Please, send the Id value");
        }
        service.save(bookDto);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void bookDelete(@PathVariable String id) {
        service.deleteById(id);
    }

    @GetMapping("/one/byisbn/{isbn}")
    public Book getByISBN(@PathVariable String isbn) {
        return service.getOneByISBN(isbn);
    }

    @GetMapping("/many/bytitle/{title}")
    public List<Book> getByTitle(@PathVariable String title) {
        return service.getManyByTitle(title);
    }

    @GetMapping("/one/bymfn/{mfn}")
    public Book getByMFN(@PathVariable String mfn) {
        return service.getOneByMFN(mfn);
    }

    @GetMapping("/many/byauthor/{authorName}")
    public List<Book> getByAuthorName(@PathVariable String authorName) {
        return service.getManyByAuthor(authorName);
    }

    @GetMapping("/many/byclassification/{classificationName}")
    public List<Book> getByClassificationName(@PathVariable String classificationName) {
        return service.getManyByClassification(classificationName);
    }

    @GetMapping("/many/bypublisher/{publisherName}")
    public List<Book> getByPublisherName(@PathVariable String publisherName) {
        return service.getManyByPublisher(publisherName);
    }
}