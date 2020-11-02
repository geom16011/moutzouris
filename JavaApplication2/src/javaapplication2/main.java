package javaapplication2;
class Computer {
  Computer() {
    System.out.println("Constructor of Computer class.");
  }
  void computer_method() {
    System.out.println("Power gone! Shut down your PC soon...");
  }
}
class Laptop {
    private float x; 
    Laptop(float x){
        this.x=x;
  }
    private void get(){
    System.out.println(x);
}
    void laptop_method() {
        this.get();
        System.out.println("99% Battery available.");
  }
    public static void laptop_metho1(float x) {
    System.out.println(x);
  }
}
public class main {
    public static void main(String[] args) {
    Computer my = new Computer();
    Laptop your = new Laptop(2);
    my.computer_method();
    your.laptop_method();
    your.laptop_metho1(1);
  
  }
}
