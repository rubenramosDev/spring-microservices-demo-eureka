package com.rubenramos.commonsmicroservices.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public class CommonServiceImpl<Optional, R extends CrudRepository<Optional, Long>> implements CommonService<Optional> {

    @Autowired
    protected R repository;

    @Override
    public Iterable<Optional> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Optional save(Optional entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
