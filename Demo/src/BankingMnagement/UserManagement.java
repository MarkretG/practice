package BankingMnagement;
import java.util.ArrayList;
public class UserManagement {
    ArrayList<User> users=new ArrayList<>();
    public void initialiseUsers()
    {
        User user=new User();
        user.setUserID(101);
        user.setUserName("amsel");
        user.setPassword("vignesh@2010");
        user.setAccount_id(501);
        user.setBalance(10000d);
        User user1=new User();
        user1.setUserID(102);
        user1.setUserName("anu");
        user1.setPassword("vino@2010");
        user1.setAccount_id(502);
        user1.setBalance(15000d);
        User user2=new User();
        user2.setUserID(103);
        user2.setUserName("manu abhimanyu");
        user2.setPassword("world@321");
        user2.setAccount_id(503);
        user2.setBalance(20000d);
        users.add(user);
        users.add(user1);
        users.add(user2);
    }
    public boolean verifyUser(User user)
    {
       for (User user1:users)
       {
           if(user1.getUserName().equals(user.getUserName())&&user1.getPassword().equals(user.getPassword())) {
               System.out.println("login successfully");
               return true;
           }
       }
       return false;
    }
    public void print()
    {
        System.out.println("USERID\tUSERNAME\tPASSWORD\tACCOUNT_ID\tBALANCE");
        users.forEach(s->System.out.println(s));
    }
    public void transferMoney(User user,long account_id)
    {
        for (User user1:users)
        {
            if(user1.getAccount_id()== user.getAccount_id())
            {
                double balance=user1.getBalance()- user.getBalance();
                user1.setBalance(balance);
            }
            if (user1.getAccount_id()==account_id)
            {
                double amount=user.getBalance()+ user1.getBalance();
                user1.setBalance(amount);
            }
        }
    }

}
