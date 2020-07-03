package com.rubenramos.commonsmicroservices.demo.services;

public interface CommonService<Optional> {

    public Iterable<Optional> findAll();

    public Optional findById(Long id);

    public Optional save(Optional entity);

    public void deleteById(Long id);
}


