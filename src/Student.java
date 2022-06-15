import java.util.ArrayList;

public class Student extends User {
    String group;
    String profile;
    Integer studyYear;
    Boolean Integrally;
    ArrayList<Double> grades;

    public Student(String fullName, String birthDate, char gender, String group, String profile, Integer studyYear, Boolean integrally, ArrayList<Double>grades ) {
        super(fullName, birthDate, gender);
        this.group = group;
        this.profile = profile;
        this.studyYear = studyYear;
        this.Integrally = integrally;
        this.grades = grades;
    }

    public String getGroup() { return group; }
    public String getProfile() { return profile;}
    public Integer getStudyYear() { return studyYear;}
    public Boolean getIntegrally() { return null; }
    public ArrayList<Double> getGrades() {return grades; }

    public void setGroup( String group ) { this.group = group; }
    public void setProfile (String profile) { this.profile = profile;}
    public void setStudyYear (Integer studyYear) { this.studyYear = studyYear;}
    public void setIntegrally (Boolean integrally) {
    }
    public void setGrades (ArrayList<Double> grades) {this.grades = grades;}

    @Override
    public String toString() {
        return super.toString() +
                "\nGroup: " + this.group +
                "\nProfile: " + this.profile +
                "\nStudyYear: " + this.studyYear +
                "\nIntegrally: " + this.Integrally +
                "\nGrades: " + this.grades;
    }
}
