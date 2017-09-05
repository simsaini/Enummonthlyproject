package com.example;
import com.example.common.Month;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Input a month please! ");
        String userinput = input.nextLine();
        Month month = Month.valueOf(userinput);
        List<String> monthList = new ArrayList<>();
        monthList.add(userinput);


        switch (month){
            case JANUARY: monthList.add("January");
            case FEBRUARY: monthList.add("February");
            case MARCH: monthList.add("March");
            case APRIL: monthList.add("April");
            case MAY: monthList.add("May");
            case JUNE: monthList.add("June");
            case JULY: monthList.add("July");
            case AUGUST: monthList.add("August");
            case SEPTEMBER: monthList.add("September");
            case OCTOBER: monthList.add("October");
            case NOVEMBER: monthList.add("November");
            case DECEMBER: monthList.add("December");
        }
        if (monthList.isEmpty()) {
            System.out.println("Invalid month name. ");
        } else {
            for (String monthName : monthList){
                System.out.println(monthName);
            }
        }
    }
}
