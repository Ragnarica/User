import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String speciality = "";
        ArrayList<String> subjects = new ArrayList<>();
        Double hours = 2.5;
        String city = "";
        ArrayList<String> groups = new ArrayList<>();

        subjects.add("Math");
        subjects.add("Sport");
        subjects.add("Programming");
        System.out.println(subjects);
        System.out.println(speciality);
        System.out.println(hours);
        System.out.println(city);
        System.out.println(groups);


        Professor myProfessor = new Professor("Florea Florin", "10-09-1800", 'M', "Networking", speciality, hours, city, groups);
        System.out.println(myProfessor);

            String profile = "";
            Integer studyYear = new Integer[];
            Boolean integrally = new Boolean;
            ArrayList<Double> grades = new ArrayList<Double>();

        System.out.println(profile);
        System.out.println(studyYear);
        System.out.println(integrally);
        System.out.println(grades);

            Student myStudent = new Student("Vlad Ionescu", "10-10-1997", 'M', "LF12IDIF", profile, studyYear, integrally, grades);
        System.out.println(myStudent);

    }
}
