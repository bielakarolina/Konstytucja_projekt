package agh.constytution;


import java.util.Scanner;
import java.io.IOException;


public class Constitution {


 	 public static void main(String[] args) throws IOException {
 		 
 		System.out.println("Podaj nazwe pliku. ");
 		Scanner reading = new Scanner(System.in);
 		 String name_file;
 		 name_file=reading.nextLine();
 		System.out.println("Je¿eli chcesz wyœwietliæ rozdzia³,podaj jego numer. "); //pobieramy napis, który bêdziemy poszukiwaæ
 		 String chapter;
 		 chapter = reading.nextLine();
 		System.out.println("Je¿eli chcesz wyœwietliæ artyku³y podaj numer pocz¹tku. ");
		 String start;
		 start = reading.nextLine();
		 System.out.println("i numer koñca. ");
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
	
	

	
	

