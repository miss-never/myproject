class sarah{
    public static void main(String[] args){
        System.out.print("Enter the number:");
        scanner x = new scanner(System.in);
        if((x.nextint()% 2)== 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
