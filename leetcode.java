//Number palindrome

public boolean isP

  


// roman numeral

'''fi rs t cr eate a Map with the roman numerals and their respective val ues
then create a character array  of the input string
create variable for result 
initialize two pointer i=0 and j =1, then loop till j < length of the character array
in the loop check if the character at j is >= the the char at i --> then add it to result else subtract it


then outside the for loop add the value at the last index{i}
return the results
'''




//largest common prefix


"""
first sort the array
the create two strings
the first is the first word in the array
the second is the last word in the array
creat a variable to track the index of the common prefix
now looop through the first string and check through each character if it is equal to the second string
if it is equal increment the index, else break out of the loop
return the substring of the first string from 0 to the index

""";


// Valid parenthesis

/*
create a stack
loop through the string
if the character is an opening bracket push a closing bracket to the stack
else if the the stack is empty or if the current character is not the smae as the char at the top (charArray.pop()) --> return false
return stack.isEmpty
*/


// search insert position

/*
 * create two pointers left and right, also declare a variable mid
 * perform a binary search:
 *      while left<=right
 *          calculate mid as left + (right-left)/2
 *          if the target is equal to the mid return mid
 *          else if the target is less than the mid --> right = mid-1
 *          else if the target is greater than the mid --> left = mid+1
 * return left
 * 
 */



 // last word length

 /*
  * first split the string into an array of words
  * return the length of the last word in the array
  *
  */

// remove duplicates from a sorted list
/*
 * creat a current node and set it to the head of the list
 * while the current node and the next node are not null
 *      if the current node.val and the next node.val are equal --> current.next = current.next.next
 *      else --> current = current.next
 * return head
 */

//merge two sorted lists

// int i = m-1;
// int j = n-1
// int k = m+n-1

// while j >= 0
//     (if i > 0  and  nums1[i]>nums2[j]){
//         nums1[k--] = num1[i--]
//     }
//     nums1[k--] = nums2[j--]


//Best Time to buy and sell stock

/*
 * initialize variable for maxProfit(0), min Price (+ max value)
 * loop through the prices array
 *      take the minimum of the --> current price and the minPrice
 *      take the maximum of the --> current price - minPrice and the maxProfit
 * return maxProfit
 */


 //Best Time to buy and sell stock II
 
 /* 
  * initialize maxprofit
    then loop throup all the prices starting from i = 1
        check if the price at [i] is greater than the price at [i-1] --> if so add the difference to maxProfit
    return maxProfit
  */


  // Valid Palindrome
  /*
   * create a string builder
   * iterate through the input string
   * if the character is a letter or a digit --> append it to the string builder
   * convert the string builder to a string and convert it to lowercase
   * return the result of the helper method isPalindrome
   * 
   * make an helper method isPalindrome to check if the string is a palindrome
   * initialize two pointers left and right
   * loop through the string while left < right
   *      if the character at left is not equal to the character at right --> return false
   *      left++ and right--
   * return true
   * 
   */


// Single Number

/*
 * create a hashMap with the key to the array element and the value is its frequency
 * loop through the nums
 *      if the current num is in the Hashmap --> increase its frequency by 1
 *                                               (map.put(num, map.get(nums[i]) + 1))
 *      else --> add it to the map with a frequency of 1
 * loop through the map and return the key with a value of 1
 * (Map.Entry<Integer, Integer> entry : map.entrySet())
 * 
 * 
 * METHOD 2: XOR
 * initialize a variable result to 0
 * loop through the nums
 *      result ^= nums[i]
 * return result
 * 
 * XOR works like this
 * we have a nums list [4,1,2,1,2]
 * so it starts by --> 0^4 = 4
 * then it goes to --> 4^1 = 5
 * then it goes to --> 5^2 = 7
 * then it goes to --> 7^1 = 6
 * then it goes to --> 6^2 = 4
 * so the result is 4 which is the single number in the list
 * 
 * witht the input [2,2,1]
 * it starts by --> 0^2 = 2
 * then it goes to --> 2^2 = 0
 * then it goes to --> 0^1 = 1
 * so the result is 1 which is the single number in the list
 * 
 * with the input [4,3,2,2,4]
 * it starts by --> 0^4 = 4
 * then it goes to --> 4^3 = 7 [100 ^ 011]
 * then it goes to --> 7^2 = 5 [111 ^ 010]
 * then it goes to --> 5^2 = 7 [101 ^ 010]
 * then it goes to --> 7^4 = 3
 * so the result is 3 which is the single number in the list
 *
 */


 //linked List Cycle

 /*
  * 
  * create two pointers slow and fast pointing to the head of the linked list
  * while fast != null and fast.next != null
  *          move the slow pointer one step and the fast pointer two steps
  *          if the slow pointer == the fast pointer  --> return true
  * return false
 */



// majority element
/*
 * make a new hash map
 * create a variable result and set it to 0
 * create a variable majority and set it to 0
 * loop through the nums
 *       add the current num to the map and increase its frequency with getOrDefault(num, 0)+1
 *       if the current num's frequency is greater than majority --> 
 *              result = num and
 *              majority = map.get(num)
 * return result
 * 
 * 
 */


// Reverse Linked List
/* if the head is null return it;
 *
 * create 3 pointers prev, curr, and next
 * prev = null, curr = head, next = curr.next
 * 
 * while curr != null
 *      curr.next = prev
 *      prev = curr
 *      curr = next
 *      if next != null --> next = curr.next
 * return prev
 */


// Contains Duplicate
/*
 * create an HashSet of integers 
 * then iterate through the numbers
 *      before adding check if the number is already in the set. if it is --> return true
 *      
 *      else --> add it to the set
 * return false
 *
 */

// Contains Duplicate II
/*
 * create an HashMap that maps the nums in the array to their index
 * loop through the nums
 *      if the current num is not in the map --> add it to the map with its index
 *      
 *      else:
 *          get the abs different between the current index and the index in the map
 *          
 *          if the abs diff is less than or equal to k --> return true
 *          
 *          else --> update the index in the map to the current index
 *
 * return false
 */

// Palindrome Linked List
/*
 * if head == nulll return true
 * create a list to store the values in order
 * create a node (curr) and point it to head
 * while curr != null
 *      add the curr.value to the list
 *      curr = curr.next
 * 
 * initialize two pointers left and right
 * loop through the list while left < right
 *      if the value at left != value at right --> return false
 *      left++ and right--
 * return true
 */

// Valid Anagram
/*
 * create a Char array for String s and t
 * 
 * then sort both arrays
 * then check if both strings are equal
 * 
 * 
 * METHOD 2
 * 
 * first check if the legth of both strings are equal
 * 
 * then create an array of ints[26] to represent the frequency for each alphabet 
 * loop through each char of s and then 
 *      increment the value at that index [ch - 'a']++
 * 
 * loop through each char of t and then 
 *      decrement the value at that index [ch - 'a']--
 * 
 * loop through the array and check if all the values are 0
 *      if not --> return false
 * return true
 */


 // Move Zeroes

/*
 * initialize a variable index = 0
 * loop through the nums array with i starting at 0
 *      if the current num is not 0 --> nums[index++] = nums[i]
 * loop through the nums array starting at index
 *      set the the remaining nums to 0
 */


// count Ones
/*
 * write an helper method to count the number of ones in a particular bit's String
 * 
 * create an array of size n+1 and set the first element to 0
 * 
 * loop for 1 up until the input int n
 *    create a String representation of the bit at each index with (Integer.toBinaryString[i])
 *    use the helper method to count the number of ones in the bit's String
 *    add the count to the array at the ith index
 *
 * return the array
 *
 */


 // reverse String
/*
 * initialize two pointers left and right
 * loop through the string while left < right
 *      swap the characters at left and right using a temp variable
 *      left++ and right--
 */



// Guess Number Higher or Lower
/*
 * initialize two pointers start and end
 * Then loop while start <= end
 *      create a variable mid and set it to start + (end-start)/2
 *      if the current guess is equal to the mid --> return mid
 *      else if the current guess is less than the mid --> end = mid-1
 *      else if the current guess is greater than the mid --> start = mid+1
 * return -1
 * 
 */


// Ransome Note
/*
 * create a HashMap to store the characters and their frequencies
 * loop through the magazine
 *      add the current character to the map and increase its frequency by 1 with getOrDefault
 *
 * loop through the ransomNote
 *      if the current character is not in the map ot it's frequency is 0 --> return false
 *      else --> decrease the frequency of the current character by 1
 *
 * return true
 */



// First Unique Char in a String
/*
 * Create a hashMap with the Charcters mapped to the frequency
 * 
 * Iterate and populate the hashMap with the using the characters of the input String
 * 
 * loop through the input string
 *      if the current character's frequency is 1 --> return its index
 * return -1
 * 
 */



// Find the Difference
/*
 * calculate the sum of the characters in the string t with a foreach loop
 * calculate the sum of the characters in the string s with a foreach loop
 * return the difference between the two sums
 *
 */


// Max consecutive 1s
/*
 * create a variable max and set it to 0
 * create a variable count and set it to 0
 * loop through the nums array
 *      if the current num is 1 --> count++
 *      else --> count = 0
 *      max = Math.max(max, count)
 * return max
 *
 */

 
// Detect Capital
/*
 * write three helpher functions: All caps, All Lower and firstCap
 * 
 * all caps --> intitalize a variable count to track the number of upper case chars
 *              the loop through the input string
 *                      if upperCase --> count++
 * 
 *              return count==input.length()
 * 
 * All lower --> intitalize a variable count to track the number of lower case chars
 *              the loop through the input string
 *                      if upperCase --> count++
 * 
 *              return count==input.length()
 * 
 * first Cap -->    store the first char of the string in a char variable
 *                  create a substring without the first character
 * 
 *                  if the first char is upper and when you run all lower on the substring  --> return true
 *  
 *                  else --> false
 * 
 * Now you can run the code on the input string
 *      if all caps or all lower --> return true
 *      else if firstCap --> return true
 *      else --> return false
 *      
 *      or return all caps || all lower || firstCap
 * 
 */


 // Reverse Words in a String III


/*
 * 
 * write an helpher function to revesrse each word
 *      initialize a new string empty string 
 *      loop through the input String starting from the last character
 *          add the current character to the new string
 *      return the new string
 * 
 * 
 * 
 * convert the input string to an array of strings with the split method
 * initialize a string builder to store the result
 * 
 * Loop through the array of string up untill the second to the last Charcter
 *      at each iteration --> reverse the current word and append it to the string builder
 *      add a space after each word
 * add the reversed last word manually oustside the loop
 * 
 * return the toString of the String builder
 * 
 */



 // Binary Search
 /*
  * initialize two pointers left and right
  * loop while left <= right
  *      create a variable mid and set it to left + (right-left)/2
  *      if the Target is equal to the mid --> return mid
  *      else if the Target is less than the mid --> right = mid-1
  *      else if the Target is greater than the mid --> left = mid+1
  * return -1
  *
  */


// Jewels and Stones
/*
 * Create a hashSet to store all the jewels you have by iterating through all the characters in the input string
 * 
 * initialize a variable count = 0
 * 
 * iterate through all the characters in the Stones
 *      if it is already in the set --> count++
 * 
 * return count
 * 
 */


 // Transpose Matrix

/*
 * get the size of the input matrix rows and columns
 * create a new matrix with the transposed matric Dimensions
 * 
 * loop through the rows of the input matrix [i]
 *      loop throught the colums of the input matix [j]
 *          transpose[j][i] = original[i][j]
 * 
 * return the transposed matrix
 */


// Middle of the Linked List
/*
 * initialize two pointers slow and fast = head
 * loop while fast != null and fast.next != null
 *      slow = slow.next
 *      fast = fast.next.next
 *
 * return slow
 *
 */


// Mountain Array
/*
 * get the length of the array and chack if len >= 3
 * 
 * initalize two pointers left and right
 * 
 * loop through the array starting from left
 * while left + 1 < len && arr[left] < arr[left+1]
 *      left++
 * 
 * while right > 0 && arr[right] > arr[right -1]
 *      right--
 * 
 * check if left and right are not at their initial spot && left == right
 * 
 */


// Squares of a sorted Array
/*
 * initialize an extra array result to be the same size as the input array
 * initialize two pointers left and right
 * 
 * while left <= right
 *      if left^2 > right^2 --> add left^2 to the last index of the result array and decrement the pointer for result and increment left
 *                          --> (result[len--] = left^2; left++)
 * 
 *     else if right^2 > left^2 --> add right^2 to the last index of the result array and increment pointer for result and decrement right
 *                              --> (result[len--] = right^2; right--)
 * 
 * 
 * for loop starting from i= len -1
 *      calc left^2
 *      calc right^2
 *      if left^2 > right^2 --> result[i] = left^2
 *                         --> left++;
 * 
 *      else if right^2 > left^2 --> result[i] = right^2
 *                         --> right--;
 * 
 * return the result array
 * 
 */







































// Isomorphic Strings
/*
 * create two HashMaps to store the characters and their frequencies
 * loop through the strings
 *      add the current character to the map and increase its frequency by 1 with getOrDefault
 *
 * loop through the strings
 *      if the current character is not in the map ot it's frequency is 0 --> return false
 *      else --> decrease the frequency of the current character by 1
 *
 * return true
 *
 *
 * METHOD 2
 *
 * create two HashMaps to store the characters and their frequencies
 *
 * loop through the strings
 *      add the current character to the map and increase its frequency by 1 with getOrDefault
 *
 * loop through the strings
 *      if the current character is not in the map ot it's frequency is 0 --> return false
 *      else --> decrease the frequency of the current character by 1
 *
 * return true
 */



















// reverse Integer
/*
 * create a variable result and set it to 0
 * loop through the input x
 *      create a variable digit and set it to x%10
 *      result = result*10 + digit
 *      x = x/10
 * return result
 *
 * if the result is greater than the max value of an integer --> return 0
 * if the result is less than the min value of an integer --> return 0
 * else --> return result
 *
 */



// Complement of Base  10 Integer
/*
 * make an helper funtion to get the complement --> takes sting input
 *      initialize a new string builder
 *      loop through the input string
 *          if the current character is 1 --> append 0 to the string builder
 *          else --> append 1 to the string builder
 *      return the toString of the string builder
 *
 * convert the input int to a binary string
 * convert the complement of the binary string to an int (use the helper function to get the string)--> (Integer.parseInt(comp-String,2)
 *
 * return the complement of the input int
 *
 */



// Last Stone Weight
/*
 * create a priority queque wit the elemrnts of the input array
 * PriorityQueue<Integer> queque = new PriorityQueue<>(Collections.reverseOrder()); OR
 *                               = new PriorityQueue<>((a,b) -> b-a);  OR
 *                               = new PriorityQueue<>(
 *                                      new Comparator<Integer>(){
 *                                          public int compare(Integer a, Integer b){
 *                                              return b-a;
 *                                          }
 *                                      }
 *                                  );
 * loop through the input array and add all the elements to the queque
 * 
 * while the size of the queque is greater than 1
 *      create a variable x and set it to the first element of the queque with queue.poll()
 *      create a variable y and set it to the second element of the queque with queue.poll()
 *      if x != y --> queque.offer(y-x)
 * return queque.isEmpty() ? 0 : queque.poll()
 * 
 */


// Remove All Adjacent Duplicates In String
/*
 * create a stack
 * loop through the input string
 *      if the stack is not empty and the current character is the same as the top of the stack --> pop the top of the stack
 *      else --> push the current character to the stack
 *
 * create a string builder
 * loop through the stack
 *      append the current character to the string builder
 *
 * return the reverse of the toString of the string builder  --> sb.reverse().toString()
 */
 */


// Split a String in Balanced Strings
/*
 *
 * check if the input string is null or empty -- return 0
 * 
 *  create three variables count, left and right and set them to 0
 * loop through the input string
 *      if the current character is L --> left++
 *      else if the current character is R --> right++
 *
 *      if left == right --> count++
 *
 * return count
 *
 * METHOD 2
 * 
 * initialize a stack and a int variable count
 * loop through each charcater in the input String
 *      if the stack is empty --> count++
 * 
 *      if the stack is not empty and the top is not the R while the current char is L or vice versa --> pop from the stack
 *                      --> (!stack.isEmpty() && ((stack.peek() == 'R' && ch == 'L') || ( stack.peek() == 'L' && ch == 'R'))
 * 
 *      else --> add the current char to the stack
 * 
 * 
 */



// Find Numbers with Even Number of Digits
/*
 * initialize a variable count and set it to 0
 * loop through the input array
 *      convert the current element to a string with nums[i].
 *      if the length of the string is even --> count++
 *
 * return count
 *
 * 
 * 
 * METHOD 2
 * 
 * check if the len of array nums is 0 --> return 0
 * 
 * initialize count = 0
 * loop through the nums array
 *      initialize a variable numDigits = 0
 *      while current num != 0
 *          divide num by 10 to remove last digit
 *          numDigits++
 *      
 *      if numDigits is even --> count++
 * 
 * return count
 * 
 */



// Total Number of Negative Elements in a Matrix
/* 
 * 
 * get the total number of rows and columns
 * initialize 3 variable rows = 0; cols = total_cols - 1; and count = 0
 * 
 * while row < totalRows && cols >= 0
 *      if the current element < 0
 *          col--;
 *          count += (totalRows - row)
 *      else
 *          row++;
 * 
 * return count
 * 
 */


 //Kid with the Greatest Number of Candies

/*
  * get the max value of the input array
  *     initialize max = Integer.MIN_VALUE
  *     loop through the input array
  *          if the current element > max --> max = current element

  * initialize a new arrayList of booleans -- result
  * loop through the input array
  *      if the current element + extraCandies >= max --> add true to result
  *      else --> add false to result
  *
  * return  result 
  *
  */



// Maximum Product of Two Elements in an Array
/*
 * create a variable max and set it to Integer.MIN_VALUE
 * loop through the input array
 *      if the current element > max --> max = current element
 *
 * create a variable secondMax and set it to Integer.MIN_VALUE
 * loop through the input array
 *      if the current element > secondMax && current element != max --> secondMax = current element
 *
 * return (max-1)*(secondMax-1)
 *
 * METHOD 2
 * Sort the array
 * return (nums[nums.length-1]-1)*(nums[nums.length-2]-1)
 * 
 * Method 3;
 * Initialize a PriorityQueue and populate it with the values from nums
 * poll the queue to get the max and secondMax elements 
 * then return (max-1)*(secondMax-1)
 */


// Running Sum of 1d Array
/*
 * initialize a variable sum
 * loop through all the elements of sum starting from i = 1
 *      sum = num[i] + num[i-1]
 *      nums[i] = sum
 * 
 * return nums
 */




// Average Salary Excluding the Minimum and Maximum Salary
/*
 * initialize three variables min = Integer.MAX_VALUE, max= Integer.MIN_Value, and sum = 0
 * 
 * loop through the Salary array 
 *      update the min,max and sum value 


// Reformat Date
/*
 * get the year and save it in a variable --> then add it to a result String
 * then make a map of the Month to their respective numbers as Strings
 * 
 * use a new variable to save the month String
 * save the day and extract the digits from it
 * 
 */



// Shuffle String
/*
 * create a new char array of the same length as the input string
 * loop through the input string
 *      save the current character and the corresponding index
 *      add the character to the new char array at the corresponding index
 *
 *      int pos = indices[i]
 *      chars[pos] = s.charAt(i);
 * 
 * return the toString of the new char array
 *
 */




// Three consecutive odds
/*
 * initialize a count variable and set it to 0
 * loop through the input array
 *      if the current element is odd --> count++
 *      else --> count = 0
 *
 *      if count == 3 --> return true
 *
 * return false
 *
 */



// Matrix Diagonal Sum
/*
 * initialize two variables len to the length of the matrix, and sum
 * loop through the matrix till len
 *      add the primary diagonal to sum --> [i][i]
 *      add the secondary diagonal to sum --> [len-i-1][i]
 * 
 * if the len of the matrix is odd --> subtract the middle element from sum --> [len/2][len/2]
 * 
 * return sum
 * 
 */












// Find the Highest Altitude
/*
 * initialize a variable max and set it to 0
 * initialize a variable current and set it to 0
 * loop through the input array
 *      current += nums[i]
 *      if current > max --> max = current
 *
 * return max
 *
 *
 * METHOD 2
 *
 * initialize a variable max and set it to 0
 * loop through the input array
 *      gain += nums[i]
 *      if gain > max --> max = gain
 *
 * return max
 */
















// Maximum Subarray
/*
 * create a variable max and set it to Integer.MIN_VALUE
 * create a variable currentSum and set it to 0
 * loop through the input array
 *      currentSum += nums[i]
 *      if currentSum > max --> max = currentSum
 *      if currentSum < 0 --> currentSum = 0
 *
 * return max
 *
 *
 * METHOD 2
 *
 * create a variable max and set it to nums[0]
 * create a variable currentSum and set it to max
 * loop through the input array starting from index 1
 *      currentSum += nums[i]
 *      if currentSum > max --> max = currentSum
 *      if currentSum < 0 --> currentSum = 0
 *
 * return max
 *
 *
 * METHOD 3
 *
 * create a variable max and set it to nums[0]
 * loop through the input array starting from index 1
 *      max = Math.max(nums[i], max + nums[i])
 *
 * return max
 * 
 * 
 */











// Product of Array Except Self
/*
 * create a new array of the same length as the input array
 * create a variable prefix and set it to 1
 * loop through the nums array
 *      set the current index of the new array to the prefix
 *      update the prefix by multiplying it with the current num
 *
 * create a variable postfix and set it to 1
 * loop through the nums array in reverse order
 *      update the current index of the new array by multiplying it with the postfix
 *      update the postfix by multiplying it with the current num
 *
 * return the new array
 */



 // Maximum number of points with cost 
 /*
  * initialise 2 variables col and row and set them to 0
  * initialize a variable max and set it to Integer.MIN_VALUE
  * loop through the input array
  *      if the current element > max --> max = current element
  *      if the current element == max --> row = i, col = nums[i].indexOf(max)
  *
  * return the sum of the row and col
  */


  You are given an array A representing heights of students. All the students are asked to stand in rows. The students arrive by one, sequentially (as their heights appear in A). For the i-th student, if there is a row in which all the students are taller than A[i], the student will stand in one of such rows. If there is no such row, the student will create a new row. Your task is to find the minimum number of rows created.


  Write a function that, given a non-empty array A containing N integers, denoting the heights of the students, returns the minimum number of rows created.
  
  
  For example, given A = [5, 4, 3, 6, 1], the function should return 2.
  
  
  Students will arrive in sequential order from A[0] to A[N−1]. So, the first student will have height = 5, the second student will have height = 4, and so on.
  
  
  For the first student, there is no row, so the student will create a new row.
  
  
  Row1 = [5]
  
  For the second student, all the students in Row1 have height greater than 4. So, the student will stand in Row1.
  
  
  Row1 = [5, 4]
  
  Similarly, for the third student, all the students in Row1 have height greater than 3. So, the student will stand in Row1.
  
  
  Row1 = [5, 4, 3]
  
  For the fourth student, there is no row in which all the students have height greater than 6. So, the student will create a new row.
  
  
  Row1 = [5, 4, 3]
  
  Row2 = [6]
  
  For the fifth student, all the students in Row1 and Row2 have height greater than 1. So, the student can stand in either of the two rows.
  
  
  Row1 = [5, 4, 3, 1]
  
  Row2 = [6]
  
  Since two rows are created, the function should return 2.
  
  
  Assume that:
  
  
  N is an integer within the range [1..1,000]
  
  each element of array A is an integer within the range [1..10,000]
  
  
  In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment

  static int solution(int[] A) {
    int N = A.length;
    int rows = 0;
    int[] row = new int[N];

    for (int i = 0; i < N; i++) {
      int height = A[i];
      boolean placed = false;

      for (int j = 0; j < rows; j++) {
        if (row[j] >= height) {
          row[j] = height;
          placed = true;
          break;
        }
      }

      if (!placed) {
        row[rows] = height;
        rows++;
      }
    }

    return rows;
  }


  There are some processes that need to be executed. Amount of a load that process causes on a server that runs it, is being represented by a single integer. Total load caused on a server is the sum of the loads of all the processes that run on that server. You have at your disposal two servers, on which mentioned processes can be run. Your goal is to distribute given processes between those two servers in the way that, absolute difference of their loads will be minimized.



  Write a function that, given an array A of N integers, of which represents loads caused by successive processes, the function should return the minimum absolute difference of server loads.
  
  
  
  For example, given array A such that:
  
    A[0] = 1
  
    A[1] = 2
  
    A[2] = 3
  
    A[3] = 4
  
    A[4] = 5
  
  
  
  your function should return 1. We can distribute the processes with loads 1, 2, 4 to the first server and 3, 5 to the second one, so that their total loads will be 7 and 8, respectively, and the difference of their loads will be equal to 1.
  
  
  
  Assume that:
  
  N is an integer within the range [1..1,000]
  
  the sum of the elements of array A does not exceed 100,000
  
  
  In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
  
static int solution(int[] A) {
    int N = A.length;
    int totalLoad = 0;
    for (int i = 0; i < N; i++) {
      totalLoad += A[i];
    }

    int minDiff = Integer.MAX_VALUE;
    int leftLoad = 0;
    for (int i = 0; i < N - 1; i++) {
      leftLoad += A[i];
      int rightLoad = totalLoad - leftLoad;
      int diff = Math.abs(rightLoad - leftLoad);
      if (diff < minDiff) {
        minDiff = diff;
      }
    }

    return minDiff;
  }  

  Consider all codes made of four digits (0−9). How many of them have a sum of digits equal to S? For example, for S = 4, there are 35 such codes in total. Some of them are 0022, 1003, 1111, 2020, 4000.

  Write a function:
  
  int solution(int S);
  
  that, given an integer S, returns the number of four-digit codes whose sum of digits is equal to S.
  
  Examples:
  
  For S = 35, the possible codes are: 9998, 9989, 9899, 8999. The function should return 4.
  For S = 4, the function should return 35.
  For S = 2, the function should return 10.
  Assume that:
  
  S is an integer within the range [0..36].
  In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

static int solution(int S) {
    int count = 0;
    for (int i = 0; i < 10000; i++) {
      int sum = 0;
      int num = i;
      while (num > 0) {
        sum += num % 10; 
        num /= 10;
      }
      if (sum == S) {
        count++;
      }
    }
    return count;
  }

  There is a board with N cells (numbered from 0 to N−1) arranged in a row. The board is described by an array points and a string tokens, both of length N. The K-th letter of the string tokens is either 'T' or 'E', indicating whether the K-th cell contains a token or is empty.

  If the K-th cell contains a token, we score the number of points equal to points[K]. Additionally, we score another point for every pair of adjacent tokens. What is the total number of points we score?
  
  Write a function:
  
  int solution(vector<int> &points, string &tokens);
  
  that, given an array of integers points and a string tokens, both of length N, returns the total number of points scored.
  
  Examples:
  
   Assume that points = [3, 4, 5, 2, 3] and tokens = "TEETT". Cells 0, 3 and 4 contain tokens. The sum of points in these cells is 8. Also, there is one pair of adjacent cells with tokens, which results in 1 extra point. The function should return 9.
  Assume that points = [3, 2, 1, 2, 2] and tokens = "ETTTE". Cells 1, 2 and 3 contain tokens. The sum of points in these cells is 5. Also, there are two pairs of adjacent cells with tokens, which results in 2 extra points. The function should return 7.
  Assume that points = [2, 2, 2, 2] and tokens = "TTTT". All cells contain tokens. The function should return 11.
  Assume that:
  
  array points and string tokens are of the same length N;
  N is an integer within the range [1..100];
  each element of array points is an integer within the range [1..1,000];
  string tokens consists only of the characters "E" and/or "T".
  In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

int solution(vector<int> &points, string &tokens) {
    int N = points.size();
    int score = 0;
    for (int i = 0; i < N; i++) {
      if (tokens[i] == 'T') {
        score += points[i];
        if (i > 0 && tokens[i - 1] == 'T') {
          score++;
        }
        if (i < N - 1 && tokens[i + 1] == 'T') {
          score++;
        }
      }
    }
    return score;
  }