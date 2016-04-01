package projectmanagement;

import java.util.Date;
import java.util.Scanner;

public class MenuUtama{
	
    Proyek proyek;
    ManajerProyek manajer;
    Scanner scanString = new Scanner(System.in); 
    Scanner scanInteger = new Scanner(System.in); 	
    String pilih;
    
    public void menuUtama(){
        System.out.println ("Menu Utama");
	System.out.println ("Pilih Menu: ");
        System.out.println ("1. Login Manajer");
	System.out.println ("2. Login Programmer");
        System.out.println ("3. Keluar");
	System.out.println ("");
    }
    
    public void menuManajer(){
       	System.out.println ("Menu Manajer");
	System.out.println ("Pilih Menu: ");
        System.out.println ("1. Buat Proyek");
	System.out.println ("2. Lihat Proyek");
        System.out.println ("3. Keluar");
	System.out.println ("");
    }
     
     public void menuProgrammer(){
       	System.out.println ("Menu Programmer");
	System.out.println ("Pilih Menu: ");
        System.out.println ("1. Lihat Tugas");
        System.out.println ("2. Keluar");
	System.out.println ("");   
    }	
		
}
