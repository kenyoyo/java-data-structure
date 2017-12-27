import java.util.Arrays;

public class UtilityMethod {
	//Swap the value between specified index of data list.
	public static<T> void swap(T[] dataList, int index1, int index2) {
		T temp = dataList[index1];
		dataList[index1] = dataList[index2];
		dataList[index2] = temp;
	}
	
	//Find greatest common divisor of values a and b.
	public static int gcd(int a, int b) {
		//Using Euclid's algorithm
		if(a%b == 0) 
			return b;
		else 
			return gcd(b, a%b);
		
	}
	
	//Find least common multiple of values a and b.
	public static int lcm(int a, int b) {
		return a*b / gcd(a,b);
	}
	
	//If n is prime number return true, otherwise return false.
	public static boolean primalityTest(int n) {
		for(int i = 2; i<Math.sqrt(n); i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
	
	//Count factor number of n. 
	public static int countFactor(int n) {
		int sum = 0;
		
		for(int i = 2; i<Math.sqrt(n); i++) {
			if(n%i == 0) {
				//print(factor of n is i.)
				sum++;
			}
		}
		return sum;
	}
	
	//List all permutaion of all sequence of information.
	public static <T> void permutation(T[] array) {
		//Using Heap's algorithm
		int[] temp = new int[array.length];
		Arrays.fill(temp, 0);
		
		System.out.println(Arrays.toString(array));
		
		int i=0;
		while(i < array.length) {
			if(temp[i] < i) {
				if(i % 2 == 0)
					swap(array, 0, i);
				else
					swap(array, temp[i], i);
				System.out.println(Arrays.toString(array));
				temp[i] += 1;
				i = 0;
			} else {
				temp[i] = 0;
				i+=1;
			}
		}
	}

}
