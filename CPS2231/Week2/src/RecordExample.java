public class RecordExample {

    public record Person(String firstName,String lastName ,int age) {
        // no need to write constructors letter setter equals hash code or toString

    }
    public static void main(String[] args) {
        Person person1 = new Person("John", "Smith", 25);
        Person person2 = new Person("Jane", "Doe", 30);


        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
        System.out.println("Are they equal? "+ person1.equals(person2));


    }
}

