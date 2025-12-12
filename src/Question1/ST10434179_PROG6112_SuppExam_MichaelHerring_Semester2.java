/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question1;

import java.util.Scanner;

/**
 *
 * @author micha
 */
public class ST10434179_PROG6112_SuppExam_MichaelHerring_Semester2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] data =  { 
                            {320, 175, 380},
                            {210, 125, 360}
                        };
    
    
        Operations operation = new Operations();

    
    
        System.out.println("Please enter the operation results to display: ");
        System.out.println("1) \t Total Operations:"
                + "\n 2) \t Average Operations: "
                + "\n 3) \t Max Operations: "
                + "\n 4) \t Min Operations: ");
    
        
        Scanner keyboard = new Scanner(System.in);
        Integer input = keyboard.nextInt();
        
        
        switch (input) {
            case 1:
                
                System.out.println("HOSPITAL OPERATIONS APPLCATION");
                System.out.println("-------------------------------------------");
                System.out.println("Total Operations: \t " + operation.TotalOperations(data));
                
                break;
                
            case 2: 
                
                System.out.println("HOSPITAL OPERATIONS APPLCATION");
                System.out.println("-------------------------------------------");
                System.out.println("Average Operations: \t " + operation.AverageOperations(data));
                
                break;
                
            case 3:
                
                System.out.println("HOSPITAL OPERATIONS APPLCATION");
                System.out.println("-------------------------------------------");
                System.out.println("Max Operations: \t " + operation.MaxOperations(data));
                
                break;
                
            case 4: 
                
                System.out.println("HOSPITAL OPERATIONS APPLCATION");
                System.out.println("-------------------------------------------");
                System.out.println("Min Operations: \t " + operation.MinOperations(data));
                
                break;
                
            default:
                
                System.out.println("HOSPITAL OPERATIONS APPLCATION");
                System.out.println("-------------------------------------------");
                System.out.println("Total Operations: \t " + operation.TotalOperations(data));
                
                break;
                
        }
        
    
    }
    
}
