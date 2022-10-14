package com.xyz.uni.rest.apis.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.uni.rest.apis.model.Students;

public interface StudentsRepository extends CrudRepository<Students, Integer>  {

}
