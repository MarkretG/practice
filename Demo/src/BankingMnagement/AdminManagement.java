package BankingMnagement;
public class AdminManagement {
    static long generateUserId=104;
     static long generatedAccountId=504;
    public Admin initialiseAdmin()
    {
        Admin admin=new Admin();
        admin.setAdminName("dhuruv");
        admin.setPassword("dhuruv@26");
        return admin;
    }
    public long generateUserId(User user)
    {
        user.setUserID(generateUserId++);
        return user.getUserID();
    }
    public long generateAccountId(User user)
    {
        user.setAccount_id(generatedAccountId++);
        return user.getAccount_id();
    }

    public  User addNewUser(User user)
    {
        user.setUserID(generateUserId(user));
        user.setAccount_id(generateAccountId(user));
        return user;
    }
    public boolean verifyAdmin(Admin admin,Admin admin1)
    {
       if(admin.getAdminName().equals(admin1.getAdminName())&&admin.getPassword().equals(admin1.getPassword())) {
           System.out.println("login successfully");
           return true;
       }
       return false;
    }

}
