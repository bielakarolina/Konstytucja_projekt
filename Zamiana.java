package pierwsza_wersja;

public class Zamiana {
		
	 
		public Zamiana(int liczbaWierszy){
			wiersze=liczbaWierszy;
		}
		
		public void Zamien (String[] wiersze){
		String[] zmien = new String[wiersze];
		
		for(wiersz=;wiersz<liczbaWierszy;wiersz++)
		zmien[wiersz] = zmien.replace("�Kancelaria Sejmu", " ");
		zmien[wiersz] = zmien.replace("2009-11-16", " "); //doda� zamienianie pauzy i ko�ca linii, �aczenie wyraz�w
		System.out.println(zmien[wiersz]);
	    }
		

		
		public 
	}


