# File Previewer

A Java console application that safely previews the first 5 lines of any user-specified text file. 

Demonstrates file I/O, exception handling, and automatic resource cleanup using `try-with-resources`.

---

## Features
- Prompts the user for a file path (e.g., `assets/sample.txt`)
- Opens the file using `java.io.File`
- Prints **up to five** lines of content from the top of the file
- Detects and reports:
    - Empty files
    - Missing / non-existent files
- Ensures resources close automatically via `try (Scanner fileScanner = ...)`

---

## Concepts Demonstrated
- Console input via `Scanner(System.in)`
- External file handling using `File` + `Scanner(file)`
- Exception handling via `catch (FileNotFoundException e)` 
- Bounded processing loop using a counter
- Clean, user-friendly CLI output formatting

---

## Files

### `FilePreview.java`
Main program logic and execution:
- Prompts the user for a path file
- Creates a `File` object and wraps it in a `Scanner`
- Detects and reports empty or missing files
- Prints file preview

### Example Text Files
Showcase the different outcomes of user-input file scanning:
- `assets/sample.txt` - file contains more than 5 lines; demonstrates limited file previewing
- `assets/empty.txt` - empty file; triggers `"This file is empty"` behavior
- `assets/missing.txt` - **intentionally omitted**; used to demonstrate FileNotFoundException handling

---

## How to Run
From the project root:

```bash
# Compile
javac -d out src/filepreviewer/FilePreview.java

# Run
java -cp out filepreviewer.FilePreview
```
When prompted, enter:

```bash
assets/sample.txt
assets/empty.txt
assets/missing.txt
```

## Example Interactions

### Sample File (<= 5 Lines Shown)

```text
File Previewer -
Enter file name: assets/sample.txt

Preview of assets/sample.txt:
Hello!
This is my example text file.
Its purpose is to test FilePreview.java.
If you are seeing this, that means it worked!
It will only show the first five lines of a file. Anything after this you will not see!
```

### Empty File
```text
File Previewer -
Enter file name: assets/empty.txt

Preview of assets/empty.txt:
This file is empty
```

### File Not Found
```text
File Previewer -
Enter file name: assets/missing.txt
Error: File not found.
```

