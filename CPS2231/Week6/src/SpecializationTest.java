class Specialization {
  private String name;

  public Specialization(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Specialization: " + name;
  }
}

class Doctor {
  private String name;
  private Specialization[] specializations;

  public Doctor(String name, Specialization[] specializations) {
    this.name = name;
    this.specializations = specializations;
  }

  public String getName() {
    return name;
  }

  public Specialization[] getSpecializations() {
    return specializations;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Doctor name: ").append(name).append("\n");

    for (Specialization s : specializations) {
      sb.append(s.toString()).append("\n");
    }
    return sb.toString();
  }
}

public class SpecializationTest {
  public static void main(String[] args) {
    Specialization specialization1 = new Specialization("Cardiology");
    Specialization specialization2 = new Specialization("Neurology");
    Specialization specialization3 = new Specialization("Oncology");
    Specialization[] specializations = {specialization1, specialization2, specialization3};
    Doctor doctor = new Doctor("Dr. John Doe", specializations);
    System.out.println(doctor);
  }
}
