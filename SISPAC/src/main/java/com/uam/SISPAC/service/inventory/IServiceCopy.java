package com.uam.SISPAC.service.inventory;

import com.uam.SISPAC.dto.inventory.CopyDto;
import com.uam.SISPAC.model.inventory.Copy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceCopy {
    Copy save(CopyDto copy);

    void deleteById(String id);

    List<Copy> getCopyByBook(String book);
}
