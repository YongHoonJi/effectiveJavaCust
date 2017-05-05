package variance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class VarianceTest<A,B> {
	
	private A a;
	
	private List<A> aList = new ArrayList<A>();
	
	private void addToA(A _a){
		aList.add(_a);
	}
	
	// _aList를 읽어오기 위한 부분 (하지만 쓸수는 없다. _aList가 모두 A 로 캐스팅 되므로 어떤 타입으로 add 되야할지를 컴파일러가 알 수가 없음) 
	private void addToAList(Collection<? extends A> _aList) {
		for(A a:_aList){
			this.aList.add(a);
			//_aList.add("11");
		}
	}
	
	// _alist를 저장하는 부분(하지만 읽어올수는 없다. 읽어오려면 degrade 해야함
	private void copyAlist(Collection<? super A> _alist) {
		for(A ele:aList){
			_alist.add(ele);
		}
	}

	
	public static void main(String[] args) {
		VarianceTest<Number, Integer> variance = new VarianceTest<>();
		
		List<Number> sList = Arrays.asList(1,2,3);
		List<Integer> iList = Arrays.asList(1,2,3);
		List<Object> oList = new ArrayList<Object>();
		//PECS(Producer, Extends - Consumer, Super)
		variance.addToA(11);
		variance.addToA(22);
		variance.addToA(33);
		
		variance.addToAList(sList);
		
		variance.addToAList(iList);
		variance.copyAlist(oList);
		
		
	}
}
