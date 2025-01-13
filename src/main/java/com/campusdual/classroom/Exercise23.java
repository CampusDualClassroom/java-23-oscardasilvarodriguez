package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> map = new HashMap<>();

        map.put("person", new Person("John", "Smith"));
        map.put("teacher", new Teacher("María", "Montessori", "Educación"));
        map.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        map.put("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));

        return map;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return value;
    }

    public static void printMapValues(Map<String, Person> map) {
       for (Map.Entry<String, Person> entry : map.entrySet()) {
           System.out.println("Clave: " + entry.getKey());
           entry.getValue().getDetails();
           System.out.println();
       }
    }

    public static void main(String[] args) {
        Map<String, Person> map = createHashMap();
        addMapValue(map, "police", new PoliceOfficer("Charles", "Boyle", "B-99"));
        printMapValues(map);
    }
}
