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
	     		System.out.println("Je¿eli chcesz wyœwietliæ rozdzia³,podaj jego numer. "); //pobieramy napis, który bêdziemy poszukiwaæ
	     		 String chapter; 
	     		 chapter = reading.nextLine();
	     		System.out.println("Je¿eli chcesz wyœwietliæ artyku³y podaj numer pocz¹tku. ");
	    		 String start;  // 
	    		 start = reading.nextLine();
	    		 System.out.println("i numer koñca. ");
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
	
	

	
	

