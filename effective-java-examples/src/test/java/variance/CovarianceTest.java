package variance;

import java.util.ArrayList;
import java.util.List;

public class CovarianceTest {

	public class Mammal{
		public void breed(){
			System.out.println("Give a birth.");
		}
		
		public void move(){
			System.out.println("Move.");
		}
	}
	
	public class Human extends Mammal{
		@Override
		public void move(){
			System.out.println("Walk with legs.");
		}
	}
	
	public class Dolphine extends Mammal{
		@Override
		public void move(){
			System.out.println("Swim with fins.");
		}
	}
	
	public void test_array(){
		Mammal[] mammals = new Human[3];
		mammals[0] = new Dolphine();
	}
	
	public void test_list(){
		List<Human> mammals = new ArrayList<Human>();
		mammals.add(new Human());
		mammals.add(new Human());
		mammals.add(new Human());
		// compile error
		//mammals.set(0, new Dolphine());
	}
	
	public static void main(String[] args) {
		// runtime error : ArrayStoreException
		new CovarianceTest().test_array();
		// compile error
		new CovarianceTest().test_list();
	}
}
