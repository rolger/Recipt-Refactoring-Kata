# Same Level of Abstraction Kata

Starting point is some code without any abstractions, which means everything is on exactly one level. It just describes the how the pancake recipt is implemented. 

The code is too simple, so why should we structure it. There are no Sonar issues and it's small (= 14 lines of code). But looking at the class it's hard to understand what it does and you have no idea why somebody is going to use it.

Further, without the abstractions the code doesn't fullfill some design principles. Especially it's not open for new requirements.


## Feature 1
We need to implement our awesome pancake recipt for 16 services. Implement this feature and also an according Unit Test. Following these steps:

- identify the needed abstractions to refactor the code
- refactor the code applying your abstractions
- take care that your abstractions fit the new requirement so that your implementation is prepared for the change


## Feature 2
We need to provide a new format for a customer. The customer request a markdown formating containing the title, a list of ingredients and a numbered list of steps.


```
# Awesome Pancake

## Ingredients for 4 services
* 1 cup all-purpose flour
* 2 tablespoons white sugar
* 2 teaspoons baking powder 
* 1 teaspoon salt
* 1 cup milk
* 1 egg
* 2 tablespoons vegetable oil

## Directions
### Step 1
In a large bowl, mix 1 cup all-purpose flour, 2 tablespoons white sugar, 2 teaspoons baking powder and 1 teaspoon salt. Make a well in the center, and pour in 1 cup milk, 1 egg and 2 tablespoons vegetable oil. Mix until smooth.
### Step 2
Heat a lightly oiled griddle or frying pan over medium high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. This yields in 4 servings. Brown on both sides and serve hot.
```

## Feature 3
Our customer wants to remove the amount and the units from the direction description since this information is already listed in the ingredients.

```
# Awesome Pancake

## Ingredients for 4 services
* 1 cup all-purpose flour
* 2 tablespoons white sugar
* 2 teaspoons baking powder 
* 1 teaspoon salt
* 1 cup milk
* 1 egg
* 2 tablespoons vegetable oil

## Directions
### Step 1
In a large bowl, mix flour, sugar, baking powder and salt. Make a well in the center, and pour in milk, egg and oil. Mix until smooth.
### Step 2
Heat a lightly oiled griddle or frying pan over medium high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. This yields in 4 servings. Brown on both sides and serve hot.
```
