// Noninstantiable utility class
package org.effectivejava.examples.chapter02.item04;

public class UtilityClass {
	// Suppress default constructor for noninstantiability
	private UtilityClass() {
		throw new AssertionError("noninstant class!");
	}
	
	public static void main(String[] args) {
		new UtilityClass();
	}
}
