//package excercise2_bootcamp;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bootcamp {
    private String name;
    private LocalDate startingDate;
    private LocalDate endingDate;
    private static ArrayList Bootcamp;

    @Override
    public String toString() {
        return "Bootcamp{" +
                "name='" + name + '\'' +
                ", startingDate=" + startingDate +
                ", endingDate=" + endingDate +
                '}';
    }

    Bootcamp(String nm, LocalDate st_date, LocalDate end_date){
        name=nm;
        startingDate=st_date;
        endingDate=end_date;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public static ArrayList getBootcamp() {
        return Bootcamp;
    }

    public static void setBootcamp(ArrayList bootcamp) {
        Bootcamp = bootcamp;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }

    public static void searchdate (LocalDate date_search) {
        for (int i=0;i<Bootcamp.size();i=i+1) {
            Bootcamp element= (excercise2_bootcamp.Bootcamp)Bootcamp.get(i);
            int start=date_search.compareTo(element.getStartingDate());
            int end=date_search.compareTo(element.getEndingDate());
            //System.out.println(start);
            //System.out.println(end);
            if (start>0 && end<0) {
                System.out.println("there is a bootcamp available with the name "+element.getName()+
                        " starting at "+element.getStartingDate()+" and ending at "+element.getEndingDate());

            }
        }
    }

}
