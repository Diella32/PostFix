package postFixPD;

import java.awt.List;

public class PostFixTest extends LinkedStack {
	
    public  int calculator (String stringUsed) {
	  //stringUsed = "2 3 4 + *"; 
	  LinkedStack<Integer> list = new LinkedStack(); 
	  for (int i = 0; i < stringUsed.length(); i++) {
		 char characterUsed = stringUsed.charAt(i); 
		 if(Character.isDigit(characterUsed)) {
			 list.push(characterUsed - '0'); 
		 }
		 else if(characterUsed == '+' || characterUsed == '-' || characterUsed == '*' ||characterUsed == '/' ) {
			int variableOne = list.pop();
			int variableTwo = list.pop();
			switch(characterUsed) {
				case '+':
				list.push(variableOne+variableTwo);  
				break; 
				
				case '-':
				list.push(variableOne-variableTwo);  
				break; 
					
				case '*':
				list.push(variableOne*variableTwo);  
				break; 
					
				case '/':
				list.push(variableOne/variableTwo);  
				break; 
					
							
			}
		 }
	  }
	  return list.pop(); 
  }
}

