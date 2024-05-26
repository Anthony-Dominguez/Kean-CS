public class Assignment1 {

    public static void main(String[] args) {

                double birth = (float)(60.0*60.0*24.0*365.0)/7.0;
                double death = (60.0*60.0*24*365.0)/13.0f;
                double new_i = (60.0*60.0*24.0*365.0)/45.0f;
                double population = 312_032_486.0f;
//      math
                double allrates = birth+new_i-death;
//      My logic
                System.out.println("Population after 1 year: " + population + 2*allrates);
                System.out.println("Population after 2 year: " + population + 2*allrates);
                System.out.println("Population after 3 year: " + population + 3*allrates);
                System.out.println("Population after 4 year: " + population + 4*allrates);
                System.out.println("Population after 5 year: " + population + 4*allrates);

//      Correct answer
                System.out.println((((60.0*60.0*24.0*365.0)/7.0)-((60.0*60.0*24*365.0)/13.0)+((60.0*60.0*24.0*365.0)/45.0))+312_032_486.0);
                System.out.println((((60.0*60.0*24.0*365.0)/7.0)-((60.0*60.0*24*365.0)/13.0)+((60.0*60.0*24.0*365.0)/45.0))*2+312_032_486.0);
                System.out.println((((60.0*60.0*24.0*365.0)/7.0)-((60.0*60.0*24*365.0)/13.0)+((60.0*60.0*24.0*365.0)/45.0))*3+312_032_486.0);
                System.out.println((((60.0*60.0*24.0*365.0)/7.0)-((60.0*60.0*24*365.0)/13.0)+((60.0*60.0*24.0*365.0)/45.0))*4+312_032_486.0);
                System.out.println((((60.0*60.0*24.0*365.0)/7.0)-((60.0*60.0*24*365.0)/13.0)+((60.0*60.0*24.0*365.0)/45.0))*5+312_032_486.0);
            }
        }