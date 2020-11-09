//package Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

class Main {



    public static  void main (String [] args) {

        System.out.println("User let set up a bootcamp");
        ArrayList<Bootcamp> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        //Bootcamp boot1=new Bootcamp();
        for (int i=0;i<3; i=i+1) {
            System.out.println("Put the name of bootcamp");
            String name=sc.next();
            System.out.println("Put the starting date of the bootcamp in the format YYYY-MM-DD");
            String date_s=sc.next();
            LocalDate date_s1=LocalDate.parse(date_s);
            System.out.println("Put the ending date of the bootcamp in the format YYYY-MM-DD");
            String date_e=sc.next();
            LocalDate date_e1=LocalDate.parse(date_e);
            Bootcamp boot1=new Bootcamp();
            boot1.setName(name);
            boot1.setStartingDate(date_s1);
            boot1.setEndingDate(date_e1);
            arr.add(boot1);


        }

        System.out.println(arr);
//        System.out.println(arr.get(1).toString());
        System.out.println("Enter a date to check for a bootcamp in the format YYYY-MM-DD");
        String date=sc.next();
        LocalDate date_to_search=LocalDate.parse(date);
        //Bootcamp.setBootcamp(arr);
        Bootcamp_admin.setBootcamp(arr);
        Bootcamp_admin.searchdate(date_to_search);

    }

}
