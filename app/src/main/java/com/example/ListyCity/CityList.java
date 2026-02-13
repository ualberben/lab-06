package com.example.ListyCity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to list if city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city){
        if(cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This return true if list contain given city
     * @param city
     *      city to check if contains in the list
     * @return
     *      true if in the list, false if not in the list
     */
    public boolean hasCity(City city){
        for (City c:cities){
            if(c.compareTo(city) == 0){
                return true;
            }
        }
        return false;
    }
}
