

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactsDetails {

    List<Address> addressList = new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    Address address = new Address();


    public void readDetails(int numberOfDetails) {
        for (int i = 0; i < numberOfDetails; i++) {
            Address address1 = new Address();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter contact detail:");
            System.out.println("Enter First Name:");
            address1.setFirstName(sc1.nextLine());
            System.out.println("Enter Last Name:");
            address1.setLastName(sc1.nextLine());
            System.out.println("Enter Phone Number:");
            address1.setPhoneNumber(sc1.nextLong());
            sc1.nextLine();
            System.out.println("Enter Address");
            address1.setAddress(sc1.nextLine());
            Address address2 = new Address(address1.getFirstName(), address1.getLastName(), address1.getPhoneNumber(), address1.getAddress());
            addressList.add(address2);
        }
    }

    public void viewDetails(int numberOfContacts) {
        for (int i = 0; i < numberOfContacts; i++) {
            System.out.println("Details for " + (i + 1) + " Person");
            System.out.println("Name:-" + addressList.get(i).getFirstName() + " " + addressList.get(i).getLastName());
            System.out.println("Phone Number:-" + addressList.get(i).getPhoneNumber());
            System.out.println("Address:-" + addressList.get(i).getAddress());
        }
    }

    public void editDetailsByName(int numberOfContacts) {

        System.out.println("Enter First And Last Name:-");
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();
        for (int i = 0; i < numberOfContacts; i++) {
            if ((addressList.get(i).getFirstName().equals(firstName)) && (addressList.get(i).getLastName().equals(lastName))) {
                System.out.println("Choose which detail you want to change:-");
                System.out.println("1.First name\n2.Last Name\n3.Phone Number\n4.Address");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        editFirstName(i);
                        break;
                    case 2:
                        editLastName(i);
                        break;
                    case 3:
                        editPhoneNumber(i);
                        break;
                    case 4:
                        editAddress(i);
                        break;
                    default:
                        System.out.println("Incorrect choice:-");
                        break;
                }
            }
            updatedDetails(i);
        }
    }

    public void editFirstName(int index) {
        System.out.println("Enter the New First Name:-");
        addressList.get(index).setFirstName(sc.nextLine());
    }

    public void editLastName(int index) {
        System.out.println("Enter the New Last Name:-");
        addressList.get(index).setLastName(sc.nextLine());
    }

    public void editPhoneNumber(int index) {
        System.out.println("Enter the New Phone Number:-");
        addressList.get(index).setPhoneNumber(sc.nextLong());
    }

    public void editAddress(int index) {
        System.out.println("Enter the New address:-");
        addressList.get(index).setAddress(sc.nextLine());
    }

    public void updatedDetails(int index) {
        System.out.println("Updated Details");
        System.out.println("Name:-" + addressList.get(index).getFirstName() + " " + addressList.get(index).getLastName());
        System.out.println("Phone Number:-" + addressList.get(index).getPhoneNumber());
        System.out.println("Address:-" + addressList.get(index).getAddress());
    }

    public void deleteDetails(int numberOfDetails){
        System.out.println("Enter the First and last name of the person whose details you want delete:-");
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();
        for (int i = 0; i < numberOfDetails; i++) {
            if ((addressList.get(i).getFirstName().equalsIgnoreCase(firstName)) && (addressList.get(i).getLastName().equalsIgnoreCase(lastName))){
                addressList.remove(i);
            }
        }
    }
}
