package variance;

import java.util.ArrayList;
import java.util.List;

public class ContraVarianceTest {
	
	// animal를 상속한 어떤 타입이든 - upper casting - read only - Animal인 것을 보장 - 공변 
	public static void test_covariance(List<? extends Animal> list){
		list.stream().forEach(s -> {
			s.breathe();
		});
	}
	
	// Dog의 상위 타입이면 어떤 것이든 - down casting - write only - Dog인 것을 보장 - 역변 
	public static void test_contravariacne(List<? super Dog> list){
		// 어떤타입의 상위 클래스가 될지 모름.
		Object obj = list.get(0);
		list.add(new Dog());
	}
	
	public static void main(String[] args) {
		List<Animal> alist = new ArrayList<Animal>();
		alist.add(new Cat());
		alist.add(new Wolf());
		System.out.println("[Co-variance]");
		test_covariance(alist);
		System.out.println("[Cotra-variance]");
		test_contravariacne(alist);
		alist.stream().forEach(s -> s.breathe());
	}
}
