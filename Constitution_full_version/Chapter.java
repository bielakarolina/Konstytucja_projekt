package constitution;

import java.io.IOException;

public class Chapter {
	
	public void readChapter(int x,String name) throws IOException{
		
		ThrowFile file_C = new ThrowFile(name);
        String[] line_file = file_C.OpenFile();
        String startChapter = ArabicToRoman.changetoroman(x);
        String endChapter = ArabicToRoman.changetoroman(x+1);
        		
                
	 	for(int i=0; i < line_file.length;i++)
	 	{
	 		if(line_file[i].equals("Rozdzia� "+ startChapter ))
	 		{
	 			while(!(line_file[i].equals("Rozdzia� "+ endChapter)))
	 			{
	 							System.out.println(line_file[i]);
	 							i++;
	 							
	 		 	}
	 			i=line_file.length;
	 		 		
	 			       
	 	        }
	 		
		
       
        }
        
        
	
	}
	
}
