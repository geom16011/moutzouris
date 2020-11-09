//package Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bootcamp {
    private String name;
    private LocalDate startingDate;
    private LocalDate endingDate;




    @Override
    public String toString() {
        return "Bootcamp{" +
                "name='" + name + '\'' +
                ", startingDate=" + startingDate +
                ", endingDate=" + endingDate +
                '}';
    }
    Bootcamp() {

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

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }



}
