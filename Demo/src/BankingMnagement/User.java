package BankingMnagement;
public class User {
    private long userID;
    private String UserName;
    private String Password;
    private long account_id;
    private Double balance;

    @Override
    public String toString() {
        return ""+userID +'\t'+'\t'
                 +UserName +'\t'+'\t'
                 +Password+'\t'+'\t'+account_id+'\t'+'\t'+balance;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(long account_id) {
        this.account_id = account_id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
