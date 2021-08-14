package BankingMnagement;
import java.util.Scanner;
public class BankingManagementSystem {
     Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        UserManagement userManagement=new UserManagement();
        AdminManagement adminManagement=new AdminManagement();
        InputHandler inputHandler=new InputHandler();
        userManagement.initialiseUsers();
        //add new user
        while (true)
        {
            System.out.println("1.Admin login\n2.user login\n3.exit");
            int choice= inputHandler.getChoice();
            switch (choice) {
                case 1: {
                    Admin admin = adminManagement.initialiseAdmin();
                    Admin admin1 = inputHandler.getAdminInfo();
                    if (adminManagement.verifyAdmin(admin, admin1)) {
                        boolean end = true;
                        while (end) {
                            System.out.println("1.add new user\n2.print user\n3.exit");
                            int ch = inputHandler.getChoice();
                            switch (ch) {
                                case 1: {
                                    User user = adminManagement.addNewUser(inputHandler.getNewUser());
                                    userManagement.users.add(user);
                                }
                                break;
                                case 2: {
                                    userManagement.print();
                                }
                                break;
                                case 3:
                                    end = false;
                            }
                        }
                    } else {
                        System.out.println("invalid admin name or password\npress 1 for login again");
                    }

                }
                break;
                case 2: {
                    User user = inputHandler.getUserLoginInfo();
                    if (userManagement.verifyUser(user)) {
                        boolean end=true;
                        while (end) {
                            System.out.println("1.transfer money\n2.check transaction\3.exit");
                            int ch= inputHandler.getChoice();
                            switch (ch)
                            {
                                case 1: {
                                    User user1 = inputHandler.transferInfo();
                                    long receiverAccount_id = inputHandler.getAccountId();
                                    userManagement.transferMoney(user1, receiverAccount_id);
                                }
                                break;
                                case 2: {
                                    userManagement.print();
                                }
                                break;


                            }
                        }
                    }
                }

                case 3:
                    System.exit(0);
            }

        }

    }


}
