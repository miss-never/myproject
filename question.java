import java.util.Scanner;
public  class question{
    public static void main(String[] args){
    Scanner disho = new Scanner(System.in);

    System.out.print("Enter user name:");
    String name = disho.nextLine();
    System.out.print("Enter age:");
    int age = disho.nextInt();

      System.out.print("Hello, "+name+ "! You are "+age+" Years old.");


    
    }

}