package com.bridgeLabz;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    HashMap<String ,AddressBook> hashMap = new HashMap<String,AddressBook>();
    public void AddAddressbook(){
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the AddressBook");
        String name=sc.next();
        if(hashMap.containsKey(name)){
            System.out.println("Enter different name for the AddressBook");
            AddAddressbook();
        }else {
            addressBook.setAddressbookName(name);
            hashMap.put(addressBook.getAddressbookName(), addressBook);
            System.out.println("Address book added!!");
        }
    }
    public void addcontact1(){
        if(hashMap.isEmpty())
        {
            System.out.println("Your address book is empty first please add new Addressbook");
            AddAddressbook();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the addressbok in which you want to add contact: ");
        String name = sc.next();
        if(hashMap.containsKey(name)){
            AddressBook temp = hashMap.get(name);
            temp.addContact();
        }
    }
    public void display1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the addressbok in which you want to display contact: ");
        String name = sc.next();
        if(hashMap.containsKey(name)){
            AddressBook temp = hashMap.get(name);
            temp.display();
        }
    }
    public void delete1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the addressbok in which you want to Delete contact: ");
        String name = sc.next();
        if(hashMap.containsKey(name)){
            AddressBook temp = hashMap.get(name);
            temp.delete();
        }
    }
    public void Edit1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the addressbok in which you want to Edit contact: ");
        String name = sc.next();
        if(hashMap.containsKey(name)){
            AddressBook temp = hashMap.get(name);
            temp.Edit();
        }
    }
    public void displayAllAddressbook(){
        System.out.println("Displaying all addressbook");
        if(hashMap.isEmpty()){
            System.out.println("Addressbook is empty");
        }else {
            System.out.println(hashMap);
        }
    }
    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("  ::>>>Welcome AdressBook<<<::  ");

            System.out.println("1.Add New Contcat");
            System.out.println("2.View All Contacts");
            System.out.println("3.Edit Contacts");
            System.out.println("4.Delete Contact");
            System.out.println("5.Add New AddressBook ");
            System.out.println("6.show all AddressBooks ");

            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    addressBookMain.addcontact1();
                    break;
                case 2 :
                    addressBookMain.display1();
                    break;
                case 3 :
                    addressBookMain.Edit1();
                    break;
                case 4 :
                    addressBookMain.delete1();
                    break;
                case 5:
                    addressBookMain.AddAddressbook();
                    break;
                case 6:
                    addressBookMain.displayAllAddressbook();
                    break;

            }}
    }
}