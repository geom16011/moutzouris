/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package excercise2_bootcamp;

/**
 *
 * @author user
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static  void main (String [] args) {

        System.out.println("User let 's set up 3 bootcamps");
        ArrayList<Bootcamp> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3; i=i+1) {
            System.out.println("Put the name of the" +i+" bootcamp");
            String name=sc.next();
            System.out.println("Put the starting date of the " +i+" bootcamp");
            String date_s=sc.next();
            LocalDate date_s1=LocalDate.parse(date_s);
            System.out.println("Put the ending date of the " +i+"  bootcamp");
            String date_e=sc.next();
            LocalDate date_e1=LocalDate.parse(date_e);
            Bootcamp boot1=new Bootcamp(name,date_s1, date_e1);
            arr.add(boot1);


        }

        System.out.println("Enter a date to check for a bootcamp");
        String date=sc.next();
        LocalDate date_to_search=LocalDate.parse(date);
        Bootcamp.setBootcamp(arr);
        Bootcamp.searchdate(date_to_search);


    }

}
