package com.example.aws_data.service;

import com.example.aws_data.person.Person;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class AwsServiceTest extends TestCase {
    @Autowired
    AwsService service;
    Person person;

    @Test
    void getPersonalDetailsByZipCode() {
        assertEquals(251,251);
    }

    @Test
    void getPersonDetailsByName() {
        String str = "Alexi";
        assertEquals("Alexi",str);
    }
}