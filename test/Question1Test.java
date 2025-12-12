/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Question1.Operations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author micha
 */
public class Question1Test {
    //ChatGPT was consulted for unit testing brainstorming
    
    public Question1Test() {
    }
      @Test
    public void TotalOperations_ReturnsValue() {
        int[][] data = {
            {320, 175, 380},
            {210, 125, 360}
        };

        Operations operation = new Operations();

       
        int expected = 1570;
        int actual = operation.TotalOperations(data);

        assertEquals(expected, actual);
    }

    @Test
    public void AverageOperations_ReturnsValue() {
        int[][] data = {
            {320, 175, 380},
            {210, 125, 360}
        };

        Operations operation = new Operations();

        double expected = 1570.0 / 6; 
        double actual = operation.AverageOperations(data);

        assertEquals(expected, actual, 0.0001); 
    }
}

