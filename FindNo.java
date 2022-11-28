
public class FindNo {
	public static void main(String[] args) {
		
		int a[]= {10,20,30,45,62,5};
		
	int find=50;
	
	boolean result=false;
	
	for(int j:a) {
		if(j==find) {
			result=true;
			break;
		}
	}
		if(result) {
			System.out.println("find");
		}else {
			System.out.println("not find");
		}
		
	}
	}
