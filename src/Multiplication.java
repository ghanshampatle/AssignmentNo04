//Multiplication
public class Multiplication {
	
	int getMultiplication(int a , int b ) {
		int c = a*b;
		return c;
	}
	public static void main(String[] args) {
		Multiplication multiplication = new Multiplication();
		int M = multiplication.getMultiplication(15, 20);
		System.out.println("Multiplication>>" +M);
		
	}

}
