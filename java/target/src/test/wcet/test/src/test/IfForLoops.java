package test;

public class IfForLoops {
	public static void main(String args[]){
		
	}
	
	public static int measure0(boolean b, int val){
		int i;
		
		if (b){
			for (i=0; i<1; i++){ //@WCA loop=0
				val += val;
			}
		}
		else {
			for (i=0; i<1; i++){ //@WCA loop=0
				val += val;
			}				
		}
		return val;		
	}
	
	public static int measure00(boolean b, int val){
		int i;
		
		if (b){
			for (i=0; i<0; i++){ //@WCA loop=0
				val += val;
			}
		}
		else {
			for (i=0; i<0; i++){ //@WCA loop=0
				val += val;
			}				
		}
		return val;		
	}
	
	public static int measure1(boolean b, int val){
		int i;
		
		if (b){
			for (i=0; i<1; i++){ //@WCA loop=1
				val += val;
			}
		}
		else {
			for (i=0; i<1; i++){ //@WCA loop=1
				val += val;
			}				
		}
		return val;		
	}
	
	public static int measure2(boolean b, int val){
		int i;
		
		if (b){
			for (i=0; i<2; i++){ //@WCA loop=2
				val += val;
			}
		}
		else {
			for (i=0; i<2; i++){ //@WCA loop=2
				val += val;
			}				
		}
		return val;		
	}
	
	public static int measure3(boolean b, int val){
		int i;
		
		if (b){
			for (i=0; i<3; ++i){ //@WCA loop=3
				val += val;
			}
		}
		else {
			for (i=0; i<3; ++i){ //@WCA loop=3
				val += val;
			}				
		}
		return val;		
	}
	
	public static int measure4(boolean b, int val){
		int i;
		
		if (b){
			for (i=0; i<4; ++i){ //@WCA loop=4
				val += val;
			}
		}
		else {
			for (i=0; i<4; ++i){ //@WCA loop=4
				val += val;
			}				
		}
		return val;		
	}
	
	public static int measure5(boolean b, int val){
		int i;
		
		if (b){
			for (i=0; i<5; i++){ //@WCA loop=5
				val += val;
			}
		}
		else {
			for (i=0; i<5; i++){ //@WCA loop=5
				val += val;
			}				
		}
		return val;		
	}
	
	public static int measure6(boolean b, int val){
		int i;
		
		if (b){
			for (i=0; i<6; i++){ //@WCA loop=6
				val += val;
			}
		}
		else {
			for (i=0; i<6; i++){ //@WCA loop=6
				val += val;
			}				
		}
		return val;		
	}
	
	public static int measure10(boolean b, int val){
		int i;
		
		if (b){
			for (i=0; i<10; i++){ //@WCA loop=10
				val += val;
			}
		}
		else {
			for (i=0; i<10; i++){ //@WCA loop=10
				val += val;
			}				
		}
		return val;		
	}
	
	public static int measure100(boolean b, int val){
		int i;
		
		if (b){
			for (i=0; i<100; i++){ //@WCA loop=100
				val += val;
			}
		}
		else {
			for (i=0; i<100; i++){ //@WCA loop=100
				val += val;
			}				
		}
		return val;		
	}
	
	public static int measure1000(boolean b, int val){
		int i;
		
		if (b){
			for (i=0; i<1000; i++){ //@WCA loop=1000
				val += val;
			}
		}
		else {
			for (i=0; i<1000; i++){ //@WCA loop=1000
				val += val;
			}				
		}
		return val;		
	}
	
	public static int measure10000(boolean b, int val){
		int i;
		
		if (b){
			for (i=0; i<10000; i++){ //@WCA loop=10000
				val += val;
			}
		}
		else {
			for (i=0; i<10000; i++){ //@WCA loop=10000
				val += val;
			}				
		}
		return val;		
	}
	
	public static int measureifnotif(boolean b, int val){
		
		if (b){
			val += val;
		}
		else {
			val *= val;			
		}
		
		if (!b){
			val += val;
		}
		else {
			val *= val;			
		}
		return val;		
	}
	
}
