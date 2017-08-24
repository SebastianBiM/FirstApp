import java.io.Serializable;

public abstract class Osoba implements Serializable, fac {
	public String name;
	public String surname;
	public int age;
	public int pesel;
	
	public Osoba(){}
	
    public Osoba(String name, String surname, int age, int pesel) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;   }
    
   // public abstract String wypiszReszteParametrow();
  public abstract boolean check(String field);
   
    public String getName() {
        return name;}

    public void setName(String name) {
        this.name = name;}

    public String getSurname() {
        return surname;}

    public void setSurname(String surname) {
        this.surname = surname;}

    public int getAge() {
        return age;}

    public void setAge(int age) {
        this.age = age;}

    public int getPesel() {
        return pesel;}

    public void setPesel(int pesel) {
        this.pesel = pesel;}
    
    public String toString() {
    	return  String.format("%-10s%-10s%-10d%-10d%-10s%-10d", name, surname, age, pesel);
    }
}    

