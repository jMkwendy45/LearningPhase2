import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("This is a multplication table");
        System.out.print("\nEnter the number you want to print: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.close();
        System.out.println("==================================================");

        int count =1;
        while (count<13){
            System.out.printf("%d \t X \t %d  = \t%2d \n", number,count,(number*count));
            count++;
        }
    }

}
