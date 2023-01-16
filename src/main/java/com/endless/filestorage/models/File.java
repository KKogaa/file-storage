package com.endless.filestorage.models;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class File {
    private Integer fileId;
    private String fileUrl;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;    
}
