package com.info.people.management.app.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.info.people.management.app.entity.Person;

public interface PeoplemanagementDao extends JpaRepository<Person, Integer>{

	Person findByFirstName(String name);

	List<Person> findByOrderByLastName();

	List<Person> findByFirstNameOrderByLastName(String name);

	List<Person> findByLastName(String name);

	List<Person> findByFirstName(String name, Sort by);

 
 
}
