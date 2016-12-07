package constitution;

public class Parser {

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
	
	public static void Chapterscope(int x){
		if(x<0 || x>13)
			{
			System.out.println("Nie ma takiego rozdzialu");
			System.exit(1);
			}
	}
	public static void Articlescope(int first,int last){
		if(first<0 || first>243 || last<first || last>243)
			{
			System.out.println("B³êdny przedzia³");
			System.exit(1);
			}
	}
}