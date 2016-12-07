package constitution;

import java.io.IOException;

public class Chapter {
	
	public void readChapter(String a,String name) throws IOException{
		
		ThrowFile file_C = new ThrowFile(name);
        String[] line_file = file_C.OpenFile();
        String startChapter = a;
        String endChapter = "II";
        
        int i;
	 	for(i=0; i < line_file.length;i++)
	 	{
	 		if(line_file[i].equals("Rozdzia³ "+ startChapter ))
	 		{
	 			while(!(line_file[i].equals("Rozdzia³ "+ endChapter)))
	 			{
	 							System.out.println(line_file[i]);
	 							i++;
	 							
	 		 	}
	 			i=line_file.length;
	 		 		
	 			       
	 	        }
	 		
		
       
        }
        
        
	
	}
	
}
