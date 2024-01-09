package lab9.L9Q2;

public class PersonProfile {
    private String name;
    private String gender;
    private String dateOfBirth;

    public PersonProfile(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }
    public String toString(){
        return "Name: "+name+"\nGender: "+gender+"\nDate of Birth: "+dateOfBirth;
    }

}
