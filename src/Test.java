
public class Test {

	public static void main(String[] args) {
		String input="qqqqwwwyuuuiip";
		int ch_1_count=0;
		System.out.println(input);
		for (int i=0;i<input.length();i=ch_1_count+i) {
			ch_1_count=1;
		char ch=input.charAt(i);
		 for (int j=i+1;j<input.length();j++) {
			 char ch_inside=input.charAt(j);
			 if(ch==ch_inside) {
				 ch_1_count++;
			 }
		 }
		 System.out.println("charecter: "+ch+" count"+ ch_1_count);
		
		}
	 

	}

}
