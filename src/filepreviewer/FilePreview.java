package filepreviewer;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePreview {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("File Previewer -"
                + "\nEnter file name: ");
        String filename = input.nextLine();
        
        File myFile = new File(filename);
                
        try (Scanner fileScanner = new Scanner(myFile)) {
            int lineCount = 0;
            
            ///display < 5 file lines
            System.out.println("\nPreview of " + myFile + ":");
            while (fileScanner.hasNextLine() && lineCount < 5) {
                System.out.println(fileScanner.nextLine());
                lineCount++;
            }
            
            ///empty file
            if (lineCount == 0) {
                System.out.print("This file is empty");
            }
            
            ///nonexistent file
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
        
        input.close();
    }
}
