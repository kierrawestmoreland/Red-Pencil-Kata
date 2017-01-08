# Red-Pencil_Kata
Directions:

The scope of the Code Kata is the implementations of the rules for activation and end of red pencil promotions.
A red pencil promotion starts due to a price reduction. 
The price has to be reduced by at least 5% but at most be 30% and the previous price had to be stable for at least 30 days.
A red pencil promotion lasts 30 days as the maximum length.
If the price is further reduced during the red pencil promotion the promotion will not be prolonged by that reduction.
If the price is increased during the red pencil promotion the promotion will be ended immediately.
If the price is reduced during the red pencil promotion so that the overall reduction is more than 30% with regard to the original price, the promotion is ended immediately.

After a red pencil promotion is ended additional red pencil promotions may follow – as long as the start condition is valid: 
the price was stable for 30 days and these 30 days don’t intersect with a previous red pencil promotion.

*Source: https://stefanroock.wordpress.com/2011/03/04/red-pencil-code-kata/*

#Thoughts during coding:

I want to first think about and declare variables I would need throughout the program like price, red pencil sale, and days. 
Next I need to think about what my first test should look like. Think small steps. 

First, I'm going to test to see if I can return a price, fail, & pass that test.
Next, I want to see if I can get a price reduction, fail, & pass. 
Next test should test to see if the price reduction is within the red pencil promo.
Next I want to test if the promo will stop if the reduction is higher than the sale % range.
