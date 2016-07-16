package org.effectivejava.examples;

import java.util.Collections;

import org.effectivejava.examples.chapter02.item02.builder.NutritionFacts;
import org.junit.Test;

public class TestChap02Item02 {
	@Test
	public void test_builder(){
		NutritionFacts facts 
		= new NutritionFacts.Builder(12,3)
				.carbohydrate(100).fat(20).build();
		System.out.println(facts.toString());
	}
	
}
