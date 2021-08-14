package BankingMnagement;

import java.util.Scanner;

public class InputHandler {
    Scanner scanner=new Scanner(System.in);
    int choice;
    long account_id;
    public User getNewUser()
    {
        System.out.println("enter name");
        scanner.nextLine();
        String name=scanner.nextLine();
        System.out.println("enter password");
        String password= scanner.nextLine();
        System.out.println("enter balance");
        double balance=scanner.nextDouble();
        User user=new User();
        user.setUserName(name);
        user.setPassword(password);
        user.setBalance(balance);
        return user;
    }
    public  Admin getAdminInfo()
    {
        System.out.println("enter admin name");
        scanner.nextLine();
        String name=scanner.nextLine();
        System.out.println("admin password");
        String password=scanner.nextLine();
        Admin admin=new Admin();
        admin.setAdminName(name);
        admin.setPassword(password);
        return admin;
    }
    public int getChoice()
    {
        choice=scanner.nextInt();
        return choice;
    }
    public User getUserLoginInfo()
    {
        System.out.println("enter user name");
        scanner.nextLine();
        String name=scanner.nextLine();
        System.out.println("enter password");
        String password= scanner.nextLine();
        User user=new User();
        user.setUserName(name);
        user.setPassword(password);
        return user;
    }
    public User transferInfo()
    {
        System.out.println("enter sender account_id");
        long id=scanner.nextLong();
        System.out.println("enter balance");
        double balance=scanner.nextDouble();
        User user=new User();
        user.setAccount_id(id);
        user.setBalance(balance);
        return user;
    }
    public long getAccountId()
    {System.out.println("enter receiver account id");
       account_id=scanner.nextLong();
       return account_id;
    }
}
