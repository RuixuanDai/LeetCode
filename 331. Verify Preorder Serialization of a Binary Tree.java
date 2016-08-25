import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
  public boolean isValidSerialization(String preorder) 
	{
        Pattern p = Pattern.compile("[0-9]+,#,#");
		Matcher m = p.matcher(preorder);
		while(m.find())
		{
			preorder = preorder.replaceAll("[0-9]+,#,#","#");
			m = p.matcher(preorder);			
		}
		
		return preorder.equals("#");		
	}
}
