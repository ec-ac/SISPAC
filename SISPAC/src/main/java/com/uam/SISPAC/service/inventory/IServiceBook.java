package com.uam.SISPAC.service.inventory;

import com.uam.SISPAC.dto.inventory.BookDto;
import com.uam.SISPAC.model.inventory.Book;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IServiceBook {

    List<Book> getAll();

    void save(BookDto bookDto);

    void deleteById(String id);

    Book getOneByISBN(String isbn);

    Book getOneByMFN(String mfn);

    Book getOneByTitle(String title);

    List<Book> getManyByAuthor(String authorName);

    List<Book> getManyByClassification(String classificationName);

    List<Book> getManyByPublisher(String publisherName);
}
