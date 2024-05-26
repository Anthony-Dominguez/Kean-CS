class Kean {

    private static int studentCount;
    private final static String DEFAULT_MAJOR = "Computer Science";
    private String name;
    private String major;
    private Kean[] keans;

    public Kean() {
        this("Tony" , DEFAULT_MAJOR);

    }
    public Kean(String name, String major) {
        this.name = name;
        this.major = major;
        studentCount++;

    }
    public Kean(Kean other) {
        this.name = other.name;
        this.major = other.major;
        studentCount++;
    }
    public static int getStudentCount() {
        return studentCount;
    }
    public String getName() {
        return name;

    }
    public String getMajor() {
        return major;

    }
    public void setMajor(String major) {
        this.major = major;

    }
    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);

    }
}
public class KeanUniversity{
    public static void main(String[] args) {

        Kean[] keans = new Kean[3];
        keans[0] = new Kean();
        keans[1] = new Kean("Anthony" , "Math");
        keans[2] = new Kean(keans[1]);

            System.out.println("Number of students: " + Kean.getStudentCount());


            for(Kean kean : keans){
                System.out.println("Name: " + kean.getName() + " Major: " + kean.getMajor());

            }




    }
}


// underline means in static
