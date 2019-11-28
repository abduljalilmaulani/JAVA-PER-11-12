/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan2;

/**
 * @author Abdul Jalil Maulani
 * NAMA                 : Abdul Jalil Maulani
 * KELAS                : TI -1B
 * NIM                  : A2.1900002
 * Deskripsi Program    : Statement Switch
 */
public class statementSwitch {
    public static void main(String[] args) {
        int grade=92;
        
        switch (grade){
            case 100:
                System.out.println("Excellent");
                break;
            case 90:
                System.out.println("Good Job!");
                break;
            case 80:
                System.out.println("Study Hearder!");
                break;
            default:
                System.out.println("Sorry, you failed.");
                
        }
    }
    
}
