package homework;

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
        this.email = email;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    Author(String firstName, String lastName, String email, String biography){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.biography = biography;
    }
    private void validateEmail(String email){

    if (email.contains("@")){
            System.out.println("email is a valid address " + email);
        } else {
        System.out.println("invalid email format");
    }
    }

    public String getFullName(){
    String fullName = null;
    fullName = this.getFirstName() + " " + this.getLastName();
    return fullName;
    }

}
