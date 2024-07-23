import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private String profilePicture;
    private ArrayList<String> blocked;
    private ArrayList<String> friends;

    public User(String username, String password, String profilePicture, ArrayList<String> blocked, ArrayList<String> friends) {
        this.username = username;
        this.password = password;
        this.profilePicture = profilePicture;
        this.blocked = blocked;
        this.friends = friends;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public ArrayList<String> getBlocked() {
        return blocked;
    }

    public ArrayList<String> getFriends() {
        return friends;
    }
}