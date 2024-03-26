package AssignmentArray;
import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
    public static void main(String [] args) {
        //define the arrays
        String[] firstNames = {"John", "Jane", "Mike", "Sarah", "Alex"};
        String[] lastNames = {"Doe", "Smith", "Brown", "Wilson", "Taylor"};

        //ask for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random names would you like to generate?");
        int numberOfNames = scanner.nextInt();

        //Initialize random object
        Random random = new Random();

        //generate and print names
        for (int i = 0; i < numberOfNames; i++) {
            int firstNameIndex = random.nextInt(firstNames.length);
            int lastNameIndex = random.nextInt(lastNames.length);
            String fullName = firstNames[firstNameIndex] + " " + lastNames[lastNameIndex];
            System.out.println(fullName);

        }
        //close the scanner
        scanner.close();
    }
}
