package com.company;

public class Main {

    public static void main(String[] args) {
	    LinkedStack stack = new LinkedStack();

	    String s = "Nitin WOW, wow, NITIN";
	    String temp = "";
	    s = s.toLowerCase();


	    for(int i=0;i<=s.length()-1;i++){        //char a : s.toCharArray() .Also note i<s.length() rather than i<=s.length()-1
	        if(s.charAt(i)>=97 && s.charAt(i)<=122) {
                stack.push(s.charAt(i));
                temp += s.charAt(i);
            }
        }

        System.out.println(temp);
        System.out.println(stackPalindrome(temp,stack));


    }

    public static boolean stackPalindrome(String s, LinkedStack stack){
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)!=stack.pop()){
                return false;
            }
        }
        return true;
    }
}
