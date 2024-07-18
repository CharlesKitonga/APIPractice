package TrainingJava;

public class Students {
	
	public Students() {
		System.out.println("Hi checking constructors");
	}
	
	int rollNumber ;
	String name;
	
	public Students(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
	
	public void display() {
		System.out.println("Roll Number is " + rollNumber + " and Name is " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students std = new Students();
		
		Students std1 = new Students(10, "Kyalo");
		Students std2 = new Students(20, "Natalie");
		
		std1.display();
		std2.display();

	}

}
