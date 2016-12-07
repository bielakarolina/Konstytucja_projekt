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
	     		System.out.println("Co chcia³abyœ wczytaæ? ");
	     		String whatdoyouwhant;
	     		whatdoyouwhant=reading.nextLine();
	     		if( whatdoyouwhant.equals("chapter"))
	     		{
	     		System.out.println("Je¿eli chcesz wyœwietliæ rozdzia³,podaj jego numer. "); //pobieramy napis, który bêdziemy poszukiwaæ
	     		 int chapter; 
	     		 chapter = reading.nextInt();
	     		 reading.close();
	     		 Chapter show_Chapter=new Chapter();
	    		 show_Chapter.readChapter(chapter, name_file);
	     		}
	     		else if( whatdoyouwhant.equals("art"))
	     		{
	     			System.out.println("Je¿eli chcesz wyœwietliæ artyku³y podaj numer pocz¹tku. ");
	     			int start;  // 
	     			start = reading.nextInt();
	     			System.out.println("i numer koñca. ");
	     			int end;
	     			end = reading.nextInt();
	     			reading.close();
	     			Article show_me =new Article();
		    		show_me.readArticle(start, end, name_file);
		        	
	     		}
	    		
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	        // tutaj dopisac zamykanie pliku
	        
	        
	         
	    }   
 	
 	
 	
}
	
	

	
	

