package single;

public class Single_1008 {

	public static void main(String[] args) {
		
		String address = "1.1.1.1";

		System.out.println(Single_1008.defangIPaddr(address));
		
		
	}

	
	public static String defangIPaddr(String address) {
        
		String add = address.replaceAll("\\.", "[.]");

		
		return add;
    }
	
}
