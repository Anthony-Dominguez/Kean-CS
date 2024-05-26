public class Ch1Q2 {
    public static void main(String[] args) {
        System.out.println("Anthony Dominguez, 01,17,2024");
        System.out.println("");
        // input time 45m 30s so its 45.5 and length 14(km)
        double time = 45.5;
        int dkm = 14;

        // covert km to miles conversion is 1.609
        double convert = 1.6;
        double dmiles = dkm/convert;

        // speed average = d/t * 60 since its in miles per minute.
        System.out.println("Mph : " + (dmiles/time)*60);

    }
}
