package inheritanceExample;

public class Car extends Vehicle{

	public Car(){
		str=str.concat("is ");
		System.out.println("You are in Class Car - Extends Superclass Vehicle");
	}
}
