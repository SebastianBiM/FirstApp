import java.io.Serializable;
import java.util.Scanner;

public class Nauczyciel extends Pracownik implements Serializable {
	public String subject;
	public int classroom;
	
	public Nauczyciel() {}
	
	public Nauczyciel(String name, String surname, int age, int pesel, String degree, int salary, String subject, int classroom) {
	        super(name, surname, age, pesel, degree, salary);
	        this.subject = subject;
	        this.classroom = classroom; }

	public String getSubject(){
		   return subject;}
	   
	public void setSubject(String subject){
		   this.subject = subject;}
		
	public int getClassroom() {
	        return classroom;}

	public void setClassroom(int classroom) {
	        this.classroom = classroom;}
	
	@Override
	public String toString() {
	    	return  String.format("%-10s%-10s%-10d%-10d%-10s%-10d", name, surname, age, pesel, degree, salary, subject, classroom );}
	
	@Override
	public boolean check(String field) {
		boolean result = super.check(field);
		return (subject.equals(field) || String.valueOf(classroom).equals(field));
//		return super.check(field);
	}	
	}

//	public Osoba check(Osoba[] pTab) {
//		
//		for (Osoba PY : pTab) {
//			if (PY.subject.equals(field) || PY.classroom.equals(field))
//				return PY;
//			else
//				System.out.println("Nie znaleziono takiego pracownika");
//		}
//		return null;
//	}
	

