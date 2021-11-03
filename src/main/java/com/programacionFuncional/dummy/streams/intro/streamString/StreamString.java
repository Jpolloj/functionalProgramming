package com.programacionFuncional.dummy.streams.intro.streamString;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class StreamString {

    public static void main(String args[]){


        Scanner sn = new Scanner(System.in);
        String entrada = sn.nextLine();

        IntStream streamChars = entrada.chars();
        //streamChars.forEach(System.out::println);
        streamChars.filter(n -> !Character.isDigit((char) n)
                && !Character.isWhitespace((char) n))
                .forEach(n -> System.out.print((char) n));

        String str = "Html, Css, PYthon";
        Pattern.compile(", ").splitAsStream(str).forEach(System.out::println);



    }
}
