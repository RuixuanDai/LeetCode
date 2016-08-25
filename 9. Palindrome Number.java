public class Solution {
  public boolean isPalindrome(int x)
	{
		if(x<0) return false;
		int factor = 1 , base = 10;
		while (x / factor >= 10)
			factor *= 10;
		 while(factor>=base)
		 {
			 int left, right;
			 left = (x/factor)%10;
			 right = x%base/(base/10);

			 if(left!=right) return false;
			 factor /= 10;
			 base *= 10 ;
		 }
		 return true;
	}
}
