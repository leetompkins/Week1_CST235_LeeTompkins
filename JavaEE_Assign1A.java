/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaee_assign1a;

import java.util.Scanner;

/**
 *
 * @author Leezle
 */
public class JavaEE_Assign1A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Construct CalculatorBean
        CalculatorBean calculator = new CalculatorBean();
        //Create Scanner for Console input
        Scanner inputConsole = new Scanner(System.in);
        //Request input
        System.out.println("Enter in the video resolution as 1080p or 720p      ");
        //Store input
        String vidRes = inputConsole.nextLine();
        //Request Input
        System.out.println("Enter in the video length in whole seconds        ");
        //Store Input
        int vidLength = Integer.parseInt(inputConsole.nextLine());
        //Send input to Calculator Bean
        calculator.UpdateMemReqs(vidRes, vidLength);
        //Print Calculation Results
        System.out.println("The memory requirments for a " + vidRes + " resolution video are:");
        System.out.println("~GB:  " + calculator.getReqStorageGB());
        System.out.println("~MB:  " + calculator.getReqStorageMB());
    }
    
}
