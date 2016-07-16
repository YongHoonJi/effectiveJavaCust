// Builder Pattern - Pages 14-15
package org.effectivejava.examples.chapter02.item02.builder;

import com.google.common.base.MoreObjects;

public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int carbohydrate;
	private final int sodium;

	public static class Builder {
		// Required parameters
		private final int servingSize;
		private final int servings;

		// Optional parameters - initialized to default values
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public Builder sodium(int val) {
			sodium = val;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}

	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}

	public int getServingSize() {
		return servingSize;
	}

	public int getServings() {
		return servings;
	}

	public int getCalories() {
		return calories;
	}

	public int getFat() {
		return fat;
	}

	public int getCarbohydrate() {
		return carbohydrate;
	}

	public int getSodium() {
		return sodium;
	}
	
	public String toString(){
		return MoreObjects.toStringHelper(NutritionFacts.class)
		.add("servingSize", this.servingSize)
		.add("servings", this.servings)
		.add("calories", this.calories)
		.add("carbohydrate", this.carbohydrate)
		.add("fat", this.fat)
		.add("sodium", this.sodium)
		.toString();
		
	}
}