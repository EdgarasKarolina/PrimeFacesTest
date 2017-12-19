package com.codenotfound.primefaces;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ManagedBean
@ViewScoped
public class HelloWorld implements Serializable {

    private String firstName = "John";
    private String lastName = "Doe";
    private String gender;
    private int number;


    private String year;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }



    @PostConstruct
    public void init2() {

/*
        years  = new ArrayList<>();
        years.add("USA");
        years.add("Germany");
        years.add("Brazil"); */
    }


    private String month;
    private String day;

    private List<TvStation> stations;
    private Map<String, String> years;

    @ManagedProperty("#{tvService}")
    private TvStationServices service;

    public void setService(TvStationServices service) {
        this.service = service;
    }

    @PostConstruct
    public void init() {
        stations = service.createStations(2);

        years  = new HashMap<>();
        years.put("2001", "45");
        years.put("2002", "123");
        years.put("2003", "415351");

    }

    public List<TvStation> getStations() {
        return stations;
    }

    public Map<String, String> getYears() {
        return years;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private boolean value1;

    public boolean isValue1() {
        return value1;
    }

    public void setValue1(boolean value1) {
        this.value1 = value1;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String showGreeting() {
        return "Hello" + " " + firstName + " " + lastName + "!";
    }
}
