import java.util.Scanner;
public class Survey{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("what is your name:");
       String name = scan.nextLine();
        System.out.println("How old are you :");
        int age =scan.nextInt();
        System.out.println("Where are you working :");
        scan.nextLine();
       String place = scan.nextLine();
        System.out.println("What is your salary :");
        double salary = scan.nextDouble();
        System.out.println("Do you like parotta:");
        scan.nextLine();
        String likes = scan.nextLine();

        System.out.println("This is biodata");
    }
}