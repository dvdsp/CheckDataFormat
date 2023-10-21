/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CheckDataFormat {
    
    private static final String PHONE_VALID = "^[0-9]{10}$";
    private static final String EMAIL_VALID = "^[A-Za-z0-9+_.-]+@([A-Za-z0-9.-]+\\.[A-Za-z]{2,4})$";
    
    
    
    private static String checkInputString() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("can't be empty");
            }
            return input;
        } 
    }
    
    
    private static String checkInputPhone(){
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                
                String phoneCheck = sc.nextLine();
                if (phoneCheck.matches(PHONE_VALID)) {
                    return phoneCheck;
                } else {
                    System.out.println("Phone must be 10 degits");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid phone number.Enter phone number with 10 digits:     ");
            }
        }
    }
    
    private static String checkInputDate() {
        while (true) {
            try {
                String dateCheck = checkInputString();
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateCheck);
                return dateCheck;
            } catch (ParseException e) {
                System.out.println("Date format(dd/MM/yyyy):    ");
            }
        }
    }
    
    private static String checkInputEmail() {
        while (true) {
            String emailCheck = checkInputString();
            if(emailCheck.matches(EMAIL_VALID)) {
                return emailCheck;
            } else {
                System.out.println("Email must be in the correct format:    ");
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.print("PHONE NUMBER:     "); String phone = checkInputPhone();
        System.out.println("DATE:     "); String date = checkInputDate();
        System.out.println("EMAIL:     "); String email = checkInputEmail();
    }
    
    
    
    
}
