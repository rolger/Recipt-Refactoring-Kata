package org.nagarro.abstraction;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ReciptTest {

    final Recipt subject = new Recipt();

    @Test
    void testDefault() {
    	var result = subject.recipt("bla");
        
    	assertThat(result).isEmpty();
    }
    
    @Test
    void test1() {
    	var result = subject.recipt("thing1");
        
    	assertThat(result).isEqualTo("Thing1\n"
    			+ "\n"
    			+ "In a large bowl, mix 1 cup all-purpose flour, 2 tablespoons white sugar, 2 teaspoons baking powder, 1 teaspoon salt and 1 teaspoon of vanilla. Make a well in the center, and pour in 1 cup milk, 1 egg and 2 tablespoons vegetable oil. Mix until smooth. Heat a lightly oiled griddle or frying pan over medium high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. This yields in 4 servings. Brown on both sides and serve hot."
    			);
    }


    @Test
    void test2() {
    	var result = subject.recipt("thing2");
        
    	assertThat(result).isEqualTo("Thing2\n"
    			+ "\n"
    			+ "In a large bowl, mix 2 cup all-purpose flour, 4 tablespoons white sugar, 4 teaspoons baking powder, 2 teaspoon salt and 2 teaspoon of vanilla. Make a well in the center, and pour in 2 cup milk, 2 egg and 4 tablespoons vegetable oil. Mix until smooth. Heat a lightly oiled griddle or frying pan over medium high heat. Pour or scoop the batter onto the griddle, using approximately 1/8 cup for each pancake. This yields in 8 servings. Brown on both sides and serve hot."
    			);
    }
}
