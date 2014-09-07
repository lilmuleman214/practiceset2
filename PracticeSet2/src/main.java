
public class main {

	public static void main(String[] args) {
		MyInteger obj1 = new MyInteger(7);
		MyInteger obj2 = new MyInteger(6);
		String str = "10";
		
		System.out.println(Integer.toString(obj1.getValue()) + " is even #? " + obj1.isEven()); 
		System.out.println(Integer.toString(obj1.getValue()) + " is odd #? " + obj1.isOdd()); 
		System.out.println(Integer.toString(obj1.getValue()) + " is prime #? " + obj1.isPrime()); 
		
		System.out.println("obj equal 7? " + obj1.equals(7)); 
		System.out.println("obj equal 6? " + obj1.equals(6)); 
		System.out.println("obj equal obj2? " + obj1.equals(obj2)); 

	}

}
