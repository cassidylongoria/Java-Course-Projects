# Rainfall Calculator

A Java console program that collects monthly rainfall data and reports yearly totals, averages, and the months containing minimum/maximum rainfall values.

Demonstrates arrays, defensive input validation, and basic object-oriented design.

## Features
- Prompts user to enter rainfall values for **12 months**
- Rejects negative values and re-prompts user for valid input
- Reports:
    - Total rainfall for the year 
    - Average monthly rainfall
    - Month with the highest average rainfall
    - Month with the lowest average rainfall
- Converts numeric month indexes into readable names (e.g., `3` -> `"March"`)

---

## Files

### `Rainfall.java`
Encapsulates the rainfall data and provides methods to compute:
- `getTotalRainfall()` - returns total rainfall
- `getAverageRainfall()` - returns yearly average
- `getMonthWithMostRain()` - returns name of the month with highest average
- `getMonthWithLeastRain()` - returns the name of the month with lowest average
- Internal `Month_Names[]` - array used to map index -> month name

Includes validation: 
- Requires **12** values are input
- Rejects **negative** rainfall (throws `IllegalArgumentException` if invalid value is input)

### `RainfallDemo.java`
Console-based driver program that: 
- Prompts user for 12 rainfall inputs
- Re-prompts when negative values are entered
- Creates a `Rainfall` object and prints results

---

## Concepts Demonstrated

- One-dimensional arrays (`double[]`)
- Input validation and error handling
- Loop enchancement
- Encapsulation & separation of concerns:
    - `Rainfall` - data + logic
    - `RainfallDemo` - user I/O

---

## How to Run
From the project root:

```bash 
# Compile
javac -d out src/rainfallcalculator/Rainfall.java src/rainfallcalculator/RainfallDemo.java

# Run
java -cp out rainfallcalculator.RainfallDemo

```
The program will then prompt the user to enter rainfall data, in inches, over the course of 12 months.

## Example Interaction

```text
Average Yearly Rainfall Calculator
Enter Monthly Rainfall in Inches: 
Month 1: .5
Month 2: 7
Month 3: 20
...
Month 12: .25

Calculations
Total rainfall for the year: 88.50 inches
The average monthly rainfall was 7.38 inches
March had the highest average rainfall
December had the lowest average rainfall

```
