package userManagement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserManagement {
    private ArrayList<User> users = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    int choice;

    public void addUser(User user) {
        users.add(user);
    }

    public void initialiseUser() {
        User user1 = new User();
        user1.setUserName("markret");
        user1.setMailId("markret@gmail.com");
        user1.setPassword("markret@123");
        User user2 = new User();
        user1.setUserName("vino");
        user1.setMailId("vino@gmail.com");
        user1.setPassword("vino@123");
        users.add(user1);
        users.add(user2);

    }

    public User newUser() {
        System.out.println("enter your name");
        String name = scanner.nextLine();
        System.out.println("enter email id");
        String mail = scanner.nextLine();
        System.out.println("enter password");
        String password = scanner.nextLine();
        System.out.println("enter balance");
        double balance=scanner.nextDouble();
        User user = new User();
        user.setMailId(mail);
        user.setUserName(name);
        user.setPassword(password);

        return user;
    }

    public User getLoginInfo() {
        System.out.println("enter mail id");
        String mail = scanner.nextLine();
        System.out.println("enter password");
        String pass = scanner.nextLine();
        String password=validatePassword(pass);
        User user = new User();
        user.setMailId(mail);
        user.setPassword(pass);
        return user;

    }

    public int getChoice() {
        choice = scanner.nextInt();
        return choice;
    }

    public void verifyUser(String mail, String password) {
        int end =0;
        for (User user : users) {
            if (user.getMailId().equals(mail) && user.getPassword().equals(password)) {
                end =1;
                System.out.println("login successfully");
            }
        }
        if (end ==0) {
            System.out.println("invalid user name or password");
        }
    }
    public String validatePassword(String pass)
    {
        String password="";
        String regex="^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[!@#$%^&-+=])"+"(?=\\S+$).{8,15}$";
        while (!Pattern.matches(regex,pass))
        {
            System.out.println("password must have 8-15 characters one upper case letter and one lower case letter and one special character and one number\n enter password again");
            scanner.nextLine();
            password=scanner.nextLine();
        }
        return password;
    }
}