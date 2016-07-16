package org.effectivejava.examples;

import org.effective.java.examples.chapter01.item00.Item;
import org.junit.Test;

public class TestChap02Item01 {
	@Test
	public void test_creatInstance(){
		Item<String> i = Item.createInstance();
		i.add("number 1");
		i.add("number 2");
		i.printIngredients();
		
		Item<Integer> integerItem = Item.createInstance();
		integerItem.add(1);
		integerItem.add(2);
		integerItem.printIngredients();
	}
}
