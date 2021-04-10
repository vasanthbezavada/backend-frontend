package com.vasanth.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vasanth.backend.model.Person;
@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
