import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContactsDetails contactsDetails=new ContactsDetails();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of address you want to add:-");
        int numberOfDetails = sc.nextInt();
        contactsDetails.readDetails(numberOfDetails);
        contactsDetails.viewDetails(numberOfDetails);
        System.out.println("Enter choice to make changes to the addressbook:-\n1.Enter 1 to edit details\n2.Enter 2 to delete details");
        int choice= sc.nextInt();
        switch (choice){
            case 1:
                contactsDetails.editDetailsByName(numberOfDetails);
                break;
            case 2:
                contactsDetails.deleteDetails(numberOfDetails);
                contactsDetails.viewDetails(contactsDetails.addressList.size());
                break;
            default:
                System.out.println("Incorrect Choice");
                break;
        }
    }
}