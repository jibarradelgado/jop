package test;

public class IfElseTest {
	public static void main(String args[]){
		
	}
	
	public static int measure1(boolean b, int val ){
		if (b)
		{			
			val += val;
		}
		else
		{			
			val += val;
		}			
			
		return val;
	}
	
	public static int measure2(boolean b, int val)	{
		if (b)
		{
			val += val;			
		}
		else
		{
			val *= val;
		}
		return val;	
	}
	
	public static int measure3(boolean b, int val){
		if (b){
			val *= val;
		}
		else
		{
			val *= val;			
		}
		return val;
	}
	
	public static int measure4(boolean b, int val){
		if (b){
			val -= val;
		}
		else
		{
			val -= val;			
		}
		return val;
	}
	
	public static int measure5(boolean b, int val){
		if (b){
			val /= val;
		}
		else
		{
			val /= val;			
		}
		return val;
	}
	
	public static int measure6(boolean b, int val){
		if(b){
			val /= 0;
		}		
		else{
			val /= 0;
		}
		return val;
	}	
}
