package com.endless.filestorage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/files")
public class FileController {
    @Autowired
    public FileController(){

    }

    @PostMapping("")
    public Mono<Void> createFileRoute(RequestBody a){
        return Mono.empty();
    }

    @GetMapping("/{fileId}")
    public Mono<Void> getFileRoute(){
        return Mono.empty();
    }
}
