import java.util.Scanner;

public class GPACalculator{

 public static void main(String[] args) {
  
  Scanner scan = new Scanner(System.in);
  int class1Hrs, class1Score, class2Hrs,
  class2Score, class3Hrs, class3Score;
  double gpa;

  System.out.print("First class hours:  ");
  //taking user input from console for class1 hours
  class1Hrs = scan.nextInt();
  
  System.out.print("First class score:  ");
  //taking user input from console for class1 score
  class1Score = scan.nextInt();
  
  System.out.print("Second class hours:  ");
  //taking user input from console for class2 hours
  class2Hrs = scan.nextInt();
  
  System.out.print("Second class score:  ");
  //taking user input from console for class2 score
  class2Score = scan.nextInt();
  
  System.out.print("Third class hours:  ");
  //taking user input from console for class3 hours
  class3Hrs = scan.nextInt();
  
  System.out.print("Third class score:  ");
  //taking user input from console for class3 score
  class3Score = scan.nextInt();
  
  //calculating total Hours of class
  double totalHours = class1Hrs + class2Hrs + class3Hrs;
  
  //calculating total point of class, sum of each class hours multiplied by points
  double totalPoints = (class1Hrs * class1Score) +(class2Hrs * class2Score) + (class3Hrs * class3Score);
  
  //calculating gpa total points diving total hours
  gpa = totalPoints / totalHours;
  
  System.out.print("GPA: "+gpa);
  
 }
}