package com.geeks.ds;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(313L));
    }
    public static boolean isPalindrome(Long number){
        if(CountTheDigit.count(number) > 1){
            Long reverse =0L;
            Long temp = number ;

            while(temp !=0){
                Long reminder = temp%10L;
                reverse= reverse*10 + reminder;
                temp = temp/10;
            }
            return reverse.equals(number);
        }
        return true;
    }
}
