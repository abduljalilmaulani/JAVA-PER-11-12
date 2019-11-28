/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan6;

/**
 * @author Abdul Jalil Maulani
 * NAMA                 : Abdul Jalil Maulani
 * KELAS                : TI -1B
 * NIM                  : A2.1900002
 * Deskripsi Program    : Label Statement Continue
 */
public class LabeledStatementContinue {
    public static void main(String[] args) {
        outerLoop:  
 
       for( int i=0; i<5; i++ ){ 
 
 
 
        for( int j=0; j<5; j++ ){ 
 
         System.out.println("Inside for(j) loop"); //message1 
 
         if( j == 2 )  continue outerLoop; 
 
        } 
 
 
                 System.out.println("Inside for(i) loop"); //message2 
 
       } 
    }
    
}
