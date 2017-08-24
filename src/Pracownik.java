import java.io.Serializable;
import java.util.Scanner;

public class Pracownik extends Osoba implements Serializable {
	public String degree;
	public int salary;
	
	public Pracownik() {}
	
	   public Pracownik(String name, String surname, int age, int pesel, String degree, int salary) {
	        super(name, surname, age, pesel);
	        this.degree = degree;
	        this.salary = salary; }

	   public String getDegree(){
		   return degree;}
	   
	   public void setDegree(String degree){
		   this.degree = degree;}
		
	    public int getSalary() {
	        return salary;}

	    public void setSalary(int salary) {
	        this.salary = salary;}

	    @Override
	    public String toString() {
	    	return  String.format("%-10s%-10s%-10d%-10d%-10s%-10d", name, surname, age, pesel, degree, salary );}

		@Override
		public boolean check(String field) {
			return(degree.equals(field) || String.valueOf(salary).equals(field));
		}

		@Override
		public void szukaj(String field,Object[] pTab) {
			for (Object P : pTab) {
				Osoba PY = (Osoba) P;
				if (PY.name.equals(field) || PY.surname.equals(field) || String.valueOf(PY.age).equals(field) || String.valueOf(PY.pesel).equals(field) || PY.check(field))
						System.out.println(PY);
					else
					System.out.println("Nie znaleziono takiego pracownika");
			}
		}

		/*@Override
		public String wypiszReszteParametrow() {
			// TODO Auto-generated method stub
			return null;  */
		}

 
	   
	

