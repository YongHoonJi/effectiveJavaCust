package test.optional.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.Test;


public class OptionalFuncTest {

	@Test
	public void features() {

		try {

			String str = "value of Optional";
			String str2 = null;

			// to Optional
			Optional<String> os1 = Optional.of(str);
			System.out.println("os1:" + os1.get());
			
			// isPresent
			if(os1.isPresent()) System.out.println("os1 present!");
			
			// ifpresent
			os1.ifPresent(s -> System.out.println("[" + s + "]"));
			
			// of : null value 불가
			//Optional<String> os2 = Optional.of(s2); // NPE
			//System.out.println("os2:" + os2.get());
			
			// ofNullable : null value 가능
			Optional<String> os3 = Optional.ofNullable(str2); // NPE
			System.out.println("os3:" + os3); // No value present
			
			// ofNullable 2
			Map<String, String> hm = new HashMap<String, String>();
			hm.put("1", "Dev1");
			hm.put("2", "Dev2");
			hm.put("3", "Dev3");
			System.out.println("hm present:"+Optional.ofNullable(hm.get("1")).orElse("NONE"));
			System.out.println("hm empty:"+Optional.ofNullable(hm.get("4")).orElse("NONE"));	
			
			// orElse
			System.out.println("present orelse:"+os1.orElse("NONE"));
			System.out.println("empty orelse:"+os3.orElse("NONE"));
			
			// orElseGet
			System.out.println("present orelse:"+os1.orElseGet(() -> ("NONE")));
			System.out.println("empty orelse:"+os3.orElseGet(() -> ("NONE")));
			
			System.out.println("os1 eager:"+os1.orElse(B()));
		    System.out.println("os1 lazy:"+os1.orElseGet(() -> B()));		
		    
			System.out.println("os3 eager:"+os3.orElse(B()));
		    System.out.println("os3 lazy:"+os3.orElseGet(() -> B()));
			
			// filter
			System.out.println("os1 filter : "+os1.filter( s -> s.contains("value")));
			System.out.println("os3 filter : "+os3.filter( s -> s.contains("Value")));
			
			// empty
			Optional<String> os4 = Optional.empty();
			System.out.println("os4:"+os4);
			
			// map
			Optional<String> os5 = Optional.of(str);
			System.out.println("os5:"+os5);
			System.out.println("os5 mapped:"+os5.map(String::toUpperCase));
			
			// flatmap
			Optional<Optional<String>> os6 = Optional.of(Optional.of(str));
			System.out.println("os6:"+os6);
			System.out.println("os6 flatmap:"+os6.flatMap(s -> s.map(String::toUpperCase)));
		

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static String B() {
	    System.out.println("B()...");
	    return "B";
	}

}
