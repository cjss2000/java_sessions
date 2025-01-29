package homework.oop;

public class Author {

    private String firstName;
    private String lastName;
    private String email;
    private String biography;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email address");
        }
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    Author(String firstName, String lastName, String email, String biography) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.biography = biography;
    }

    private boolean validateEmail(String email) {
        return email.contains("@");
    }

    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }

    @Override
    public String toString() {
        return "Author Information: " + this.getFullName() + " Email: " + this.getEmail() + " Bio:"
            + this.getBiography();
    }
}
