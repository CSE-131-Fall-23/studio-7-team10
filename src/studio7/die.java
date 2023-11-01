package studio7;
 


public class die {
	
	private int n;
	
	public die(int intN) {
		n=intN;
	}
	
	public int callInt() {
		return n;
		
	}
	
	public static int randomNumber(die d) {
		return (int)(Math.random()*(d.callInt()-1)+1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		die d = new die(5);
		int n = d.callInt();
		System.out.println("A random number between 1 and " + n + " is " + randomNumber(d));
	}

}
