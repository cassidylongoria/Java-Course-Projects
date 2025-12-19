package testscores;

import java.util.Scanner;

public class TestScores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        double[] scores = new double[5];
    System.out.print("Test Score Average Calculator\n");
    
    // input Test Scores
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter score for test " + (i + 1) + ": ");
            scores[i] = input.nextDouble();
    }
    
    // Display score grades
    System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-\n"
                     + "Test Scores and Grades: ");
    for (int i = 0; i < 5; i++) {
        char grade = determineGrade(scores[i]);
        System.out.printf("Test %d: %.2f\tGrade: %c%n", (i + 1), scores[i], grade);
    }
    
    // Calculate and display averages
    double average = calcAverage(scores[0], scores[1], scores[2], scores[3], scores[4]);
    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-");
    System.out.printf("%nAverage Score: %.2f%n", average);
    System.out.printf("Overall Grade: %c%n", determineGrade(average));
    
    input.close();
    }

public static double calcAverage(double s1, double s2, double s3, double s4, double s5) {
    return (s1 + s2 + s3 + s4 + s5) / 5.0;
}

public static char determineGrade(double score) {
    if (score >= 90)
        return 'A';
    else if (score >= 80)
        return 'B';
    else if (score >= 70)
        return 'C';
    else if (score >= 60)
        return 'D';
    else
        return 'F';
}
}
