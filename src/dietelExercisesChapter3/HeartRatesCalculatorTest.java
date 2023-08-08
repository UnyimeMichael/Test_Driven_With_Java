package dietelExercisesChapter3;

public class HeartRatesCalculatorTest {

    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public HeartRatesCalculatorTest(String firstname, String lastName, String dateOfBirth) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        String yearOfBirth = "";
        for (int index = dateOfBirth.length()-4; index < dateOfBirth.length() ; index++){
            char numericCharacter = dateOfBirth.charAt(index);
            yearOfBirth = yearOfBirth + numericCharacter;
        }
        int year = Integer.parseInt(yearOfBirth);
        return 2023-year;
    }
}
