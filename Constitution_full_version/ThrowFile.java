package constitution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;


public class ThrowFile {

    
			
		    private String path;
		     
		    public ThrowFile(String file_path){
		        path = file_path;
		    }
		     
		    public String[] OpenFile() throws IOException //funkcja otwiera plik od razu zamieniają przeczytane linie
		    												//w których wsytępuje zakazany ciąg znaków lub znak na puste pole
		    {
		    	
		    	BufferedReader ReadText = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF8"));
		    
		       	int number_lines = ReadTheLines( );
		        String[] TextData = new String[number_lines];
		                
		         for(int i=0; i < number_lines; i++)
		         {      
		        	 TextData[i] = ReadText.readLine();
		            
		         }
		         
		             ReadText.close();
		             String[]ChangedTextData = ChangeLines(TextData);
		             return ChangedTextData; 
		             
		    }     
		          
		    String[] ChangeLines (String [] Table ) throws IOException
		    {
		    	int number_lines = ReadTheLines( );
		    	String [] changed = new String[number_lines];
		    	String word=" ";
		    	for(int i = 0; i < number_lines; i++)
		    	{
		    		
		    		changed[i] =word+ Table[i].replace("©Kancelaria Sejmu", " ");
		    		word ="";
		             changed[i] = changed[i].replace("2009-11-16", " ");
		             													// która bêdzie wyszukiwa³a napis, sprawdza³a w której jest linii 
		            if(changed[i].equals(changed[i].toUpperCase()))
		            {
		           		changed[i]="";
		           	}
		    	     
		            
		            if(changed[i].endsWith("-") )
		            {
		            	
		               changed[i] = changed[i].replace("-", "");
		               word ="";
		               changed[i] = changed[i].substring(0, changed[i].length());
                       int lastWord = changed[i].lastIndexOf(" ");
                       word = changed[i].substring(lastWord + 1);
                       changed[i] = changed[i].substring(0, lastWord);
		         
		            }
		         
		    	}
		    	
		    	return changed ;
		    	
		    }
		            
		    
		    
		    int ReadTheLines() throws IOException 
		    {
		         
		        FileReader file_to_read = new FileReader(path);
		        BufferedReader bf = new BufferedReader(file_to_read);
		         
		        int counter_line = 0;
		        while((bf.readLine()) != null)
		        {
		            counter_line++;
		        }
		        bf.close();
		        return counter_line;
		    }
}		 


