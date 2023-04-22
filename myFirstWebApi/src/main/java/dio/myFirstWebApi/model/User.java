package dio.myFirstWebApi.model;
public class User {
    private int id;
    private String login;
    private String password;
    public User(String login, String password) {
        if (login == null || login.isEmpty()) {
            throw new IllegalArgumentException("Login cannot be null");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null");
        }
        this.login = login;
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
