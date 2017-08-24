import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class All  {
	Osoba[] pTab = new Osoba[0];
	fac[] clo = new fac[0];
	
	private  Osoba[] addOsoba(Osoba[] tab, Osoba osoba) throws IOException {
		Osoba[] tmp = new Osoba[tab.length + 1];

		int i = 0;
		for (Osoba o : tab) {
			tmp[i] = o;
			i++;
		}

		tmp[tmp.length - 1] = osoba;
		return tmp;
	}
	public void dodaj() throws IOException{
		System.out.println("Dodawana osoba jest Pracownikiem Dydaktycznym czy Pracownikiem Administracyjnym?\n1:Pracownikiem Dydaktyczny\n2:Pracownikiem Administracyjnym");
		Scanner wybor2 = new Scanner(System.in);
		int x = wybor2.nextInt();
	
		switch(x){
		case 1:
			System.out.println("Podaj Imie\nNazwisko\nWiek\nPesel\nStopieñ naukowy\nPensje\nPrzedmiot, którego uczy ten pracownik\nSala, w ktorej odbywaja sie zajecia\n");
			Scanner klawiatura = new Scanner(System.in);
			String name = klawiatura.next();
			String surname = klawiatura.next();
			int age = klawiatura.nextInt();
			int pesel = klawiatura.nextInt();  
			String degree = klawiatura.next();
			int salary = klawiatura.nextInt();
			String subject = klawiatura.next();
			int classroom = klawiatura.nextInt();
			System.out.println("Imie: " + name + " Nazwisko: " + surname + " Wiek " + age + " Stopien Naukowy: " + degree + " Pensja: " + salary + "Przedmiot: " + subject + " Sala: " + classroom +"\nOsoba zostala zapisana na liscie pracownikow");

			Nauczyciel P1 = new Nauczyciel();
			P1.setName(name);
			P1.setSurname(surname);
			P1.setAge(age);
			P1.setPesel(pesel);
			P1.setDegree(degree);
			P1.setSalary(salary);
			P1.setSubject(subject);
			P1.setClassroom(classroom);
			pTab = addOsoba(pTab, P1);
			clo = add(P1);

			FileOutputStream fout = new FileOutputStream("ListaPracownikow.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(pTab);
			fout.flush();
			fout.close();	 
			break;
			
		case 2: 
			System.out.print("Podaj Imie\nNazwisko\nWiek\nPesel\nStopieñ naukowy\nPensje\nPodaj stanowisko pracownika\nJego odpowiedzialnosc\n");
			Scanner klawiatura4 = new Scanner(System.in);
			String name2 = klawiatura4.next();
			String surname2 = klawiatura4.next();
			int age2 = klawiatura4.nextInt();
			int pesel2 = klawiatura4.nextInt();  
			String degree2 = klawiatura4.next();
			int salary2 = klawiatura4.nextInt();
			String workplace2 = klawiatura4.next();
			String responsibility2 = klawiatura4.next();
			System.out.println("Imie: " + name2 + " Nazwisko: " + surname2 + " Wiek " + age2 + " Stopien Naukowy: " + degree2 + " Pensja: " + salary2 + "Przedmiot: " + workplace2 + " Sala: " + responsibility2 +"\nOsoba zostala zapisana na liscie pracownikow");

			PracownikAdministracyjny P2 = new PracownikAdministracyjny();
			P2.setName(name2);
			P2.setSurname(surname2);
			P2.setAge(age2);
			P2.setPesel(pesel2);
			P2.setDegree(degree2);
			P2.setSalary(salary2);
			P2.setWorkplace(workplace2);
			P2.setResponsibility(responsibility2);
			pTab = addOsoba(pTab, P2);
			clo = add(P2);
			
			FileOutputStream out = new FileOutputStream("ListaPracownikow.txt");
			ObjectOutputStream oss = new ObjectOutputStream(out);
			oss.writeObject(pTab);			
			out.flush();			
			out.close();
			break;
}
}		

	public  void removeOsoba() throws IOException {
//		System.out.print("Podaj Imie\nNazwisko\nWiek\nPesel\nStopieñ naukowy\nPensje\n");
//		Scanner klawiatura3 = new Scanner(System.in);
//		String name3 = klawiatura3.next();
//		String surname3 = klawiatura3.next();
//		int age3 = klawiatura3.nextInt();
//		int pesel3 = klawiatura3.nextInt();  
//		String degree3 = klawiatura3.next();
//		int salary3 = klawiatura3.nextInt();
		
		Osoba osoba = check();
		
		Osoba[] tmp = new Osoba[pTab.length - 1];

		int i = 0;
		for (Osoba o : pTab) {
			if(!o.equals(osoba)){
				tmp[i] = o;
				i++;
			}
		}
		pTab = tmp;
		
		FileOutputStream out = new FileOutputStream("ListaPracownikow.txt");
		ObjectOutputStream oss = new ObjectOutputStream(out);
		oss.writeObject(pTab);			
		out.flush();			
		out.close();
		
	}

	public  Osoba check() {
		System.out.println("Podaj jedna z danych pracownika ");
		Scanner klawiatura2 = new Scanner(System.in);
		String field = klawiatura2.next();
		
		for (Osoba PY : pTab) {
			if (PY.name.equals(field) || PY.surname.equals(field) || String.valueOf(PY.age).equals(field) || String.valueOf(PY.pesel).equals(field) || PY.check(field))
				return PY;
			else
				System.out.println("Nie znaleziono takiego pracownika");
		}
		return null;
	}
	
	public  void szukaj() {
		System.out.println("Podaj jedna z rzeczy lub jedna z danych pracownika ");
		Scanner klawiatura2 = new Scanner(System.in);
		String field = klawiatura2.next();
		
		for (fac PY : clo) {
			PY.szukaj(field, clo);
		}
	
	}
	private  fac[] add(fac osoba) throws IOException {
		fac[] tmx = new Osoba[clo.length + 1];

		int i = 0;
		for (fac o : clo) {
			tmx[i] = o;
			i++;
		}

		tmx[tmx.length - 1] = osoba;
		return tmx;
	}
	
	private  fac[] clothes(fac[] tab, fac f){
		fac[] cl = new Clothes[tab.length + 1];
		
		int i = 0;
		for (fac o : tab) {
			cl[i] = o;
			i++;
		}

		cl[cl.length - 1] = f;
		clo = cl;
		return cl;
	}
	
	public void wyswietl() throws IOException{
	FileInputStream fout = new FileInputStream("ListaPracownikow.txt");
	ObjectInputStream oos = new ObjectInputStream(fout);
	try {
		pTab = (Osoba[]) oos.readObject();
		for(Osoba o : pTab)
			System.out.println(o);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	fout.close();
	}	
	
	public void wypiszRzeczy(){
		System.out.println("Podaj koszulke, buty lub spodnie\n");
		Scanner klawiatura5 = new Scanner(System.in);
		String field = klawiatura5.next();
		for (fac f : clo) {
			f.szukaj(field, clo);
	}
	}		
	
	public void dodajRzecz(){
		Clothes C1 = new Clothes();
		System.out.println("Podaj koszulke, buty i spodnie\n" );		
		Scanner klawiatura6 = new Scanner(System.in);
		String Shirt = klawiatura6.next();
		String Shoes = klawiatura6.next();
		String Jeans = klawiatura6.next();
		C1.setShirt(Shirt);
		C1.setShoes(Shoes);
		C1.setJeans(Jeans);
		
		clo = clothes(clo, C1);
	}
	
}
