public class Solution {
   public int addDigits(int num) 
	{
		int sum = 0;
		int t = 0;
		while(num>=10)
		{
			t = num%10;
			num /= 10;
			sum += t;
		}
		sum += num;
		
		if(sum<10)
			return sum;
		else 
			return addDigits(sum);
		
        
    }

}
