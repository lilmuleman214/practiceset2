
public class MyInteger {
	
	private int value;
	
	public MyInteger(int v){
		value = v;
	}
	
	public int getValue(){
		return value;
	}
	
	public boolean isEven(){
		if (value % 2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd(){
		if (value % 2 == 0)
			return false;
		else
			return true;
	}
	
	public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        if (value == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(value) + 1; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

	public static boolean isEven(int val){
		if (val % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int val){
		if (val % 2 == 0)
			return false;
		else
			return true;
	}
	
	public static boolean isPrime(int val) {
        if (val <= 1) {
            return false;
        }
        if (val == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(val) + 1; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }

	public static boolean isEven(MyInteger ob){
		return ob.isEven();
	}
	
	public static boolean isOdd(MyInteger ob){
		return ob.isOdd();
	}
	
	public static boolean isPrime(MyInteger ob) {
        return ob.isPrime();
    }

	public boolean equals(int val){
		return (val == value);
	}
	
	public boolean equals(MyInteger ob){
		return (ob.value == value);
	}
	
	public static int parseInt(String str){
		return Integer.parseInt(str);
	}
	
	public static int parseInt(char[] chrLst){
		int length = chrLst.length - 1;
		String str = null;
		for (int i = 0; i <= length; i++){
			str = str + chrLst[i];
		}
		
		return parseInt(str);
	}
}
