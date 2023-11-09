package com.sda.demo.zadanie9;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity(name = "files_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(name = "file_name")
    private String name;
    @Column(name = "extension")
    private String extension;
    @Column(name = "size_in_kb")
    private Integer sizeInKb;
    @Column(name = "content")
    private String content;
}
