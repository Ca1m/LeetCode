package single;

public class Single_0069 {

	public static void main(String[] args) {
		
		int x = 2147395599;
		System.out.println(5/2);
		System.out.println(mySqrt(x));

	}
	public static int mySqrt(int x){
		if(x == 0){ 
			return 0;
		}
		int result = (int)Math.pow(10,(String.valueOf(x).length()/2));
		int begin = 0,end = x;
		int count = 0;
		for(int i = 0; i < x; i++){	
			count ++;
			if(begin == end - 1 || (Math.pow(result, 2)) == x){
				break;
			}
			if((Math.pow(result, 2)) < x){
				begin = result;
				result = (result + end)/2;
			}else{
				end = result;
				result = (begin + result)/2;
			}
		}
		return result;
	}
}
