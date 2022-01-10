package day36;

public class Password {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if(password.equals("dd")){
            System.err.println("password to short");
            System.exit(0);
        }
        this.password = password;
    }

    public Password(String password) {
        setPassword(password);
    }

    public String toString() {
        return "Password{" +
                "password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Password password1 = new Password("dd");
        System.out.println(password1);




    }
}
