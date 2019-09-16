package com.azhwani.optional;

import java.util.Optional;

public class AdvancedOptional {

    public static void main(String[] args) {

        Optional<String> op1 = Optional.of("Optional");
        Optional<String> op2 = Optional.empty();
        Integer value1 = null;
        Optional<Integer> op3 = Optional.ofNullable(value1); // Optional.of(value1) will throws NullPointerException if value1 is null!

        //get : as the name implies, it gets the Optional value if it is not empty, otherwise it throws java.util.NoSuchElementException!
        System.out.println("Optional value: " + op1.get());
        System.out.println("Empty Optional: " + op2.get());
        System.out.println("Optional value: " + op3.get());
        
        //isPresent : return boolean, check whatever the Optional value is empty or not empty!
        System.out.println("Optional value: " + op1.isPresent());
        
        //ifPresent : enables to run some code on the wrapped value if it is found to be non null
        
        //filter && map
        //filter : allow to apply a predicate (filter) on the wrapped value!
        //orElseGet
        
        
        //orElse
        
        
        //orElseThrow
       

    }

}
