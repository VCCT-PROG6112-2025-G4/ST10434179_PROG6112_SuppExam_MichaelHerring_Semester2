/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author micha
 */
public class Operations implements IOperations {
    
    //Planned Surgery | Unplanned Surgery | Emergency Surgery
    
    int[][] data =  { 
                            {300, 150, 700},
                            {250, 200, 600}
                        };
    

    @Override
    public int[][] GetOperationsData() {
        return data;
   
    }

    @Override
    public int GetTotalOperations() {
        
         int total = 0;
                
        for (int i = 0; i < data.length; i++) { 
            for (int j = 0; j < data[i].length; j++){
                
                total += data[i][j];
                
            }
        }
       
        return total;
   
    }

    @Override
    public int GetTotalOperationsForYearOne() {
   
        int total = 0;
        
        for (int i = 0 ; i < data[0].length; i++) {
            total += data[0][i];
        }
        
        return total;
    }

    @Override
    public int GetTotalOperationsForYearTwo() {
        
        int total = 0;
        
        for (int i = 0 ; i < data[1].length; i++) {
            total += data[1][i];
        }
        
        return total;
   
    }
    
    
    
}
