package package2n1;

public class Author {
    private String email;
    private String mail;
    private char gender;

    public Author(String email, String mail, char gender) {
        this.email = email;
        this.mail = mail;
        this.gender = gender;
    }

    public Author(String email) {
        this.email = email;
    }

    public Author() {
    }

    @Override
    public String toString() {
        return "Author{" +
                "email='" + email + '\'' +
                ", mail='" + mail + '\'' +
                ", gender=" + gender +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
