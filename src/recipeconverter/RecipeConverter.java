package recipeconverter;

import java.util.Scanner;

public class RecipeConverter {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Recipe Conversion Calculator");
        System.out.println("The current yield is 48 cookies");
        
        int totalCookies;
        double sugar, butter, flour;
        double totalSugar, totalButter, totalFlour;
        
        sugar = 1.5;
        butter = 1;
        flour = 2.75;
        
        System.out.println("Current Recipe Requirements:");
        System.out.println("Sugar: " + sugar + " cups" + "\n" +
                           "Butter: " + butter + " cups");
        System.out.printf("Flour: %.2f cups%n", flour);
                          
        System.out.print("How many cookies would you like to make? ");
        totalCookies = keyboard.nextInt();
        
        double scale = totalCookies / 48.0;
        
        totalSugar = sugar * scale;
        totalButter = butter * scale;
        totalFlour = flour * scale;
        
        System.out.println("In order to make " + totalCookies + " cookies you will need:");
        System.out.printf("Sugar: %.2f cups%n", totalSugar);
        System.out.printf("Butter: %.2f cups%n", totalButter);
        System.out.printf("Flour: %.2f cups%n", totalFlour);
        
        System.out.println("\nGood luck! Have fun!");
        
        keyboard.close();
    }
}
