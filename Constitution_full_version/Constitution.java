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
	     		System.out.println("Co chcia�aby� wczyta�? ");
	     		String whatdoyouwant;
	     		whatdoyouwant=reading.nextLine();
	     			if( Parser.Chapterdefine(whatdoyouwant))
	     			{
	     				System.out.println("Chcesz wy�wietli� rozdzia�,podaj jego numer. "); //pobieramy napis, kt�ry b�dziemy poszukiwa�
	     				int chapter; 
	     				chapter = reading.nextInt();
	     				Parser.Chapterscope(chapter);
	     				reading.close();
	     				Chapter show_Chapter=new Chapter();
	     				show_Chapter.readChapter(chapter, name_file);
	     			}
	     			else if(Parser.Articledefine(whatdoyouwant))
	     			{
	     				System.out.println("Chcesz wy�wietli� artyku�y podaj numer pocz�tku. ");
	     				int start;  
	     				start = reading.nextInt();
	     				System.out.println("i numer ko�ca. ");
	     				int end;
	     				end = reading.nextInt();
	     				reading.close();
	     				Parser.Articlescope(start,end);
	     				Article show_me =new Article();
	     				show_me.readArticle(start, end, name_file);
		        	
	     			}
	     			else
	     			{
	     			System.out.println("Nie ma czego� takiego");
	     			
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
	
	

	
	

