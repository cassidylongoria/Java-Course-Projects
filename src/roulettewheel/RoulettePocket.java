package roulettewheel;

public class RoulettePocket {
    private int pocketNumber;
    
    public RoulettePocket(int pocketNumber) {
        this.pocketNumber = pocketNumber;
    }
    public String getPocketColor() {
        if (pocketNumber < 0 || pocketNumber > 36) {
            return "invalid. \nError: pocket number must be between 0-36";
        }

        if (pocketNumber == 0) {
            return "green";
        } else if (pocketNumber >= 1 && pocketNumber <= 10) {
            if (pocketNumber %2 == 0) {
                return "black";
            } else {
                return "red";
            }
        } else if (pocketNumber >= 11 && pocketNumber <= 18) {
            if (pocketNumber %2 == 0) {
                return "red";
            } else {
                return "black";
            }
        } else if (pocketNumber >= 19 && pocketNumber <= 28) {
            if (pocketNumber %2 == 0) {
                return "black";
            } else {
                return "red";
            }
        } else {
            if (pocketNumber % 2 == 0) {
                return "red";
            } else {
                return "black";
            }
        }
    }    
}
