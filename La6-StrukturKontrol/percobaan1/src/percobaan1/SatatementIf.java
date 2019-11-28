/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1;

/**
 * @author Abdul Jalil Maulani
 * NAMA                 : Abdul Jalil Maulani
 * KELAS                : TI -1B
 * NIM                  : A2.1900002
 * Deskripsi Program    : Statement if
 */
public class SatatementIf {
    public static void main(String[] args) {
        double grade = 92.0;
        
        if ( grade >= 90){
            
            System.out.println("Excellent!");
        }
        else if ( (grade < 90) && (grade >= 80)){
            System.out.println("Good Job!");
        }
        else if( (grade <80) && (grade >=60)){
            System.out.println("Study Harder!");
        }
        else {
            System.out.println("Sorry, you failed.");
        }
    }
        
    
}
