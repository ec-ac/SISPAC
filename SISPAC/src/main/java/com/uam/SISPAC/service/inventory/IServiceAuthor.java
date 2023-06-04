package com.uam.SISPAC.service.inventory;

import com.uam.SISPAC.dto.inventory.AuthorDto;
import com.uam.SISPAC.model.inventory.Author;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface IServiceAuthor {
    List<Author> getAll();

    Author save(AuthorDto author);

    void deleteById(String id);
}

