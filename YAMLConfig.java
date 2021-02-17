package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.*;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class YAMLConfig {

    @Value("${name}")
    private String name;

    @Value("${intlist}")
    private List<Integer> intList = new ArrayList<Integer>();

    @Value("${strlist}")
    private List<String> strList = new ArrayList<>();

    @Value("${intset}")
    private Set<Integer> intSet = new HashSet<>();

    @Value("${strset}")
    private Set<String> strSet = new HashSet<>();

    @Value("#{${simplemap.simplemapping}}")
    private Map<Integer, String> myMap= new HashMap<>();

    public String getName() {
        return name;
    }

    public List<Integer> getIntList() {
        return intList;
    }

    public List<String> getStrList(){
        return strList;
    }

    public Set<Integer> getIntSet(){
        return intSet;
    }

    public Set<String> getStrSet() {
        return strSet;
    }

    public Map<Integer,String> getMyMap(){
        return myMap;
    }

}
