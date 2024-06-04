# Notes on how to approach the challenge question

### How to approach this question

- Q: Re-state the question--what is really being asked here?
    - A: Take a positive, large number and return the sum of each individual digit
        - Ex: Input: 543 program should transform to => 5 + 4 + 3 which returns a sum of 12

- Q: How can we do this?
    - A: We have to be able to look at each decimal place value one at a time

- Q: How can we look at each decimal placeholder value?
    - A: We can turn the number into a String
            
            1. Iterate through each character

            2. Retrieve the value of each character upon each iteration

            3. Use addition assignment operator += to aggregate sum of each iteration

- Q: How else can we look at each decimal placeholder value?
  - A: Using the modulo operator % and integer division /
            
            1. The modulo operator returns the last digit of with % 10 because decimal is base 10

            - Ex: 
                156 % 10 = 6
        
            - Ex: 
                6 % 10 = 6 Think of the modulo returning the remainder

            2. When you divide by 10 the / operator removes the last digit
        
            - Ex:
             
            1. 15645 / 10 = 1564

            2. 1564 / 10 = 156

            3. 156 / 10 = 15

            4. 15 / 10 = 1
