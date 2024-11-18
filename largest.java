import java.util.Scanner;
class largest{
      public static void main(String[] args){

    
    
      Scanner seba = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = seba.nextInt();

        System.out.print("Enter the Second number: ");
        int y = seba.nextInt();
        System.out.print("Enter the third number:");
        int z = seba.nextInt();
        int sum= x + y + z;
        double average=sum/3.0;
        int product= x * y *z;
        int smallest = Math.min(x,Math.min(y,z));
        int largest = Math.max(x,Math.max(y,z));
        System.out.println("sum:" + sum);
        System.out.println("average:" + average);
        System.out.println("product:" + product);
        System.out.println("smallest:" + smallest);
        System.out.println("largest:" + largest);
        seba.close();

}
}