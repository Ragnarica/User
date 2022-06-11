import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;
    private char gender;
    private int age;
    private String homeAddress;
    private String phoneNumber;
    private String email;

    public User(String fullName, String birthDate, char gender) {
        this.age = getUserAge(birthDate);
        this.gender = gender;

        ArrayList<String> name = splitNameIntoFirstAndLast(fullName);
        this.firstName = name.get(0);
        this.lastName = name.get(1);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserAge(String birthDate) {
        ArrayList<Integer> formattedBirthDate = convertDateToInt(birthDate);
        ArrayList<Integer> formattedCurrentDate = convertDateToInt(getCurrentDate());

        int age = 0;

        age = formattedCurrentDate.get(2) - formattedBirthDate.get(2);

        if (formattedCurrentDate.get(1) < formattedBirthDate.get(1)) {
            age--;
        } else if (formattedCurrentDate.get(1) == formattedBirthDate.get(1)) {
            if (formattedCurrentDate.get(0) < formattedBirthDate.get(0)) {
                age--;
            }
        }
        return age;
    }

    public String getCurrentDate() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentDate = date.format(formatter);
        return currentDate;
    }

    public ArrayList<Integer> convertDateToInt(String date) {
        ArrayList<Integer> splitDate = new ArrayList<>();
        String[] formattedDate = date.split("-");
        int day = Integer.parseInt(formattedDate[0]);
        int month = Integer.parseInt(formattedDate[1]);
        int year = Integer.parseInt(formattedDate[2]);

        splitDate.add(day);
        splitDate.add(month);
        splitDate.add(year);

        return splitDate;
    }

    public static ArrayList<String> splitNameIntoFirstAndLast(String name) {
        ArrayList<String> splitName = new ArrayList<>();
        String[] formattedName = name.split(" ");
        String firstName = formattedName[0];
        String lastName = formattedName[1];

        splitName.add(firstName);
        splitName.add(lastName);

        return splitName;
    }

    @Override
    public String toString() {
        return "First name: " + this.firstName +
                "\nLast name: " + this.lastName +
                "\nAge: " + this.age +
                "\nGender: " + this.gender;
    }
}
