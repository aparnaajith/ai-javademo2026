package com.userapp.client;

import java.util.Scanner;

import com.userapp.exceptiom.NameExistsException;
import com.userapp.exceptiom.TooLongException;
import com.userapp.exceptiom.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        IValidationService service = new ValidationServiceImpl();

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        try {

            // Validate username
            service.validateUsername(username);

            // Username available, so ask for password
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Validate password
            service.validatePassword(password);

            System.out.println("Welcome " + username
                    + ". You are registered");

        } catch (NameExistsException e) {

            System.out.println(e.getMessage());

        } catch (TooShortException e) {

            System.out.println(e.getMessage());

        } catch (TooLongException e) {

            System.out.println(e.getMessage());

        } finally {

            scanner.close();
        }
    }
}