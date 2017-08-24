
public class Clothes implements fac {

	public String Shirt;
	public String Shoes;
	public String Jeans;
	
	public Clothes(){}

	public Clothes(String Shirt, String Shoes, String Jeans){
	this.Shirt = Shirt;
	this.Shoes = Shoes;
	this.Jeans = Jeans;
	}	
	public String getShirt(){
		   return Shirt;}
	   
	public void setShirt(String Shirt){
		   this.Shirt = Shirt;}
		
	public String getShoes() {
	        return Shoes;}

	public void setShoes(String Shoes) {
	        this.Shoes = Shoes;}
	
	public String getJeans() {
        return Jeans;}

	public void setJeans(String Jeans) {
        this.Jeans = Jeans;}

	public String toString() {
    	return Shirt + " " + Shoes + " " + Jeans;
	}
	
	@Override
	public void szukaj(String a, Object[] pTab) {
		for (Object P : pTab) {
			if(P instanceof Clothes){

			Clothes PY = (Clothes) P;
			if (PY.Shirt.equals(a) || PY.Shoes.equals(a) || PY.Jeans.equals(a))
				System.out.println(PY);	
			}
		
	}			
}
}
