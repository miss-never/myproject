import java.util.Scanner;
class circle{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in); 
      System.out.print("Enter radius of the circle:");
      int r = input.nextInt();
      double pie = 3.14159; 
      double diameter = 2*r;
      double circumference = 2*pie*r;
      double area = pie*r*r;
      System.out.println("diameter:" + diameter);
      System.out.println("circumference:" + circumference);
      System.out.println("area:" + area);
      input.close();
    }
}