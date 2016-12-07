package constitution;

import java.io.IOException;

public class Article {

	public void  readArticle( String x, String y,String name) throws IOException{
		
		ThrowFile file_A = new ThrowFile(name);
        String[] line_file = file_A.OpenFile();
        int startArticle = Integer.parseInt(x);
        int endArticle = Integer.parseInt(y);
        
        int i;
	 	for(i=0; i < line_file.length;i++)
	 	{
	 		if(line_file[i].equals("Art. "+ startArticle +"."))
	 		{
	 			while(!(line_file[i].equals("Art. "+ (endArticle+1) +".")))
	 			{
	 							System.out.println(line_file[i]);
	 							i++;
	 							
	 		 	}
	 			i=line_file.length;
	 		 		
	 			       
	 		}
	 		
		
       
        }
	
		
	}
}
