import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Interaction with the user using Scanner class
    Scanner sc = new Scanner(System.in);
    // Using the time user input as variable to control interaction mode
    int counter = 0;

    System.out.println("Hi, welcome to use the GradeCalculator. Let's calculate your final weighted grade");
    ExtendGradeCalculator gradeCalculator = new ExtendGradeCalculator();
    // input grades earned of each assignment in the class and their Point Total and perventage
    while (counter < 8) {
      counter++;
      System.out.print("The assignment " + counter + "'s Point Total (Please input Integer amount eg. 200): ");
      int totalPoint = sc.nextInt();
      System.out.print("The assignment " + counter + "'s Earned Points for the assignment (Please input Integer amount eg. 190): ");
      int earnedPoint = sc.nextInt();
      System.out.print("The assignment " + counter + "'s Percentage (Please input amount with decimal eg. 40.5, 87.0): ");
      double assignmentPercent = sc.nextDouble();
      gradeCalculator.addAssignment(earnedPoint, totalPoint, assignmentPercent);
    }
    // put all calculated grade together
    double finalGrade = gradeCalculator.getFinalWeightedGrade();
    String res = "";
    // output a letter grade based on the total
    if (finalGrade >= 90) {
      res = "A";
    } else if (finalGrade >= 80 && finalGrade < 90) {
      res = "B";
    } else if (finalGrade >= 70 && finalGrade < 80) {
      res = "C";
    } else if (finalGrade >= 60 && finalGrade < 70) {
      res = "D";
    } else {
      res = "F";
    }

    System.out.print("Your final grade is " + res);
  }
}
