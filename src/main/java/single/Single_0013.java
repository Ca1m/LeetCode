package single;

public class Single_0013 {

	public static void main(String[] args) {
		System.out.println(romanToInt("MCCCXIV"));

	}

	public static int romanToInt(String s){
		
		int[] is = new int[s.length()];
		int i = 0;
		int num = 0;
		for(char c: s.toCharArray()){
			if(c - 'I' == 0){
				is[i] = 1;
			}else if(c == 'V'){
				is[i] = 5;
			}else if(c == 'X'){
				is[i] = 10;
			}else if(c == 'L'){
				is[i] = 50;
			}else if(c == 'C'){
				is[i] = 100;
			}else if(c == 'D'){
				is[i] = 500;
			}else if(c == 'M'){
				is[i] = 1000;
			}else{
				return -2;
			}
			i++;
		}
		for(int j = 0; j < is.length; j++){
			
			if(j == is.length-1){
				num += is[j];
			}else if(is[j] < is[j+1]){
				num -= is[j]; 
			}else{
				num += is[j];
			}
		}
		
		return num;
	}
}
