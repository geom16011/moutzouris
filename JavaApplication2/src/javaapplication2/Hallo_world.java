package javaapplication2;

import java.util.Scanner;

public class Hallo_world {
    
    public static int sum1=0;
    public static float average=0;
    
    public  int sum2=0;
    public  float average1=0;

    public static void stats(int num1,int num2){
        
        average=(num1+num2)/(float)2;   
        sum1=num1+num2;     
    }

    public void stats1(int num1,int num2){
        
        average1=(num1+num2)/(float)2;   
        sum2=num1+num2;     
    }   
    
    
    public static void main (String[] args) {
        System.out.println("Give first number");
        Employee[] obj = new Employee[2] ;

        //create actual employee object
        obj[0] = new Employee();
        obj[1] = new Employee();

        //assign data to employee objects
        obj[0].setData(100,"ABC");
        obj[1].setData(200,"XYZ");

        //display the employee object data
        System.out.println("Employee Object 1:");
        obj[0].showData();
        System.out.println("Employee Object 2:");
        obj[1].showData();
        Scanner sc1=new Scanner(System.in);
        int num1=sc1.nextInt();
        System.out.println("Give second number");
        int num2=sc1.nextInt();
        stats(num1,num2);
        System.out.println("sum is "+sum1);
        System.out.println("average is " +average);
        
        Hallo_world test=new Hallo_world();
        test.stats1(num1,num2);
        System.out.println("sum is "+test.sum2);
        System.out.println("average is " +test.average1);
    }
}

class Employee{
    int empId;
    String name;
    public void setData(int c,String d){
        empId=c;
        name=d;
     }
    public void showData(){
        System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
        System.out.println();
     }
}