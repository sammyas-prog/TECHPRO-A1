import java.util.Scanner;
public class SeatworkThirteen {
  
  //Method 1: Grade based on percentage (e.g., 85%)
  public static String calculateGrade(double percentage) {
    if (percentage >= 90) return "A";
    else if (percentage >= 80) return "B";
    else if (percentage >= 70) return "C";
    else if (percentage >= 60) return "D";
    else return "F";
  }
  
  // Method 2: Grade based on raw score
  public static String calculateGrade(int score, int maxScore) {
    double percentage = (double) score / maxScore * 100;
    return calculateGrade(percentage); // reuse M1
  }
  
  // Method 3: Grade based on average of multiple subject
  public static String calculateGrade(double[] subjectScores) {
    double total = 0;
    for (double score : subjectScores) {
      total += score;
    }
    double average = total / subjectScores.length;
    return calculateGrade(average); // reuse M1
    }
    
    public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      // Example !: Grade by percentage
      System.out.print("Enter percentage score: ");
      double percent = scanner.nextDouble();
      System.out.println("Grade: " + calculateGrade(percent));
      
      // Example 2: Grade by raw score
      System.out.print("\nEnter raw score: ");
      int score = scanner.nextInt();
       System.out.print("Enter maximum score: ");
      int max = scanner.nextInt();
       System.out.print("Grade: " + calculateGrade(score, max));
       
       // Example 3 : Grade by multiple subject
      System.out.print("\nEnter number of subject: ");
      int numSubjects = scanner.nextInt();
      double[] subjects = new double [numSubjects];
      
      for (int i = 0; i < numSubjects; i++) {
        System.out.print("Enter score for subject " + (i + 1) + ": ");
        subjects[i] = scanner.nextDouble();
      }
      
      System.out.println("Final Grade: " + calculateGrade(subjects));
      
      scanner.close();
      
  }
}
