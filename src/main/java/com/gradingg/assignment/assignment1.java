package com.gradingg.assignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class assignment1 {
    private String LetterGrade;
@RequestMapping
    public String assignmentt(){
    String number;
    String name;
    double test_result = 0 ;

    Scanner keyboard = new Scanner(System.in);
    number = keyboard.nextLine();


    keyboard = new Scanner(System.in);
    name = keyboard.nextLine();


    keyboard = new Scanner(System.in);
    test_result = keyboard.nextDouble();


   float  test_score ;
    test_score =(float)((test_result *100)/ 50);

    if(test_score> 90 && test_score <=100 ){
         LetterGrade = "A";
        System.out.println(number + " " + name + " "  + test_score + " " + LetterGrade );
    }
    else if (test_score> 80 && test_score <=90 ){
        LetterGrade = "B";
        System.out.println(number + " " + name + " "  + test_score + " " + LetterGrade );

    }
    else {
        LetterGrade = "F";
        System.out.println(number + " " + name + " "  + test_score + " " + LetterGrade );    }

return name + number + test_score + LetterGrade ;
}
}

