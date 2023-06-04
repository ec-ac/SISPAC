package com.uam.SISPAC.repository.inventory;

import com.uam.SISPAC.model.inventory.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRepositoryBook extends JpaRepository<Book, String> {
    @Query("select b from Book b where b.ISBN = :isbn")
    Book getBookByISBN(@Param("isbn") String isbn);

    @Query("select b from Book b where b.MFN = :mfn")
    Book getBookByMFN(@Param("mfn") String mfn);

    @Query("select b from Book b where b.title = :title")
    Book getBookByTitle(@Param("title") String title);

    @Query("select b from Book b where b.classification.name = :classificationName")
    List<Book> getBookByClassification(@Param("classificationName") String classificationName);

    @Query("select b from Book b where b.publisher.name = :publisherName")
    List<Book> getBookByPublisher(@Param("publisherName") String publisherName);

    @Query("select b from Book b join b.authors a where a.name = :authorName")
    List<Book> getBooksByAuthor(@Param("authorName") String authorName);

}
