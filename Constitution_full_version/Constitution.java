package constitution;


import java.util.Scanner;
import java.io.IOException;


public class Constitution {


 	 public static void main(String[] args) throws IOException {
 		 
 		
		 
	        
	        try {
	        	System.out.println("Podaj nazwe pliku. ");
	     		Scanner reading = new Scanner(System.in);
	     		 String name_file;
	     		 name_file=reading.nextLine();
	     		System.out.println("Je�eli chcesz wy�wietli� rozdzia�,podaj jego numer. "); //pobieramy napis, kt�ry b�dziemy poszukiwa�
	     		 String chapter; 
	     		 chapter = reading.nextLine();
	     		System.out.println("Je�eli chcesz wy�wietli� artyku�y podaj numer pocz�tku. ");
	    		 String start;  // 
	    		 start = reading.nextLine();
	    		 System.out.println("i numer ko�ca. ");
	    		 String end;
	    		 end = reading.nextLine();
	    		 reading.close();
	    		
	    		 Chapter show_Chapter=new Chapter();
	    		 show_Chapter.readChapter(chapter, name_file);
	    		 Article show_me =new Article();
	    		 show_me.readArticle(start, end, name_file);
	        	
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	        // tutaj dopisac zamykanie pliku
	        
	        
	         
	    }   
 	
 	
 	
}
	
	

	
	

