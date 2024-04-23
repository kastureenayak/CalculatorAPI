package com.health.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Oparation {

    @GetMapping("sum")
    public String sumOfNo(@RequestParam("no1") Integer no1,
                      @RequestParam("no2") Integer no2)
    {
        Integer sum=no1+no2;
        return "The sum of 2 numbers is "+sum;
    }

    @GetMapping("dif")
    public String differenceOfNo(@RequestParam("no1") Integer no1,
                                 @RequestParam("no2") Integer no2)
    {
        Integer dif=no1-no2;
        return "The difference of 2 numbers is "+dif;
    }

    @GetMapping("mul")
    public String multiplicationOfNo(@RequestParam("no1") Integer no1,
                                     @RequestParam("no2") Integer no2)
    {
        Double mul=(double)no1*no2;
        return "The multiplication of 2 numbers is "+mul;
    }

    @GetMapping("div")
    public String divisionOfNo(@RequestParam("no1") Integer no1,
                               @RequestParam("no2") Integer no2)
    {
        Float div=(float)no1/no2;
        return "The division of 2 numbers is "+div;
    }

}
