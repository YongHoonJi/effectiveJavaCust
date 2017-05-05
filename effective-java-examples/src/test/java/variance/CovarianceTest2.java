package variance;

import java.util.ArrayList;
import java.util.List;

public class CovarianceTest2 {
	
	private static List<Number> mainNumber = new ArrayList<Number>();
	
	public static long sum(Number[] numbers) {
		long summation = 0;
		for (Number number : numbers) {
			summation += number.longValue();
		}
		return summation;
	}

	static long sum(List<Number> numbers) {
		long summation = 0;
		for (Number number : numbers) {
			summation += number.longValue();
		}
		return summation;
	}
	
	static long sumWithExtends(List<? extends Number> numbers) {
		long summation = 0;
		for (Number number : numbers) {
			summation += number.longValue();
		}
		return summation;
	}
	
	public static void main(String[] args) {
		Integer[] arrInts = {1,2,3,4,5};  
		Long[] arrLongs = {1L, 2L, 3L, 4L, 5L};  
		Double[] arrDoubles = {1.0, 2.0, 3.0, 4.0, 5.0};
		// 배열을 사용한 경우
		System.out.println(sum(arrInts));  
		System.out.println(sum(arrLongs));  
		System.out.println(sum(arrDoubles));
		
		// List는 Generic이므로 polymorphism 사용에 제한적.
		List<Integer> listInt = new ArrayList<Integer>();
		List<Long> listLong = new ArrayList<Long>();
		List<Double> listDouble = new ArrayList<Double>();
		// Generic is invariance
		//sum(listInt);
		
		// Make Generic into covariance. Upcast Integer to Number. Read only
		sumWithExtends(listInt);
		
	}
}
