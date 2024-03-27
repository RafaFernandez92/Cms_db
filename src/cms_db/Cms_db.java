/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cms_db;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Cms_db {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int userINPUT;
        
        System.out.println("Welcome to the college Database.");
        System.out.println("1. Login.\n" + "2. Exit.");
        Scanner userANSWER = new Scanner(System.in);
        try{
            userINPUT = userANSWER.nextInt();
        } catch(Exception e){
            System.out.println(e);
        }
        if(userANSWER == 1){
            System.out.println("Introduce your credentials: ");
            System.out.println("Username: " + userINPUT);
            System.out.println("Password: " + userINPUT);
        }else {
            
        }
        
        
      
    }
    
}
