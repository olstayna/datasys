package datasys;

public class UserSession {
    private static UserSession instance;
    private String loggedInUser;

    private UserSession() {
        // Construtor privado para evitar instanciação direta.
    }

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public void setLoggedInUser(String username) {
        loggedInUser = username;
    }

    public String getLoggedInUser() {
        return loggedInUser;
    }

    public boolean isLoggedIn() {
        return loggedInUser != null;
    }

    public void logout() {
        loggedInUser = null;
    }
}