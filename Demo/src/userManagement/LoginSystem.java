package userManagement;
public class LoginSystem {
    public static void main(String[] args) {
        UserManagement userManagement=new UserManagement();
        userManagement.initialiseUser();
        System.out.println("1.Login\2.New User\n3.exit");
        while (true)
        {
            int choice= userManagement.getChoice();
            switch (choice)
            {
                case 1: {
                      User user=userManagement.getLoginInfo();
                      userManagement.verifyUser(user.getMailId(), user.getPassword());
                }
                break;
                case 2: {
                    User user = userManagement.newUser();
                    userManagement.addUser(user);
                    System.out.println("create account successfully now you are log in");
                    User user1 = userManagement.getLoginInfo();
                    userManagement.verifyUser(user1.getMailId(), user1.getPassword());
                }
                break;
                case 3:
                    System.exit(0);
            }
        }

    }

}
