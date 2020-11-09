//package Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bootcamp_admin {

    public static ArrayList<Bootcamp> Bootcamp;




    public static void setBootcamp(ArrayList<Bootcamp> bootcamp) {
        Bootcamp = bootcamp;
    }

    public static void searchdate (LocalDate date_search) {
        boolean found=false;
        for (int i=0;i<Bootcamp.size();i=i+1) {
            Bootcamp element= Bootcamp.get(i);
            //System.out.println(element.toString());
            int start=date_search.compareTo(element.getStartingDate());
            int end=date_search.compareTo(element.getEndingDate());
            //System.out.println(start);
            //System.out.println(end);
            if (start>0 && end<0) {
                found=true;
                System.out.println("there is a bootcamp available with the name "+element.getName()+
                        " starting at "+element.getStartingDate()+" and ending at "+element.getEndingDate());

            }
        }
        if (found==false) {
            System.out.println("Sorry no bootcamp available in " +date_search+ " date.");
        }

    }
}

