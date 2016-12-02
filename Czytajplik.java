package pierwsza_wersja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;


public class Czytajplik {

	     
		
	    private String sciezka;
	     
	    public Czytajplik(String plik_sciezka){
	        sciezka = plik_sciezka;
	    }
	     
	    public String[] OtworzPlik() throws IOException {
	    	
	    	 BufferedReader czytajTekst = new BufferedReader(new InputStreamReader(
		        		new FileInputStream(sciezka), "UTF8"));
	     
	         int liczbaWierszy = CzytajLinie( );
	         String[] tekstDane = new String[liczbaWierszy];
	         String [] zmiana = new String[liczbaWierszy];
	         int i;
	          
	         for(i=0; i < liczbaWierszy; i++){      
	             tekstDane[i] = czytajTekst.readLine();
	             zmiana[i] = tekstDane[i].replace("©Kancelaria Sejmu", " ");  //funkcje zamiana, tutaj bêdzie jeszcze wywyo³ywana funkcja
	             zmiana[i] = zmiana[i].replace("2009-11-16", " ");				// która bêdzie wyszukiwa³a napis, sprawdza³a w której jest linii 
	             																// i bêdzie wyœwietla³a okreœlony zakres za pomoc¹ okreœlenia wartoœæi
	             																// liczbaWierszy
	         }
	             czytajTekst.close();
	             return zmiana;
	    }
	    
	    int CzytajLinie() throws IOException {
	         
	        FileReader plik_do_czytania = new FileReader(sciezka);
	        BufferedReader bf = new BufferedReader(plik_do_czytania);
	         
	        int liczbaLinii = 0;
	        while((bf.readLine()) != null){
	            liczbaLinii++;
	        }
	        bf.close();
	         
	        return liczbaLinii;
	    }
	 
	   
}
