package com.example.boot.service;

import javax.jws.WebService;

@WebService
public interface GreetWebService {

    String greeting(String hello);
}