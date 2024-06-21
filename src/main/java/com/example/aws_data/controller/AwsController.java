/**
 * Created by:Wondafrash
 * Date : 6/21/2024
 * Time : 8:24 AM
 */
package com.example.aws_data.controller;

import com.example.aws_data.person.Person;
import com.example.aws_data.service.AwsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {
    @Autowired
    AwsService awsService;

    @GetMapping("/api")
    public Person getPersonDetailsById(@RequestParam int id){
        return awsService.getPersonDetailsById(id);
    }

    @GetMapping("/data")
    public Person getPersonDetailsByUuid(@RequestParam String name){
        return awsService.getPersonDetailsByName(name);
    }

    @GetMapping("/location")
    public Person getPersonalDetailsByZipCode(@RequestParam long zip){
        return awsService.getPersonalDetailsByZipCode(zip);
    }
}
