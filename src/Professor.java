
public class Professor extends User {
    String specialty;

    public Professor(String fullName, String birthDate, char gender, String specialty) {
        super(fullName, birthDate, gender);
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSpeciality: " + this.specialty;
    }
}
