package org.effectivejava.examples.variance;

import java.util.ArrayList;
import java.util.List;

public class OsTest {
	
	public static void main(String[] args) {
		Linux l = new RedHat();
		l.command();
		
		// generic is invariance
		//List<Linux> ls = new ArrayList<RedHat>();
		List<Linux> rl = new ArrayList<Linux>();
		rl.add(new RedHat());
		rl.add(new CentOS());
		readLinux(rl);
		
		List<RedHat> rrl = new ArrayList<RedHat>();
		rrl.add(new RedHatChild());
		readLinux(rrl);
		
		List<Linux> wl = new ArrayList<Linux>();
		writeLinx(wl);
		
		
	}

	// Producer - Extends
	private static void readLinux(List<? extends Linux> rl){
		rl.stream().forEach(r -> r.command());
	}
	
	private static void writeLinx(List<Linux> rl){
		rl.add(new RedHatChild());
	}

}
