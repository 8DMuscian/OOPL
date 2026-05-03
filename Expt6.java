class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

public class Expt6 {
    String user = "admin";
    String pass = "1234";

    public void authenticate(String username, String password) {
        try {
            if (username == null || password == null) {
                throw new NullPointerException("Username and password cannot be null.");
            }
            if (!username.equals(user) || !password.equals(pass)) {
                throw new InvalidCredentialsException("Incorrect username or password.");
            }
            System.out.println("Login successful.");
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidCredentialsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Error Log: " + e.toString());
        }
    }

    public static void main(String[] args) {
        Expt6 loginSystem = new Expt6();
        loginSystem.authenticate("admin", "wrong"); // Throws custom exception
        loginSystem.authenticate(null, "1234");     // Throws NPE
        loginSystem.authenticate("admin", "1234");  // Success
    }
}