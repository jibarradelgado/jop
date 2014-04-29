package test;

public class IfForBasicOp {
	public static void main(String args[]){
		
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
			for (i=0; i<1; i++){ //@WCA loop=1
				val *= val;
			}
		}
		else {
			for (i=0; i<1; i++){ //@WCA loop=1
				val *= val;
			}				
		}
		return val;		
	}
	
	public static int measure3(boolean b, int val){
		int i;
		
		if (b){
			for (i=0; i<1; i++){ //@WCA loop=1
				val /= val;
			}
		}
		else {
			for (i=0; i<1; i++){ //@WCA loop=1
				val /= val;
			}				
		}
		return val;		
	}
}
