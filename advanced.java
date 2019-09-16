package com.azhwani.optional;

import java.util.Optional;

public class AdvancedOptional {

    public static void main(String[] args) {

        Optional<String> op1 = Optional.of("Optional");
        Optional<String> op2 = Optional.empty();
        Integer value1 = null;
        Optional<Integer> op3 = Optional.ofNullable(value1);

        //get : as the name implies, it gets the Optional value if it is not empty 
        System.out.println("Optional value: " + op1.get());
        System.out.println("Empty Optional: " + op2.get());
        System.out.println("Optional value: " + op3.get());
        //isPresent
        
        //ifPresent
        
        //filter && map
        
        //orElseGet
        
        
        //orElse
        
        
        //orElseThrow
       

    }

}
