package constitution;



import java.io.IOException;


public class Constitution 
{


 	 public static void main(String[] args) throws IOException 
 	 {
 		 
 		
		 
	        
 		 	try {
	        	Parser.ReadArguments();
	     			
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
	
	

	
	

