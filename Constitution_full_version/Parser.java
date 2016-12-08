package constitution;

import java.io.IOException;
import java.util.Scanner;

public class Parser 
{

	public static boolean Chapterdefine(String defineA)
	{
	
		switch(defineA)
		{
			case "chapter": return true;
			case "rozdzial": return true;
			case "rozdzia³": return true;
			case "roz": return true;
			case "chap": return true;
			default: return false;
				
			
					
		}
	}
	
	public static boolean Articledefine(String defineC)
	{
	
		switch(defineC)
		{
			case "article": return true;
			case "artyku³": return true;
			case "artykul": return true;
			case "art": return true;
			default: return false;
				
			
					
		}
	}
	
	public static void Chapterscope(int x)
	{
		if(x<0 || x>13)
			{
			System.out.println("Nie ma takiego rozdzialu");
			System.exit(1);
			}
	}
	public static void Articlescope(int first,int last)
	{
		if(first<0 || first>243 || last<first || last>243)
			{
			System.out.println("B³êdny przedzia³");
			System.exit(1);
			}
	}
	
	public static void ReadArguments() throws IOException
	{
		System.out.println("Podaj nazwe pliku. ");
		Scanner reading = new Scanner(System.in);
			String name_file;
		 	name_file=reading.nextLine();
		 	System.out.println("Co chcia³abyœ wczytaæ? ");
		 	String description;
			description=reading.nextLine();
		if( Parser.Chapterdefine(description))
			{
				
				System.out.println("Chcesz wyœwietliæ rozdzia³,podaj jego numer. "); //pobieramy napis, który bêdziemy poszukiwaæ
				int chapter; 
				chapter = reading.nextInt();
				Parser.Chapterscope(chapter);
				reading.close();
				Chapter show_Chapter=new Chapter();
				show_Chapter.readChapter(chapter, name_file);
			}
			else if(Parser.Articledefine(description))
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
	
}