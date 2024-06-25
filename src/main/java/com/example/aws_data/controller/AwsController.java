/**
 * Created by:Wondafrash
 * Date : 6/21/2024
 * Time : 8:24 AM
 */
package com.example.aws_data.controller;

import com.example.aws_data.person.Person;
import com.example.aws_data.service.AwsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AwsController {
    @Autowired
    AwsService awsService;

    @PostMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<Person> addPersonalData(Person personnel){
        awsService.addPersonalData(personnel);
        return new ResponseEntity<>(personnel, HttpStatus.CREATED);
    }

    @GetMapping(value = "/api", produces = "application/json", consumes = "application/json")
    public Person getPersonDetailsById(@RequestParam int id){
        return awsService.getPersonDetailsById(id);
    }

    @GetMapping(value = "/data" ,produces = "application/json", consumes = "application/json")
    public Person getPersonDetailsByUuid(@RequestParam String name){
        return awsService.getPersonDetailsByName(name);
    }

    @GetMapping(value = "/loc",produces = "application/json", consumes = "application/json")
    public Person getPersonalDetailsByZipCode(@RequestParam long zip){
        return awsService.getPersonalDetailsByZipCode(zip);
    }
    @GetMapping(value = "/all",produces = "application/json")
    public List<Person> getPersonalDetails(){
        return awsService.personData();
    }

}
