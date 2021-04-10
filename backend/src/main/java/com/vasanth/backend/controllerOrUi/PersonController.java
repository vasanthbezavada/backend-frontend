package com.vasanth.backend.controllerOrUi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vasanth.backend.model.Person;
import com.vasanth.backend.service.PersonServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PersonController {
	@Autowired
	PersonServiceImpl personServiceImpl;
	
	@RequestMapping(method = RequestMethod.POST,value ="/add")
	public ResponseEntity<Person> addPerson(@RequestBody Person person){
		personServiceImpl.createPerson(person);
		return ResponseEntity.status(HttpStatus.OK).body(person);
	}
	@RequestMapping(method = RequestMethod.GET,value="/persons")
	public ResponseEntity<Iterable<Person>> findall(){
		return ResponseEntity.status(HttpStatus.OK).body(personServiceImpl.findAllPerson());
	}
	@RequestMapping(method = RequestMethod.DELETE,value="/persons/{id}")
	public ResponseEntity<Iterable<Person>> deletePerson(@PathVariable int id){
		personServiceImpl.deletePerson(id);
		return ResponseEntity.status(HttpStatus.OK).body(personServiceImpl.findAllPerson());
	}
	

}
