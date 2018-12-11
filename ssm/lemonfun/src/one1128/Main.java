package one1128;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static Boolean Match(String str) {
		if(str==null||str=="")
        {
            System.out.println( "表达式为空!" ) ;
        }
		Stack<Character> stack = new Stack<Character>() ;
        
        for(int index=0 ; index<str.length();index++)
        {
            switch(str.charAt(index))
            {
                case '(':
                    stack.push(str.charAt(index)) ;
                    break ;
                case '[':
                    stack.push(str.charAt(index)) ;
                    break ;    
                case '{':
                    stack.push(str.charAt(index)) ;
                    break ;
                case ')':
                    if(!stack.empty()&&stack.peek()=='('){
                        stack.pop() ;
                    }
                    if(!stack.isEmpty()) {
                     if(stack.peek()!='(') {
                    	break;
                    }else {
                    	return false;
                    }
                    }
                    break;
                   
                case ']':
                    if(!stack.empty()&&stack.peek()=='[') {
                        stack.pop() ;
                    }
                    if(!stack.isEmpty()) {
                    if(stack.peek() == '{') {
                    	break;
                    }else {
                    	return false;
                    }
                    }
                    break;
                    
                case '}':
                    if(!stack.empty()&&stack.peek()=='{') {
                        stack.pop();
                    }
                    if(!stack.isEmpty()) {
                    if(stack.peek() != '{') {
                    	return false;
                    }
                    }
            }    
        }
		
        if(stack.empty())
           return true ;
          return false ;
    }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Match(str);

	}

}
