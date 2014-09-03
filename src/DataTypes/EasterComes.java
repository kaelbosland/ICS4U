/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataTypes;
import java.util.Scanner;

/**
 *
 * @author 1boslandkae
 */
public class EasterComes {
    
    public static void main (String [] args) {
        
        // All the variables needed for the program
        System.out.println("What year is it? : ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        
        int a = year % 19;
        int b = year / 100;
        int c = year % 100;
        int d = b / 4;
        int e = b % 4;
        
    }
}
