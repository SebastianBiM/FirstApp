import java.io.Serializable;
import java.util.Scanner;

public class PracownikAdministracyjny extends Pracownik implements Serializable {
	public String workplace;
	public String responsibility;
	
	public PracownikAdministracyjny() {}
	
	public PracownikAdministracyjny(String name, String surname, int age, int pesel, String degree, int salary, String workplace, String responsibility) {
	        super(name, surname, age, pesel, degree, salary);
	        this.workplace = workplace;
	        this.responsibility = responsibility; }

	public String getWorkplace(){
		   return workplace;}
	   
	public void setWorkplace(String workplace){
		   this.workplace = workplace;}
		
	public String getResponsibility() {
	        return responsibility;}

	public void setResponsibility(String responsibility) {
	        this.responsibility = responsibility;}

	@Override
	public String toString() {
	    	return  String.format("%-10s%-10s%-10d%-10d%-10s%-10d", name, surname, age, pesel, degree, salary, workplace ,responsibility );}
	
	public boolean check(String field) {
		boolean result = super.check(field);
		return (workplace.equals(field) || responsibility.equals(field));
	}

}
