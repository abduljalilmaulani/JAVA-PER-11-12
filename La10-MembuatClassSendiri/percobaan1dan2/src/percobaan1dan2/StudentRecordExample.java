/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1dan2;

/**
 * @author Abdul Jalil Maulani
 * NAMA                 : Abdul Jalil Maulani
 * KELAS                : TI -1B
 * NIM                  : A2.1900002
 * Deskripsi Program    : Student Record Example
 */
public class StudentRecordExample {
     public static void main( String[] args ){  
 
 //membuat 3 object StudentRecord  
 
 StudentRecord annaRecord = new StudentRecord();    
 StudentRecord beahRecord = new StudentRecord();   
 StudentRecord crisRecord = new StudentRecord();   
 //Memberi nama siswa  
 
 annaRecord.setName("Anna");  
 
 beahRecord.setName("Beah");  
 
 crisRecord.setName("Cris");  
 
 //Menampilkan nama siswa “Anna”  
 
 System.out.println( annaRecord.getName() );  
 
 //Menampilkan jumlah siswa  
 
 System.out.println("Count="+StudentRecord.getStudentCount() 
 
 );  
 
 }  
 
}


