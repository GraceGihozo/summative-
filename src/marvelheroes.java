//Can a class inherit multiple classes in java? justify your answer.
// Answer NO because of the diamond problem, Java does not support multiple inheritance.


// 1st class
//
class Listitems 
{
	void walk()
	{
		//When this method is called, a print statement will be executed.
		System.out.println("List items of marvel heroes ");
	}
}
//  2nd class
//first parent class 
class IronMan extends Listitems 
{   
    
	void walk()
	{
		//When this method is called, a print statement will be executed.
	System.out.println("Iron Man is marvel heroes ");	
	}
}
// 3rd class
//second parent class 
class Punisher extends Listitems  
{
	void walk()
	{
	System.out.println("Punisher  is marvel heroes");	
	}
}
// 4th class
//Inheriting from multiple classes 
// this will generate error
public class marvelheroes extends Punisher,IronMan  {
	// Main driver method
	public void test() {
		// which will throw compilation error
		walk();
	}

}
