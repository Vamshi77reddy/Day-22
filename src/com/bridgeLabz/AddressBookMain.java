package com.bridgeLabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("  ::>>>Welcome AdressBook<<<::  ");

            System.out.println("1.Add New Contcat");
            System.out.println("2.View All Contacts");
            System.out.println("3.Edit Contacts");
            System.out.println("4.Delete Contacts");

            int input = sc.nextInt();
            switch (input){
                case 1 :
                    addressBook.AddContact();
                case 2 :
                    addressBook.display();
                case 3 :
                    addressBook.Edit();
                case 4 :
                    addressBook.delete();

        }}
    }
}