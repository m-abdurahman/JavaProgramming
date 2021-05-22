package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("CybertekStudent","abc123");
        System.out.println(login("CybertekStudent", "abc123"));

    }

    public static boolean login(String userName, String password){
        String secretUsername = "CybertekStudent";
        String secretPassword = "abc123";

        if (userName.equals(secretUsername) && password.equals(secretPassword)){
            return true;
        }else{
            return false;
        }
    }

    public static void loginVoid(String username, String password) {
        String secretUsername = "CybertekStudent";
        String secretPassword = "abc123";

        if (username.equals(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Login successful, welcome Cybertek");
        } else {
            System.out.println("Incorrect username or password");
        }

        boolean isLoginSuccess = login("Nadir", "moutain");
        System.out.println("isLoginSucess = " + isLoginSuccess);


    }


    }

