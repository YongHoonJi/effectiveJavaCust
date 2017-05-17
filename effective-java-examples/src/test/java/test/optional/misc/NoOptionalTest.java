package test.optional.misc;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class NoOptionalTest {
	@Test
	public void test(){
		System.out.println(f("10"));
		System.out.println(f("_"));
		
		System.out.println(f2(0, "10"));
		System.out.println(f2(0, "_"));
		
		assertEquals(10, f3("10").get("suc"));
		assertEquals("exception", ((Exception)f3("_").get("fail")).getMessage());
		
		try {
			System.out.println(f4("_"));
		} catch (Exception e) {
			System.out.println("exception::"+e.getMessage());
		}
	}
	
	// 지정값 혹은 null을 리턴할 경우
	// 점검되지 않은 오류가 확산
	// 오류 점검이 어려움
	private int f(String s){
		try {
			return Integer.parseInt(s);
		} catch (Exception e) {
			return 0;
		}
	}
	
	// 예외발생에 대해 인수로 지정된 값을 리턴
	private int f2(int d, String s){
		try {
			return Integer.parseInt(s);
		} catch (Exception e) {
			return d;
		}
	}
	
	private Map<String, Object> f3(String s){
		Map<String, Object> m = new HashMap<>(); 
		try {
			m.put("suc", new Integer(Integer.parseInt(s)));
		} catch (Exception e) {
			
			m.put("fail", new Exception("exception"));
		}
		return m;
	}
	
	// exception방식
	private int f4(String s) throws Exception{
		try {
			return Integer.parseInt(s);
		} catch (Exception e) {
			throw new Exception("exception");
		}
	}
}
