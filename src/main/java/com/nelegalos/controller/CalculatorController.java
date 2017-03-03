package com.nelegalos.controller;

/**
 * Created by Serge on 02.03.2017.
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CalculatorController {

    @RequestMapping("/multipliedByTen")
    public String index(int a) {

        return String.valueOf(a*10);
    }
}
