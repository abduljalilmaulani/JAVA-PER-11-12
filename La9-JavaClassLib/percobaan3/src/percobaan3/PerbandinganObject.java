/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan3;

/**
 * @author Abdul Jalil Maulani
 * NAMA                 : Abdul Jalil Maulani
 * KELAS                : TI -1B
 * NIM                  : A2.1900002
 * Deskripsi Program    : Perbandingan Object
 */
public class PerbandinganObject {
    public static void main(String[] args) {
        String str1, str2;  
 
 str1 = "Free the bound periodicals.";  
 
 str2 = str1;  
 
 System.out.println("String1: " + str1);  
 
 System.out.println("String2: " + str2);  
 
   
 System.out.println("same object? " + str1.equals (str2));
 
 str2 = new String (str1);  
 
 System.out.println("String1: " + str1);  
 
 System.out.println("String2: " + str2);  
 
 System.out.println("Same object? " + (str1 == str2));  
 
 System.out.println("Same value? " + str1.equals(str2));  
 
 }  
 
 }  


