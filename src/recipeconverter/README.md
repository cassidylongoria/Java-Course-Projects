# Recipe Converter

A Java console application that converts recipe ingredient quantities based on user-specific serving size.

Demonstrated structured input collection, scaling calculations, and clean CLI formatting.

---

## Features

- Prompts user for:
    - Original recipe yield
    - Desired serving size
    - Number of ingredients
    - Ingredient names, measurement units (cups, tbsp, units, etc.), and required amounts
- Calculates and displays:
    - Original recipe summary
    - Scaled ingredient quantities
- Supports both increasing or decreasing recipe yields 

---

## Files

### `RecipeConverter.java`
Main program logic:
- Uses `Scanner` to collect structured input
- Stores variable-length data using `String[]` and `double[]`
- Computes scaling using ( `desiredYield / originalYield` )
- Outputs formatted results using `System.out.printf()`
- Closes input resource when execution completes

---

## Concepts Demonstrated

- Console input via `Scanner`
- Using `String[]` and `double[]` arrays to store variable-length input
- Arithmetic scaling using ( `amount[i] * scale` )
- Looping over multi-variable processing
- Clean, formatted CLI output using `System.out.printf()`

---

## How to Run

From the project root:

```bash
# Compile
javac -d out src/recipeconverter/RecipeConverter.java

# Run
java -cp out recipeconverter.RecipeConverter

```
The program will then prompt the user to enter ingredient requirements, original recipe yield, and desired scaled serving size. 

## Example Interaction

```text
Recipe Conversion Calculator
How many servings does the original recipe make? 6
How many servings would you like it to yield? 20
How many ingredients are in this recipe? 4
What is Ingredient #1: Flour
Unit of Measurement: cups
Enter required amount: 2
What is Ingredient #2: Eggs
Unit of Measurement: units
Enter required amount: 1
What is Ingredient #3: Salt
Unit of Measurement: tsp
Enter required amount: 1.5
What is Ingredient #4: Sugar
Unit of Measurement: cups
Enter required amount: 1.75

Current Recipe Requirements:
Recipe yields: 6 servings
Total Ingredients: 4
Ingredients Required: 
Flour: 2.00 cups
Eggs: 1.00 units
Salt: 1.50 tsp
Sugar: 1.75 cups

Scaled Recipe (for 20 servings): 
Flour: 6.67 cups
Eggs: 3.33 units
Salt: 5.00 tsp
Sugar: 5.83 cups

Good luck! Have fun!
