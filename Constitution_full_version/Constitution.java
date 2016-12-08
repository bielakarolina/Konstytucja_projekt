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
	     		String whatdoyouwant;
	     		whatdoyouwant=reading.nextLine();
	     			if( Parser.Chapterdefine(whatdoyouwant))
	     			{
	     				System.out.println("Chcesz wyœwietliæ rozdzia³,podaj jego numer. "); //pobieramy napis, który bêdziemy poszukiwaæ
	     				int chapter; 
	     				chapter = reading.nextInt();
	     				Parser.Chapterscope(chapter);
	     				reading.close();
	     				Chapter show_Chapter=new Chapter();
	     				show_Chapter.readChapter(chapter, name_file);
	     			}
	     			else if(Parser.Articledefine(whatdoyouwant))
	     			{
	     				System.out.println("Chcesz wyœwietliæ artyku³y podaj numer pocz¹tku. ");
	     				int start;  
	     				start = reading.nextInt();
	     				System.out.println("i numer koñca. ");
	     				int end;
	     				end = reading.nextInt();
	     				reading.close();
	     				Parser.Articlescope(start,end);
	     				Article show_me =new Article();
	     				show_me.readArticle(start, end, name_file);
		        	
	     			}
	     			else
	     			{
	     			System.out.println("Nie ma czegoœ takiego");
	     			
	     			}
	        } 
	        catch(IllegalArgumentException ex)
	        {
	        	System.out.println(ex.getMessage());
	        }
	        catch (IOException e)
	        {
	            System.out.println(e.getMessage());
	          
	        }
	        
	        
	         
	    }   
 	
 	
 	
}
	
	

	
	

