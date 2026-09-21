package com.inher.quest4;

import java.util.Scanner;

public class CommMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Mail Communication");
        System.out.println("2. SMS Communication");
        System.out.println("3. Phone Communication");
        System.out.println("4. WhatsApp Communication");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Communication communication;

        switch (choice) {

            case 1:

                MailCommunication mail = new MailCommunication();

                communication = mail;

                communication.sendMessage();

                String[] types = mail.showTypes();

                System.out.println("Types of Mail Communication:");

                for (String type : types) {
                    System.out.println(type);
                }

                break;

            case 2:

                SMSCommunication sms = new SMSCommunication();

                communication = sms;

                communication.sendMessage();

                sms.messageLength();

                break;

            case 3:

                PhoneCommunication phone = new PhoneCommunication();

                communication = phone;

                communication.sendMessage();

                phone.callService();

                break;

            case 4:

                WhatsappCommunication whatsapp =
                        new WhatsappCommunication();

                communication = whatsapp;

                communication.sendMessage();

                whatsapp.otherFeatures();

                break;

            default:

                System.out.println("Invalid choice");
        }

        sc.close();
    }
}