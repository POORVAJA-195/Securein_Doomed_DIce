# **PROBLEM STATEMENT: The Doomed Dice Problem**

Given two six-sided dice named Die A and Die B, each with faces numbered from 1 to 6.
The dice are rolled simultaneously and have to find the total combinations possible, distribution of all possible combinations and probability of all possible sums occuring.

## **PART-A**

### **1.** **TOTAL POSSIBLE COMBINATIONS:**
   
   * The formula for finding the total possible combinations is the (No. of faces of the object) power (No. of objects).

   * In this case, the object given is Dice.

   Number of faces of the dice = 6

   Number of dice rolled = 2

   Thus, 6^2 = 36 total combinations.

   #### **OUTPUT SCREENTSHOT:**

   ![image](https://github.com/POORVAJA-195/Securein_Doomed_DIce/assets/104772332/89710bd9-ed71-4f07-8ec3-2b495d1946fe)

### **2.** **DISTRIBUTION OF ALL POSSIBLE COMBINAITONS:**

   * To print the distribution of all possible combinations, 2 for-loops are executed.

   * The first for-loop iterates through the first dice values and second for-loop iterates through the second dice values.

   * The combinations are printed in the format of 6x6 matrix.

   * The first element of the dice1 is combined with all the values of dice2 and second element of dice1 is combined with all the values of dice2 and the process goes on untill the last element of the dice1 is combined with last element of the dice2.

   #### **OUTPUT SCREENSHOT:**

   ![image](https://github.com/POORVAJA-195/Securein_Doomed_DIce/assets/104772332/2b2f7bef-aef3-470f-8445-f76ab5e11bf8)

### **3. PROBABILITY OF ALL POSSIBLE SUMS:**

* The summ of all possible combinations are calculated first and printed in the matrix format.

* The different values of sum in the matrix are counted and the probability is defined for each sum values. 

![image](https://github.com/POORVAJA-195/Securein_Doomed_DIce/assets/104772332/3ff2b4e5-16ed-4fe1-a660-690cd34ad9da)

* The number of favourable outcome is the number of occurance of each sum value in the sum matrix.
* Total number of favourable outcome is 36 this case.

#### **OUTPUT SCREENSHOT OF SUM MATRIX AND PROBABILITIES OF SUM:**

  ![image](https://github.com/POORVAJA-195/Securein_Doomed_DIce/assets/104772332/13a01b6a-347f-4882-b448-7d120bf6a38a)

## **PART-B**

**UNDERSTANDING THE PROBLEM STATEMENT:**

* All the spots from two dice all removed. Have to replace the spots based on the following conditions.
  
  * Die A cannot have more than 4 spots on each face.
  * Die A can have repeated face values.
  * Die B can have any values even grater than 6.
  * The probability of sum for all the unique values in the sum matrix have to be same for both old and new array.

**PROGRAM LOGIC:**
* The sum ranges from 2 to 12 as the smallest element in the older array1 and newarray1 is 1. Adding both values gives smallest sum value as 2. Adding the largest value in older array1 and newarray1 which is 6 in each case gives the value of 12.
  
  **Old array before removing the spots:**
  
  * Old Array1 = {1,2,3,4,5,6}
  * Old Array2 = {1,2,3,4,5,6}
    
   **New array after removing the spots:**
  
  * New array1 = {}
  * New array2 = {}

    New array is empty as of now.
*  The possibility to get the sum 2 is [1,1].Thus 1 has to be in newarray1 and newarray2.

   * New array1 = {1}
   * New array2 = {1}

*  The possibility to get the sum 12 is [4,8] as the new array1 values cannot exceed 4.

   * New array1 = {1,4}
   * New array2 = {1,8}

*  Cannot add 1 and 4 to the array1 as the frequency of 2 and 12 becomes 2 which is actually 1 in older array and this leads to change in the probability values. Thus 1 and 4 are fixed in new array1.
*  Only possibilities are 2 and 3 to fill up the new array1 in the remaining 4 places.
*  Poosible combinations are
  
    2 2 2 2 --> Exceeds the frequency sum of 10 from 3 to 4.
   
    3 3 3 3 --> Exceeds the frequency sum of 11 from 2 to 4.
   
    2 2 2 3 / 3 2 2 2 --> Exceeds the frequency sum of 3 from 2 to 3.
   
    **2 2 3 3 / 3 3 2 2 --> Correct Combination**
   
    2 3 3 3 / 3 3 3 2 --> Exceeds the frequency sum of 11 from 2 to 3.

   * New array1 = {1,4,2,2,3,3}
   
   * New array2 = {1,8}

*  Only the numbers lesser than 8 can be filled in the array2 as the values grater than 8 exceed the sum value to 13,14... and so on.
*  Thus, possible values for new array2 are {7,6,5,4,3,2}. Have to pick 4 values from this set.
*  7 is not possible since it exceeds the frequency sum of 10 from 3 to 4.
*  Thus, only possible values from the set {6,5,4,3,2} are {6,5,4,3}.

   **New array1 = {1,4,2,2,3,3}**
   
   **New array2 = {1,8,6,5,4,3}**

   #### **OUTPUT SCREENSHOT:**

   ![image](https://github.com/POORVAJA-195/Securein_Doomed_DIce/assets/104772332/f0678448-b837-4fb6-8bc3-4bdb25cd7bf1)


   
    
    
  



   


