package com.sgmarghade;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws IOException {
        System.out.println( new AvroConverter(new ObjectMapper()).convert(args[0],args[1],args[2]));
    }


}