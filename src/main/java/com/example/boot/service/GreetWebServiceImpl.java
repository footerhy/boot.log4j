package com.example.boot.service;

import javax.jws.WebService;

@WebService
public class GreetWebServiceImpl implements GreetWebService {
    @Override
    public String greeting(String hello) {
        return "Good morning : "+hello;
    }
}