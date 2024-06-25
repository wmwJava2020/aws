/**
 * Created by:Wondafrash
 * Date : 6/21/2024
 * Time : 8:24 AM
 */
package com.example.aws_data.service;

import com.example.aws_data.person.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.random.RandomGenerator;

@Service
public class AwsService {
    ArrayList<Person> person = new ArrayList<>();
    public ArrayList<Person> personData() {


      /*  Person p1 = new Person(2, "Alexi", 29, "CALIFORNIA", String.valueOf(UUID.randomUUID()), LocalDateTime.now(), 695L);
        Person p2 = new Person(3, "Biruk", 20, "ETHIOPIA", String.valueOf(UUID.randomUUID()), LocalDateTime.now(), 251L);
        Person p3 = new Person(4, "James", 19, "UNITED KINGDOM", String.valueOf(UUID.randomUUID()), LocalDateTime.now(), 471L);
        Person p4 = new Person(5, "Zack", 30, "JAPAN", String.valueOf(UUID.randomUUID()), LocalDateTime.now(), 452);
        Person p5 = new Person(6, "Olan", 39, "ARGENTINA", String.valueOf(UUID.randomUUID()), LocalDateTime.now(), 900L);
        Person p6 = new Person(7, "Rita", 56, "KENYA", String.valueOf(UUID.randomUUID()), LocalDateTime.now(), 360L);
        Person p7 = new Person(8, "Kira", 40, "INDIA", String.valueOf(UUID.randomUUID()), LocalDateTime.now(), 560L);
        Person p8 = new Person(9, "Tina", 69, "FRANCE", String.valueOf(UUID.randomUUID()), LocalDateTime.now(), 658L);*/


        Person p1 = new Person(2, "Alexi", 29, "CALIFORNIA", 695L);
        Person p2 = new Person(3, "Biruk", 20, "ETHIOPIA", 251L);
        Person p3 = new Person(4, "James", 19, "UNITED KINGDOM", 471L);
        Person p4 = new Person(5, "Zack", 30, "JAPAN",  452L);
        Person p5 = new Person(6, "Olan", 39, "ARGENTINA",  900L);
        Person p6 = new Person(7, "Rita", 56, "KENYA",  360L);
        Person p7 = new Person(8, "Kira", 40, "INDIA",  560L);
        Person p8 = new Person(9, "Tina", 69, "FRANCE", 658L);

        person.add(p1);
        person.add(p2);
        person.add(p3);
        person.add(p4);
        person.add(p5);
        person.add(p6);
        person.add(p7);
        person.add(p8);

        return person;
    }

    public void addPersonalData(Person personnel){
        person.add(personnel);
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
    public List<Person> getPersonalDetails() {
        for(Person person : personData()){
                return Arrays.asList(person);
        }
        return null;
    }

}
