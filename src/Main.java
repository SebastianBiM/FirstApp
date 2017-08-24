import java.util.*;
import java.io.*;
import java.io.Serializable;


public class Main implements Serializable {

	public static void main(String[] args) throws IOException  {
		
		boolean end = true;
		All k = new All();

		while(end){
				
		System.out.println("Wybierz opcje, ktora chcesz wykonac\n1:Dodawanie pracownikow\n2:Wyswietlenie danych pracownika\n3:Usuwanie pracownikow\n4:Wyswietl wszystkich pracownikow\n5:Dodaj nowa rzecz\n6:Wyswietl rzecz\n7:Wyszukaj rzeczy lub pracownika\n8:Zakoncz");
		Scanner wybor = new Scanner(System.in);
		int x = wybor.nextInt();
		
		switch (x){
		case 1:
		k.dodaj();
		break;
		
		case 2:
		Osoba o = k.check();
		System.out.println(o);
		break;
		
		case 3:	
		k.removeOsoba();
		break;
		
		case 4:
		k.wyswietl();	
		break;
		
		case 5:
		k.dodajRzecz();
		break;
		
		case 6:	
		k.wypiszRzeczy();	
		break;
		
		case 7:
		k.szukaj();
		break;
		
		case 8:
		end = false;
	}			
}
}
}	