package agh.constytution;

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
		     
		    public String[] OpenFile() throws IOException {
		    	
		    	 BufferedReader ReadText = new BufferedReader(new InputStreamReader(
			        		new FileInputStream(path), "UTF8"));
		     
		         int number_lines = ReadTheLines( );
		         String[] TextData = new String[number_lines];
		         String [] changed = new String[number_lines];
		         int i;
		          
		         for(i=0; i < number_lines; i++){      
		             TextData[i] = ReadText.readLine();
		             changed[i] = TextData[i].replace("©Kancelaria Sejmu", " ");  //funkcje zamiana, tutaj bêdzie jeszcze wywyo³ywana funkcja
		             changed[i] = changed[i].replace("2009-11-16", " ");				// która bêdzie wyszukiwa³a napis, sprawdza³a w której jest linii 
		             changed[i] = changed[i].replace("- "+'\n',"");																// i bêdzie wyœwietla³a okreœlony zakres za pomoc¹ okreœlenia wartoœæi
		             																// number_lines
		         }
		             ReadText.close();
		             return changed;
		    }
		    
		    int ReadTheLines() throws IOException {
		         
		        FileReader file_to_read = new FileReader(path);
		        BufferedReader bf = new BufferedReader(file_to_read);
		         
		        int counter_line = 0;
		        while((bf.readLine()) != null){
		            counter_line++;
		        }
		        bf.close();
		         
		        return counter_line;
		    }
		 
		   
	}


