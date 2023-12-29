package org.example;

import java.util.Scanner;

public class RegEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = sc.next();
        String firstNameRegEx = "[A-Z]{1}[a-z]{2,}";
        System.out.println(firstName.matches(firstNameRegEx));
        System.out.println("Enter Last Name: ");
        String lastName = sc.next();
        System.out.println(lastName.matches(firstName));
        System.out.println("Enter email: ");
        String email = sc.next();
        String emailRegEx = "abc[.A-Za-z0-9_+-]*@[a-z0-9]+.[a-z]+[.a-z]*";
        System.out.println(email.matches(emailRegEx));
        System.out.println("Enter phone number: ");
        String phone = sc.next();
        String phoneRegEx = "\\d{1,3}\\s\\d{10}";
        System.out.println(phone.matches(phoneRegEx));
        System.out.println("Enter your password: ");
        String password = sc.next();
        String passwordRegEx = "([A-Z]+[a-z]*[@_][0-9]+){8,}";
        System.out.println(password.matches(passwordRegEx));
    }
    public boolean isFirstNameCorrect(String firstName, String firstNameRegEx) {
        return firstName.matches(firstNameRegEx);
    }

    public boolean isLastNameCorrect(String lastName, String lastNameRegEx) {
        return lastName.matches(lastNameRegEx);
    }

    public boolean isEmailCorrect(String email, String emailRegEx) {
        return email.matches(emailRegEx);
    }

    public boolean isPhoneCorrect(String phone, String phoneRegEx) {
        return phone.matches(phoneRegEx);
    }

    public boolean isPasswordCorrect(String password, String passwordRegEx) {
        return password.matches(passwordRegEx);
    }

    public String analyseMood(String message) {
        if(message.contains("sad")) {
            return "SAD";
        }
        return "HAPPY";
    }

}
