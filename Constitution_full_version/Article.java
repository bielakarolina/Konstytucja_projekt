package constitution;

import java.io.IOException;

public class Article
{

	public void  readArticle( int startArticle, int endArticle,String name) throws IOException
	{
		
		ThrowFile file_A = new ThrowFile(name);
        String[] line_file = file_A.OpenFile();
       
        
        
	 	for(int i=0; i < line_file.length;i++)
	 	{
	 		if(line_file[i].equals("Art. "+ startArticle +"."))
	 		{
	 			
	 			while((line_file.length>i) && !(line_file[i].equals("Art. "+ (endArticle+1) +".")))
	 			{
	 				 if(line_file[i].equals(line_file[i].toUpperCase()) || line_file[i].startsWith("Rozdzia�"))
			            {
			           		line_file[i]="";
			           	}
	 					System.out.println(line_file[i]);
	 					i++;
	 							
	 		 	}
	 			i=line_file.length;
	 		 		
	 			       
	 		}
	 		
		
       
        }
	
		
	}
}
