/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.fyp_emr;

import static com.mycompany.fyp_emr.ExcelReaders.ReadAllGraphs;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author Acer
 */
public class FYP_EMR {
    public static void main(String args[]) throws IOException{
        LinkedList<Diagnostic_Algorithm> A1;
        //A1 = ReadFullGraph("C:\\Users\\Acer\\Desktop\\Symptoms to Diagnosis\\ch 5\\ch 5-1 headache in hiv positive patients\\ch 5-1 headache with hiv postive patients.xlsx");
        A1 = ReadAllGraphs();
        System.out.println();
    }
}
