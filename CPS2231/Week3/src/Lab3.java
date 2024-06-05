public class Lab3 {

    private static int[][] tempArray = new int[2][12]; // declare and initialize

    public static void getData() {
        int[] highTemps = {30, 40, 45, 60, 70, 90, 89, 95, 79, 90, 70, 40}; // array 1D
        int[] lowTemps = {10, -10, 20, 30, 50, 75, 85, 79, 50, 80, 30, 20}; // array 1D

        for (int i = 0; i < 12; i++) { // stores both array into an 2D array
            tempArray[0][i] = highTemps[i];
            tempArray[1][i] = lowTemps[i];
        }
    }

    public static double averageHigh() { // calculate the average of the first (high)
        int sum = 0;
        for (int temp : tempArray[0]) {
            sum += temp;
        }
        return (double) sum / tempArray[0].length; // cask to double for more accurate answer
    }

    public static double averageLow() { // calculate the average of the second (low)
        int sum = 0;
        for (int temp : tempArray[1]) {
            sum += temp;
        }
        return (double) sum / tempArray[1].length;// cask to double for more accurate answer
    }
    public static int indexHighTemp() { // linear search loop
        int maxIndex = 0;
        int maxTemp = tempArray[0][0]; // looking in first array
        for (int i = 1; i < tempArray[0].length; i++) {
            if (tempArray[0][i] > maxTemp) {
                maxTemp = tempArray[0][i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static int indexLowTemp() { // linear search loop
        int minIndex = 0;
        int minTemp = tempArray[1][0]; // looking in second array
        for (int i = 1; i < tempArray[1].length; i++) {
            if (tempArray[1][i] < minTemp) { // just flipped to less than
                minTemp = tempArray[1][i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void main(String[] args) {
        getData();
        System.out.println("Average High Temperature: "+averageHigh());
        System.out.println("Average Low Temperature: "+averageLow());
        System.out.println("Highest Temperature index: "+indexHighTemp());
        System.out.println("Lowest Temperature index: "+indexLowTemp());

    }
    }