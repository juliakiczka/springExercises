package com.sda.demo.zadanie9;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface FileDataRepository extends CrudRepository<FileData, UUID> {
    List<FileData> findAllBy();
}
