package userManagement;
public class User {
    private String userName;
    private String password;
    private  String MailId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMailId() {
        return MailId;
    }

    public void setMailId(String eMailId) {
        this.MailId = eMailId;
    }
}
