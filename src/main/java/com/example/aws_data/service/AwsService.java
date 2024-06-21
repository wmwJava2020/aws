/**
 * Created by:Wondafrash
 * Date : 6/21/2024
 * Time : 8:24 AM
 */
package com.example.aws_data.service;

import com.example.aws_data.person.Person;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;
import java.util.random.RandomGenerator;

@Service
public class AwsService {

    String eu = "UNITED KINGDOM";
    String af = "ETHIOPIA";
    String us = "CALIFORNIA";
    String la = "ARGENTINA";
    String ai = "JAPAN";

    public ArrayList<Person> personData() {

        ArrayList<Person> person = new ArrayList<>();
        Person p1 = new Person(2, "Alexi", 29, "CALIFORNIA", String.valueOf(UUID.randomUUID()), LocalDateTime.now(), 695L);
        Person p2 = new Person(3, "Biruk", 20, "ETHIOPIA", String.valueOf(UUID.randomUUID()), LocalDateTime.now(), 251L);
        Person p3 = new Person(4, "James", 19, "UNITED KINGDOM", String.valueOf(UUID.randomUUID()), LocalDateTime.now(), 471L);
        Person p4 = new Person(5, "Zack", 30, "JAPAN", String.valueOf(UUID.randomUUID()), LocalDateTime.now(), 452);
        Person p5 = new Person(6, "Olan", 39, "ARGENTINA", String.valueOf(UUID.randomUUID()), LocalDateTime.now(), 900L);

        person.add(p1);
        person.add(p2);
        person.add(p3);
        person.add(p4);
        person.add(p5);

        return person;
    }

    public Person getPersonDetailsById(int id) {
        for (Person person : personData()) {
            if (person.getPersonId() == id) {
                return person;
            }
        }
        return null;
    }

    public Person getPersonDetailsByName(String name) {
        for (Person person : personData()) {
            if (person.getPersonName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public Person getPersonalDetailsByZipCode(long zip) {
           for(Person person : personData()){
               if(person.getAreaCode() == zip){
                   return person;
               }
           }

        return null;
    }
}
