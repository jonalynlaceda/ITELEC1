import java.util.Scanner;

public class Main {
    public static void checkGrade(int grade) {
        if (grade >= 75) {
            System.out.println("Your grade is " + grade + ". Congratulations! You Passed.");
        } else {
            System.out.println("Your grade is " + grade + ". Sorry, you Failed.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        int grade = scanner.nextInt();
        checkGrade(grade);
    }
}
