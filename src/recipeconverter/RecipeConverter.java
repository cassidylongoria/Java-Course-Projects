package recipeconverter;

import java.util.Scanner;

public class RecipeConverter {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Recipe Conversion Calculator");
        
        // Recipe Requirements
        System.out.print("How many servings does the original recipe make? ");
        int originalYield = keyboard.nextInt();
        
        System.out.print("How many servings would you like it to yield? ");
        int desiredYield = keyboard.nextInt();
        double scale = (double) desiredYield / originalYield;
        
        System.out.print("How many ingredients are in this recipe? ");
        int ingredientCount = keyboard.nextInt();
        keyboard.nextLine();  
        
        if (ingredientCount < 1) {
                System.out.println("Error: Recipe must contain at least 1 ingredient.");
                keyboard.close();
                return;
        }
    
        // Value Assignment
        String[] names = new String[ingredientCount];
        String[] units = new String[ingredientCount];
        double[] amounts = new double[ingredientCount];
        
        // Ingredient Input
        for (int i = 0; i < ingredientCount; i++) {
            System.out.print("What is Ingredient #" + (i + 1) + ": ");
                names[i] = keyboard.nextLine();             
                
            System.out.print("Unit of Measurement");
                units[i] = keyboard.nextLine();

            System.out.print("Enter required amount: ");
                amounts[i] = keyboard.nextDouble();
                keyboard.nextLine();
                
        }
        
        // ---- Original Recipe Output ----
            System.out.println("\nCurrent Recipe Requirements:");
            System.out.println("Recipe yields: " + originalYield + " servings");
            System.out.println("Total Ingredients: " + ingredientCount);
            
            System.out.print("Ingredients Required: \n");
            for (int i = 0; i < ingredientCount; i++) {
                System.out.printf("%s: %.2f %s%n", names[i], amounts[i], units[i]);
            }

        // ---- Scaled Recipe Output ----
            System.out.println("\nScaled Recipe (for " + desiredYield + " servings): ");
            for (int i = 0; i < ingredientCount; i++) {
                System.out.printf("%s: %.2f %s%n", names[i], amounts[i] * scale, units[i]);
            }
            
            System.out.println("\nGood luck! Have fun!");
        
        keyboard.close();
    }
}