package inheritanceExample;

public class Audi extends Car{
	public Audi(){
		str=str.concat("an example of Multiple Inheritance. ");
		System.out.println("You are in Audi class - Extending Class Car");
		
	}
	void display(){
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Audi ObjAudi = new Audi();
		//ObjAudi.display();
		
	}
}
