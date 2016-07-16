package org.effective.java.examples.chapter01.item00;

import java.util.ArrayList;
import java.util.List;

public class Item<T> {
	private Item(){}
	private List<T> ingredients = new ArrayList<T>();
	public static Item createInstance(){
		return new Item();
	}
	public void add(T t){
		ingredients.add(t);
	}
	
	public void printIngredients(){
		this.ingredients.forEach(s -> System.out.println(s));
	}
}
