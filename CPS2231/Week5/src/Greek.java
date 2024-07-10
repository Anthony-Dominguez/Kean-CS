public class Greek {
    int i = 1;

    public int getI() {
        System.out.println("Super");
        return i;
    }

    public static void main(String[] args) {
        Greek ga = new Arabik();
        System.out.print(ga.i + " " + ga.getI());
    }
}

class Arabik extends Greek {
    int i = 2;

    @Override
    public int getI() {
        System.out.println("Sub");
        return i;
    }
}
