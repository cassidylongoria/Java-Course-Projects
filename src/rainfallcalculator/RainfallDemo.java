package rainfallcalculator;

import java.util.Scanner;

public class RainfallDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] monthlyRain = new double[12];
        
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_"
                        + "\nAverage Yearly Rainfall Calculator"
                        +  "\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n"
                        + "\nEnter Monthly Rainfall in Inches:");
       
        // Input Average Rainfall
        for (int i = 0; i < 12; i++) {
            do {
                System.out.print("Month " + (i + 1) + ": ");
                monthlyRain[i] = input.nextDouble();
                
                if (monthlyRain[i] < 0) {
                    System.out.println("Error: Rainfall cannot be negative. Please re-enter average.");
                }
            } while (monthlyRain[i] < 0);
        }
    
    Rainfall rainfallData = new Rainfall(monthlyRain);    
    
    // Display Results
    System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_"
            + "\n\tCalcuations"
            +  "\n-_-_-_-_-_-_-_-_-_-_-_-_-_-");
    System.out.printf("\nTotal rainfall for the year: %.2f inches", rainfallData.getTotalRainfall());
    System.out.printf("\nThe average monthly rainfall was %.2f inches", rainfallData.getAverageRainfall());
    System.out.printf("\n" + rainfallData.getMonthWithMostRain() + " had the highest average rainfall");
    System.out.printf("\n" + rainfallData.getMonthWithLeastRain() + " had the lowest average rainfall");
    
    input.close();
    }
}