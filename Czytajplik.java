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
	             zmiana[i] = tekstDane[i].replace("�Kancelaria Sejmu", " ");  //funkcje zamiana, tutaj b�dzie jeszcze wywyo�ywana funkcja
	             zmiana[i] = zmiana[i].replace("2009-11-16", " ");				// kt�ra b�dzie wyszukiwa�a napis, sprawdza�a w kt�rej jest linii 
	             																// i b�dzie wy�wietla�a okre�lony zakres za pomoc� okre�lenia warto��i
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
