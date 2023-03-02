//Addition
public class Addition {
	int getAddition(int a , int b) {
		
		int c = a+b;
		return c;
	}
	public static void main(String[] args) {
		Addition addition = new Addition();
		int add = addition.getAddition(20 , 40);
		System.out.println("Addition>>" + add);
		
	}

}
