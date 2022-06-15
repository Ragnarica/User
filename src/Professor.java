import java.util.ArrayList;

public class Professor extends User {
    String specialty;
    String subjects;
    Double hours;
    String city;
    String groups;

    public Professor(String fullName, String birthDate, char gender, String specialty, String subjects, Double hours, String city, ArrayList<String> groups) {
        super(fullName, birthDate, gender);
        this.specialty = specialty;
        this.subjects = String.valueOf(subjects);
        this.hours = hours;
        this.city = city;
        this.groups = String.valueOf(groups);

    }
    public String getSpecialty() {
        return specialty;
    }

    public String getSubjects() {
        return subjects;
    }

    public Double getHours() {
        return hours;
    }

    public String getCity() {
        return city;
    }
    public String getGroups() {return groups;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = String.valueOf(subjects);
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setGroups(ArrayList<String> groups) {
        this.groups = String.valueOf(groups);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSpeciality: " + this.specialty +
                "\nSubjects: " + this.subjects +
                "\nHours: " + this.hours +
                "\nCity: " + this.city +
                "\nGroups: " + this.groups;
    }
}
