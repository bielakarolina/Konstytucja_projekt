package pierwsza_wersja;

import java.util.Scanner;
import java.io.IOException;



public class Plikitekstowe {

 	 public static void main(String[] args) throws IOException {
 		 
 		System.out.println("Podaj nazwe pliku. ");
 		Scanner odczyt = new Scanner(System.in);
 		 String nazwa_pliku;
 		 nazwa_pliku=odczyt.nextLine();
 		System.out.println("Je�eli chcesz wy�wietli� rozdzia�,podaj nazw� rozdzia�u. "); //pobieramy napis, kt�ry b�dziemy poszukiwa�
 		 String numer_rozdzialu;
 		 numer_rozdzialu = odczyt.nextLine();
 		System.out.println("Je�eli chcesz wy�wietli� artyku�,podaj nazwe. ");
		 String numer_artykulu;
		 numer_artykulu = odczyt.nextLine();
		 
	        
	        try {
	            Czytajplik plik = new Czytajplik(nazwa_pliku);
	            String[] wierszTablicy = plik.OtworzPlik();
	           	           	
	            int i;
	            for(i=0; i < wierszTablicy.length;i++){
	            	
	                System.out.println(wierszTablicy[i]);
	            }
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	        // tutaj dopisac zamykanie pliku
	        
	        
	         
	    }   
}