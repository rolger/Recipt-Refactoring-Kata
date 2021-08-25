package org.nagarro.abstraction;

import static java.lang.String.format;
import static java.lang.String.valueOf;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class PancakeRecipt implements Recipt {

	@Override
	public String title() {
		return "Pancake Recipt";
	}

	@Override
	public List<String> allSteps(int numberOfServings) {
		return createSteps(numberOfServings, ingredients(numberOfServings));
	}

	private List<String> ingredients(int numberOfServings) {
		int factor = numberOfServings / 4;
		return List.of( //
				valueOf(factor) + " cup all-purpose flour", //
				valueOf(factor * 2) + " tablespoons white sugar", //
				valueOf(factor * 2) + " teaspoons baking powder", //
				valueOf(factor) + " teaspoon salt", //
				valueOf(factor) + " teaspoon of vanilla", //
				valueOf(factor) + " cup milk", //
				valueOf(factor) + " egg", //
				valueOf(factor * 2) + " tablespoons vegetable oil");
	}

	private List<String> createSteps(int numberOfServings, List<String> ingredients) {
		List<String> steps = new ArrayList<>();
		steps.add(MessageFormat.format(
				"In a large bowl, mix {0}, {1}, {2}, {3} and {4}. Make a well in the center, and pour in {5}, {6} and {7}. Mix until smooth. ",
				ingredients.toArray()));
		steps.add(format(
				"Heat a lightly oiled griddle or frying pan over medium high heat. Pour or scoop the batter onto the griddle, using approximately %s cup for each pancake. This yields in %s servings. Brown on both sides and serve hot.",
				"1/" + numberOfServings, numberOfServings));
		return steps;
	}
}