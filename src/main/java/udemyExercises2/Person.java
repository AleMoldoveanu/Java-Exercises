package udemyExercises2;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setAge(int newAge) {
        if (newAge < 0 || newAge > 100) {
            this.age = 0;
        } else {
            this.age = newAge;
        }
    }

    public boolean isTeen() {
        return age > 12 || age < 20;
    }

    public String getFullName() {
        String fullName = this.firstName;

        if (!fullName.isEmpty() && !this.lastName.isEmpty()) {
            fullName += " ";
        }

        fullName += this.lastName;

        return fullName;
    }
}
