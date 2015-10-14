// Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

// For example,
// "A man, a plan, a canal: Panama" is a palindrome.
// "race a car" is not a palindrome.

// Note:
// Have you consider that the string might be empty? This is a good question to ask during an interview.

// For the purpose of this problem, we define empty string as valid palindrome.

//This is a two pointers problem. An easy one.

public class Solution {
    public boolean isPalindrome(String s) {
        char c1,c2;
        for (int i=0,j=s.length-1; i<j;i++,j--) 
        {
        	c1=s.charAt(i);
        	c2=s.charAt(j);
        	while(i<j && !Character.isLetter(c1) && !Character.isDigit(c1))
        		c1=s.charAt(++i);

        	while(i<j && !Character.isLetter(c2) && !Character.isDigit(c2))
        		c2=s.charAt(--j);
        	if(Character.toLowerCase(c1)!=Character.toLowerCase(c2))
        	{
        		return false;
        	}
        }
        return true;
    }
}