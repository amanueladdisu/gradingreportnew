package com.gradingg.assignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Fibbonacii {
    private String LetterGrade;
@RequestMapping
    public String assignmentt(){
    int n , num1 = 0, num2 = 1;
    Scanner s= new Scanner(System.in);
    n=s.nextInt();
    System.out.print("Fibonacci Series of "+n+" numbers:");

    int i=1;
    while(i<=n)
    {
        System.out.print(num1+" ");
        int sumOfPrevTwo = num1 + num2;
        num1 = num2;
        num2 = sumOfPrevTwo;
        i++;
    }



    return String.valueOf(num1);
}
}


