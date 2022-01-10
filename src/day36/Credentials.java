package day36;

public class Credentials {

    private String username,password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if(password.length()<8){
            System.err.println("password need to be at least 8 characters");
            System.exit(0);
        }

        if(password.contains(" ")){
            System.err.println("password can not contain any spaces");
            System.exit(0);
        }
        boolean hasLetter = false;
        boolean hasSpecChar = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {

            if(Character.isLetter(password.charAt(i))){
                hasLetter=true;

            }

            if(!Character.isLetterOrDigit(password.charAt(i))){
                hasSpecChar=true;

            }

            if(Character.isDigit(password.charAt(i))){
                hasDigit=true;

            }

        }

        if(hasLetter == false){
            System.err.println("password must contain a letter");
            System.exit(0);
        }
        if(hasSpecChar==false){
            System.err.println("password must contain special char");
            System.exit(0);
        }
        if(hasDigit==false){
            System.err.println("password must contain digit");
        }




        this.password = password;
    }

    public boolean isStrongPassWord(){

        boolean isStrongPassword= false;

        boolean hasEightChars= false;
        if(password.length()>=8){
            hasEightChars=true;
        }
        boolean hasNoSpace= false;
        if(!password.contains(" ")){
            hasNoSpace=true;
        }
        boolean hasSpecialChar= false;
        boolean hasLetter= false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            if(Character.isLetter(password.charAt(i))){
                hasLetter= true;
            }else if(Character.isDigit(password.charAt(i))){
                hasDigit= true;
            }else {
                hasSpecialChar= true;
            }

        }

        if(hasEightChars&& hasNoSpace&& hasDigit&& hasLetter&& hasSpecialChar){
            isStrongPassword= true;
        }

        return isStrongPassword;


    }

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }


    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", is strong password ='" + isStrongPassWord() + '\'' +
                '}';
    }

    public static void main(String[] args) {


        Credentials credentials1 = new Credentials("Dimo","ddddddd1#");
        System.out.println(credentials1);


    }
}
