package rainfallcalculator;

public class Rainfall {
    private double[] rainfall = new double[12];
    
    // Contruction
    public Rainfall(double[] monthlyRain) {
        if (monthlyRain.length != 12) {
            throw new IllegalArgumentException("Data Requirement: must include 1 year (12 months) of average monthly.");
        }
        
        // Validation
        for (int i = 0; i < 12; i++) {
            if (monthlyRain[i] < 0) {
                throw new IllegalArgumentException("Monthly rainfall cannot be negative" + (1 + 1));
            }  
            rainfall[i] = monthlyRain[i];   
        }      
    }
    
    // Mapes 0-based month indices (0=January ... 11=December) to month names
    private static final String[] Month_Names = {
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"
    };
    
    // Calculate Total Rainfall
    public double getTotalRainfall() {
        double total = 0;
        for (double month : rainfall) {
            total += month;
        }
        return total;
    }
    
    // Calculate Average Monthly Rainfall
    public double getAverageRainfall() {
        return getTotalRainfall() / rainfall.length;
    }

    // Highest Monthly Rainfall
    public String getMonthWithMostRain() {
        int maxMonth = 0;
        for (int i = 1; i < rainfall.length; i++) {
            if (rainfall[i] > rainfall[maxMonth]) {
                maxMonth = i;
            }
        }
        return Month_Names[maxMonth];
    }
    
    // Lowest Monthly Rainfall
    public String getMonthWithLeastRain() {
        int minMonth = 0;
        for (int i = 1; i < rainfall.length; i ++) {
            if (rainfall[i] < rainfall[minMonth]) {
                minMonth = i;
            }
        }
        return Month_Names[minMonth];
    }
}