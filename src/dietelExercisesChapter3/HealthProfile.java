package dietelExercisesChapter3;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int dateOfBirth;
    private double height;
    private double weight;

    public HealthProfile(String firstName, String lastName, String gender, int dateOfBirth, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

//    public void setDateOfBirth(String dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
