# Java Course Projects

This repository contains selected Java console applications completed as a part of an introductory programming sequence. Each project demonstrates core Java concepts, including: user input handling, file I/O, arrays, conditional logic, arithmetic operations, and basic object-oriented design.

Each project is located within its own directory inside the `src/` folder and includes a dedicated `README.md` outlining the application purpose, features, demonstrated concepts, and execution instructions.

#### **Featured Project**: Recipe Converter - a dynamic scaling system for user-defined ingredients. (*see below*)

---

## Recipe Converter
A fully interactive Java console tool that allows users to dynamically scale the serving size of any recipe. Rather than using hard-coded ingredient values, this program collects custom recipe data- specific ingredient names, required amounts, and their units of measurement, storing the data via arrays. The program then calculates the adjusted ingredient requirements to fit the desired serving size using arithmetic scaling based on the original recipe yield and outputs a clean, formatted comparison between the original recipe and its scaled counterpart. 

This project is one of the strongest demonstrations of applied Java fundamentals in the repository, showcasing user-driven data entry, loop-based input handling, array storage, mathmematical computation, and well-structed console output.

- Folder: `src/recipeconverter/`
- Main Class: `RecipeConverter.java`
- Documentation: `src/recipeconverter/README.md`

---

## File Previewer
A console application that safely reads a user-specified file and previews its contents (displaying up to the first five lines). Demonstrates file handling, error-checking, and safe resource management using `try-with-resources`.

- Folder: `src/filepreviewer/`
- Main Class: `FilePreview.java`
- Assets:
    - `assets/sample.txt` - same file (>5 lines) used for preview demonstration
    - `assets/empty.txt` - blank file to demonstrate empty-file handling
- Documentation: `src/filepreviewer/README.md`

---

## Rainfall Calculator
An application that collected twelve months of rainfall data, validates the input, and reports total rainfall, average monthly rainfall, and the months containing minimum/maximum rainfall averages. Demonstrates arrays, loops, error checking, and separation of concerns through a multi-class design.

- Folder: `src/rainfallcalculator/`
- Classes:
    - `Rainfall.java` - encapsulates rainfall data and statistics
    - `RainfallDemon.java` - console driver with user interaction
- Documentation: `src/rainfallcalculator/README.md`

---

## Roulette Wheel Pocket Color
Determines the color (red, black, or green) of a roulette wheel pocket based on its number (0-36) using standard roulette rules. Demonstrates conditional logic, modular arithemetic, range-checking, and object-oriented design through a data class and console driver.

- Folder: `src/roulettewheel/`
- Classes:
    - `RoulettePocket.java` - encapsulates color-determination logic
    - `RouletteDemo.java` - user interface for pocket color lookup
- Documentation: `src/roulettewheel/README.md`

---

## How to Compile & Run (General Instructions)

From the repository root, **compile** program using:

```bash
javac -d out src/<project-name>/<MainClassName>.java
```

Then **run** using:
```bash
java -cp out <project-name>.<MainClassName>
```

**Example** *(Recipe Converter)*:
```bash
javac -d out src/recipeconverter/RecipeConverter.java
java -cp out recipeconverter.RecipeConverter
```

## Purpose & Learning Outcome
This repository reflects foundational Java programming skills, including:
- Console-based user interaction
- File I/O and exception handling
- Arrays and iterative processing
- Arithmetic operations on dynamic user input
- Conditional branching and modular logic
- Class design, encapsulation, and seperation of concerns