package com.rubenramos.commonsmicroservices.demo.controllers;

import com.rubenramos.commonsmicroservices.demo.services.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class CommonController<Optional, S extends CommonService<Optional>> {

    /*Dont use the implementation class, I use the interface instated*/
    @Autowired
    protected S service;

    @GetMapping("getAll")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Optional entity) {
        return ResponseEntity.ok(service.save(entity));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
