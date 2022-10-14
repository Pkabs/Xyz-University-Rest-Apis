package com.xyz.uni.rest.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.rest.api.model.Students;

public interface StudentsRepository extends CrudRepository<Students, Integer>  {

}
