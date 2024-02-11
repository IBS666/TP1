/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp1;

import java.util.Scanner;


public class Tp1 {

     public static double[] calculprobability(int[][] image){
        double[] p = new double[256];
        
        for(int i = 0; i<256;i++){
            int occ = 0;
            for(int j = 0; j<image.length;j++){
                for(int k = 0;k<image[0].length;k++){
                    if(i==image[j][k]){
                        occ ++;
                    }
                }
            }
            p[i]=occ/(image.length*image[0].length);
        }
        return p;
        }
     public static double calculateEntropy(int[][] image){
         float h=0;
         double[] p=calculprobability(image);
         for(int i=0;i<256;i++){
             h += p[i] * math.log (p[i]);
         }
         return(-h);
     }
     
   
    public static void main(String[] args) {
        System.out.println("Bonjour , mon premier TP en POO");
        System.out.println("quelle est votre nom ?");
        Scanner read = new Scanner(System.in);
        String name = read.next();
        System.out.println();
        System.out.println("bonjour"+name);
        System.out.println("quelle est votre age "+name+ " ?");
        read = new Scanner(System.in);
        int a;
        a = read.nextInt();
        System.out.println(name +" votre age est "+a);
        
        
    }
}
