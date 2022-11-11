public class Harshad {
	
	public static void main(String[] args) {
		System.out.println(isHarshad(51));
		System.out.println(isHarshad(3));
		System.out.println(isHarshad(481));
		System.out.println(isHarshad(89));
		System.out.println(isHarshad(516));
		
	}
	
	public static boolean isHarshad(int n) {
		if (n < 0) {
			return isHarshad(Math.abs(n));
		}
		
		if (n < 10) {
			return true;
		}
		
		return n % digitSum(n, 0) == 0;
	}
	
	private static int digitSum(int n, int sum) {
		if (n == 0) {
			return sum;
		}
		
		return digitSum(n / 10, sum + (n % 10) );
	}
}