package Question1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author micha
 */
public class Operations implements IOperation{
    

    @Override
    public int TotalOperations(int[][] operations) {

        int total = 0;
                
        for (int i = 0; i < operations.length; i++) { 
            for (int j = 0; j < operations[i].length; j++){
                
                total += operations[i][j];
                
            }
        }
       
        return total;
        
        
        
    }

    @Override
    public double AverageOperations(int[][] operations) {
    
        int total = 0;
        int count = 0;
                
        for (int i = 0; i < operations.length; i++) { 
            for (int j = 0; j < operations[i].length; j++){
                
                total += operations[i][j];
                count++;
                
                
    
            }
        }
        
        //ChatGPT was consulted for this type cast "(double)" and to use "Math.round" effectively (achieve the correct number of decimal points)
                                                                                                //i was missing the .0 in 100.0
        double average = (double) total / count;
        average = Math.round(average * 100.0) / 100.0;
        return average;
        
        
    }
            
    
    

    @Override
    public int MaxOperations(int[][] operations) {
    
        int maxValue = operations[0][0]; 

        for (int i = 0; i < operations.length; i++) {
            for (int j = 0; j < operations[i].length; j++) {
                
                if (operations[i][j] > maxValue) {
                    maxValue = operations[i][j];
                }
            }
        }

       return maxValue;

    
    }

    @Override
    public int MinOperations(int[][] operations) {
    
        int minValue = operations[0][0]; 

        for (int i = 0; i < operations.length; i++) {
            for (int j = 0; j < operations[i].length; j++) {
                
                if (operations[i][j] < minValue) {
                    minValue = operations[i][j];
                }
            }
        }

       return minValue;
    
    }
            
    
}
