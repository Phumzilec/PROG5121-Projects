/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical2_methods;
import javax.swing.JOptionPane;
/**
 *
 * @author Phumzile.Shabalala
 */
public class Practical2_Methods {
    // we are creating a methos to add two number
    // we are going to make use of 2 data TYPE, string for characters, int for numbers
    public static int calculateSum(int number1,int number2){
    return number1 + number2;
    }
    //This is our main method, this method is embedded or comes with the project
    public static void main(String[] args) {
    //Ask user for first number using GUI
    String Num1 = JOptionPane.showInputDialog(null,"Enter the first number");
    String Num2 = JOptionPane.showInputDialog(null,"Enter the second number");
    //convert string input to integer
    int firstNum = Integer.parseInt(Num1);
    int secondNum = Integer.parseInt(Num2);
    
    int sum = calculateSum(firstNum, secondNum);
    JOptionPane.showMessageDialog(null, "The sum is " + sum);
    }
}
// we cant put anything outside this class for now