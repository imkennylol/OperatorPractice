/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operatorpractice;

/**
 *
 * @author kenny tsang
 */
public class OperatorPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO: Declare and initialixe test score as int.
        int testScore1 = 90;
        int testScore2 = 90;
        int testScore3 = 89;
        
        //TODO: Display each test score.
        System.out.println("The score for test 1 is: " + testScore1);
        System.out.println("The score for test 2 is: " + testScore2);
        System.out.println("The score for test 3 is: " + testScore3);
        
        int sum = testScore1 + testScore2 + testScore3;
        System.out.println("The sum is: " + sum);
        
        //TODO: Calculate the average of the test scores
        double average = sum/3.00000000000000000000;
        
        //TODO: Output the average.
        System.out.println("The average test score is: " + average);
    }
    
}
