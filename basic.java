package com.azhwani.optional;

import java.util.Optional;

public class BasicOptional {

    public static void main(String[] args) {

        Optional<String> opbasic = Optional.of("Optional");

        System.out.println("Non-Empty Optional:" + opbasic);
        System.out.println("Non-Empty Optional: value : " + opbasic.get());
        System.out.println("Empty Optional: " + Optional.empty());

    }

}
