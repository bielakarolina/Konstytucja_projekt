package agh.constytution;


import java.util.Scanner;
import java.io.IOException;


public class Constitution {


 	 public static void main(String[] args) throws IOException {
 		 
 		System.out.println("Podaj nazwe pliku. ");
 		Scanner reading = new Scanner(System.in);
 		 String name_file;
 		 name_file=reading.nextLine();
 		System.out.println("Je�eli chcesz wy�wietli� rozdzia�,podaj jego numer. "); //pobieramy napis, kt�ry b�dziemy poszukiwa�
 		 String chapter;
 		 chapter = reading.nextLine();
 		System.out.println("Je�eli chcesz wy�wietli� artyku�y podaj numer pocz�tku. ");
		 String start;
		 start = reading.nextLine();
		 System.out.println("i numer ko�ca. ");
		 String end;
		 end = reading.nextLine();
		 
		 
	        
	        try {
	        	ThrowFile file = new ThrowFile(name_file);
	            String[] line_file = file.OpenFile();
	           	           	
	            int i;
	            for(i=0; i < line_file.length;i++){
	            	
	                System.out.println(line_file[i]);
	            }
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	        // tutaj dopisac zamykanie pliku
	        
	        
	         
	    }   
 	
 	void chapterString (int chapter){
 		
 	}
 	
 	void articleString(int start, int last){
 		
 	}
 	
}
	
	

	
	

