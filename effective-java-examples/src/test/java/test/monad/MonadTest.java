package test.monad;

import org.junit.Test;

public class MonadTest {
	
	@Test
	public void test(){
		Wrap<Integer> a = Wrap.of(1);
		Wrap<Integer> b = a.map(i -> i+9);
		Wrap<Integer> c = b.map(i -> i*11);
		c.map(i -> i*10).map(i -> i+11);
		
		Wrap<Integer> d = Wrap.of(1);
		d.map(this::inc);
	}
	
	Wrap<Integer> inc(Integer x){
		return Wrap.of(x+1);
	}

}
