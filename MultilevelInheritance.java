package P1;

class Shape{
	
	void trangle() {
		
		System.out.println("A plan figure with three equal side");
	}
}

class Rectangle extends Shape{
	
	void display() {
		
		System.out.println("Opposite side are equal");
	}
}
class Square extends Rectangle{
	
	void prop() {
		
		System.out.println("All side are equals");
	}
}
public class MultilevelInheritance {
public static void main(String args[]) {
	
	Square s1= new Square();
	
	s1.trangle();
	s1.display();
	s1.prop();
	
	
}
}
