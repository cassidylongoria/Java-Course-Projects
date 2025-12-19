package roulettewheel;

import java.util.Scanner;

public class RouletteDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter Roulette Pocket Number: ");
        int number = input.nextInt();
        
        RoulettePocket pocket = new RoulettePocket(number);
        String color = pocket.getPocketColor();
        
        System.out.println("Pocket " + number + " is " + color + ".");
        
        input.close();
    }
}
