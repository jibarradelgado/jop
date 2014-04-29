package test;

public class ForLoop {
	
	public static void main (String args []){
		//loop();		
	}
	
	public static void Loop1(){
		int a; 
		a = 0;
		for (int i = 0; i < 10 ; i++)
		{
			a = 0;			
		}
	}
	
	public void Loop2(){
		int a; 
		a = 0;
		for (int i = 0; i < 10 ; i++)
		{
			a = 0;			
		}		
	}
	
	public void Loop3(){
		int a,i;
		a = 0;
		i = 0;
		while (i < 10)
		{			
			a = 0;
			i++;
		}
	}
	
	public void Loop4(){
		int a;
		a = 0;
		for (int i = 0; i < 10; i++)
		{
			a++;
		}
	}
	
	public void Loop5(){
		int a; 
		a = 0;
		for (int i = 0; i < 10 ; i++) //@WCA loop=10
		{
			a = 0;			
		}
	}
	
	public void Loop6(){
		int a,b,c; 
		a = 0;
		b = 0;
		c = 0;
		for (int i = 0; i < 1 ; i++)
		{
			a++;
			b++;
			c = a+b;
		}
	}
	
	public void Loop7(){
		int a,b,c; 
		a = 0;
		b = 0;
		c = 0;
		for (int i = 0; i < 1000 ; i++)
		{
			a++;
			b++;
			c = a+b;
		}
	}
	
	public void Loop8(){
		int a,b,c; 
		a = 0;
		b = 0;
		c = 0;
		for (int i = 0; i < 1 ; i++) //@WCA loop=1
		{
			a++;
			b++;
			c = a+b;
		}
	}
	
	public void Loop9(){
		int a,b,c; 
		a = 0;
		b = 0;
		c = 0;
		for (int i = 0; i < 1000 ; i++) //@WCA loop=1000
		{
			a++;
			b++;
			c = a+b;
		}
	}
	
	public void Loop10(){
		int a,b,c; 
		a = 0;
		b = 0;
		c = 0;
		for (int i = 0; i < 1000 ; i++) //@WCA loop=1
		{
			a++;
			b++;
			c = a+b;
		}
	}
			
	public static int measure1(boolean b, int val){
		int i, j;
		
		for (i=0; i<10; ++i){
			if(b){
				for (j=0; j<3; ++j){
					val *= val;
				}
			}
			else {
				for (j=0; j<4; ++j){
					val += val;
				}				
			}
		}
		return val;
	}
	
	public static int measure2(boolean b, int val){
		int i, j;
		
		for (i=0; i<10; ++i){ //@WCA loop=10
			if(b){
				for (j=0; j<3; ++j){ //@WCA loop=3
					val *= val;
				}
			}
			else {
				for (j=0; j<4; ++j){ //@WCA loop=4
					val += val;
				}				
			}
		}
		return val;
	}
	
	public static int measure3(boolean b, int val){
		int i, j;
		
		if (b){
			for (j=0; j<3; ++j){ //@WCA loop=3
				val += val;
			}
		}
		else {
			for (j=0; j<3; ++j){ //@WCA loop=3
				val += val;
			}				
		}
		return val;		
	}
}
