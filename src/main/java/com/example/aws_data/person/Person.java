/**
 * Created by:Wondafrash
 * Date : 6/21/2024
 * Time : 8:27 AM
 */
package com.example.aws_data.person;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;

public class Person {


    int personId;
    String personName;
    int personAge;
    String personAddress;

    String personUUID;

    LocalDateTime dateHired;

    long areaCode;



    public LocalDateTime getDateHired() {
        LocalDateTime ldt = LocalDateTime.now().minusYears(5);
        return ldt;
    }

    public long getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(long areaCode) {
        this.areaCode = areaCode;
    }

    public void setDateHired(LocalDateTime dateHired) {

        this.dateHired = dateHired;
    }

    public Person() {
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
            this.personAddress = personAddress;

    }

    public String getPersonUUID() {
        return personUUID;
    }

    public void setPersonUUID(String personUUID) {
        this.personUUID = personUUID;
    }

    public Person(int personId, String personName, int personAge, String personAddress, String personUUID, LocalDateTime dateHired, long areaCode) {
        this.personId = personId;
        this.personName = personName;
        this.personAge = personAge;
        this.personAddress = personAddress;
        this.personUUID = personUUID;
        this.dateHired = dateHired;
        this.areaCode = areaCode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", personAge=" + personAge +
                ", personAddress='" + personAddress + '\'' +
                ", personUUID='" + personUUID + '\'' +
                ", dateHired=" + dateHired +
                ", areaCode=" + areaCode +
                '}';
    }
}
