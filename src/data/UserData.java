package data;

/**
 * Created by Alycha on 11/24/2015.
 */
public class UserData {
    private String login;
    private String email;
    private String password;

    public UserData (String login, String password){
        this.login = login;
        this.email = login + "@gmail.com";
        this.password = password;
    }

    public String getLogin(){
        return login;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }
}
