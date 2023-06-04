package com.uam.SISPAC.service.inventory;
import com.uam.SISPAC.dto.inventory.ClassificationDto;
import com.uam.SISPAC.model.inventory.Classification;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IServiceClassification {
    List<Classification> getAll();

    Classification save(ClassificationDto classification);

    void deleteById(String id);
}
