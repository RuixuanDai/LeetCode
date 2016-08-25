public class Solution {
 public static int evalRPN(String[] tokens)
	{
		Deque<Integer> stack = new ArrayDeque<>();
		int result = 0;
		for(int i=0 ; i<tokens.length ; i++)
		{
			int temp=-111;
			if(tokens[i].length()>1)
				{temp = Integer.parseInt(tokens[i]);stack.push(temp);continue;}	
			char c = tokens[i].charAt(0);
			switch(c)
			{
			case'+':
			{result = stack.pop()+stack.pop();stack.push(result);break;}
			case'-': // watch the order of "-/"
			{int t = stack.pop();result = stack.pop()-t;stack.push(result);break;}
			case'*':
			{result = stack.pop()*stack.pop();stack.push(result);break;}
			case'/':// watch the order of "-/"
			{int t = stack.pop();result = stack.pop()/t;stack.push(result);break;}
			default :
			{temp = Integer.parseInt(tokens[i]);stack.push(temp);continue;}		
			}
		}
		return stack.pop();

	}

}
