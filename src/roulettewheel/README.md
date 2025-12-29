# Roulette Wheel Pocket Color

A Java console application that determines the color of a roulette wheel pocket based on its numberic value (0-36).

Implements standard roulette rules to classify pockets as **red**, **black**, or **green**, and demonstrates conditional branching and object-oriented design.

---

## Features
- Prompts user to enter a roulette pocket number
- Validates that the input is within range (`0-36`)
- Applies roulette rules: 
    - `0` -> **green**
    - `1-10`:
        - odd -> **red**
        - even -> **black**
    - `11-18`:
        - odd -> **black**
        - even -> **red**
    - `19-28`:
        - odd -> **red**
        - even -> **black**
    - `29-36`:
        - odd -> **black**
        - even -> **red**
- Prints the result as:

    `Pocket <number> is <color>.`

- If the number input is outside the range `0-36`, an **invalid input** message is returned.
    
    `"Error: pocket number must be between 0-36"`

---

## Files

### `RoulettePocket.java`
Encapsulates a single roulette pocket and its number.

Provides:
- `RoulettePocket(int pocketNumber)` - constructor that stores the given pocket number
- `getPocketColor()` - returns a `String` indicating pocket color ( `"green"`, `"red"`, `"black"` ), or an error message for invalid input

### `RouletteDemo.java`
Console-based driver that.
- Reads user input using `Scanner`
- Creates a `RoulettePocket` object
- Calls `getPocketColor()` and prints the result

---

## Concepts Demonstrated

- Conditional logic ( `if` / `else if` / `else` ) 
- Range checks ( `>=` / `<=`) and compound conditions (`&&`)
- Modulo operator (`%`) to distinguish even vs. odd values
- Object-oriented design:
    - Data encapsulation with a private field (`pocketNumber`)
    - Public method exposing behavior (`getPocketColor`)
- Separation of concerns:
    - `RoulettePocket` - logic + data
    - `RouletteDemo` - user I/O

---

## How to Run

From the project root:

```bash
# Compile
javac -d out src/roulettewheel/RoulettePocket.java src/roulettewheel/RouletteDemo.java

# Run
java -cp out roulettewheel.RouletteDemo

```
This will prompt user to enter a pocket number between 0 and 36

## Example Interaction

```text
Enter Roulette Pocket Number: 0
Pocket 0 is green.

Enter Roulette Pocket Number: 13
Pocket 13 is black.

Enter Roulette Pocket Number: 16
Pocket 16 is red.

Enter Roulette Pocket Number: 37
Pocket 37 is invalid.
Error: pocket number must be between 0-36
```
