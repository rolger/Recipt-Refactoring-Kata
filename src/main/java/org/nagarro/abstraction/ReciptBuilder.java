package org.nagarro.abstraction;

import java.util.List;
import java.util.stream.Collectors;

public class ReciptBuilder {

	Recipt recipt;

	public ReciptBuilder() {
		this(new PancakeRecipt());
	}

	public ReciptBuilder(Recipt pancake) {
		super();
		this.recipt = pancake;
	}

	public String build(int numberOfServings) {
		if (numberOfServings == 0) {
			return "";
		}

		return recipt.title() + "\n\n" + format(recipt.allSteps(numberOfServings));
	}

	private String format(List<String> allSteps) {
		return allSteps.stream().collect(Collectors.joining());
	}

}
