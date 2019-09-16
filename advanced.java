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
        
        //ifPresent : enables to run some code (consumer) on the wrapped value if it is found to be non null
        op1.ifPresent(value -> {
            System.out.println("Value found - " + value);
        });
        
        //filter && map
        //filter : allow to apply a predicate (filter) on the wrapped value!
        boolean isOptional = op1.filter(v -> v.equals("Optional")).isPresent();
        boolean isOptiona2 = op2.filter(v -> v.isEmpty()).isPresent();
        
        //map : allow to convert the data type of the value, it produces an ouptut of type X from an input of type Y
        Optional<Integer> sizeop = op1.map( v -> v.length());
       
        //orElse : returns the value if present in Optional, otherwise it returns the given default value, it executes the code even 
        //         when the Optional is not empty! So be careful!
        System.out.println(op1.orElse("<N/A>"));
        System.out.println(op2.orElse("<N/A>"));
        
        //orElseGet : returns the value if present in Optional, otherwise it enables to run some code (supplier) if it is found to 
        //            be empty, it executes the code only when the Optional is empty! Nice !
        String str = op1.orElseGet(() -> {
                          return "HelloNewOptional";
                     });
        
        //orElseThrow : returns the value if present in Optional, otherwise it throws the exception specified in the supplier
       System.out.println(op3.orElseThrow(ArithmeticException::new)); 

    }

}
