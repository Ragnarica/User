public class Student extends User {
    String group;

    public Student(String fullName, String birthDate, char gender, String group) {
        super(fullName, birthDate, gender);
        this.group = group;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nGroup: " + this.group;
    }
}
