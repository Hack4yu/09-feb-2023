public class Task2 {
	public static void main(String[] args) {
		String[] str1 = {"Hi ",null};
		String[] str2 = {"My ","name ","is "};
		String[] str3 = {"Soumya"};
		String[] str4 = {"BTech ETC ","student."};
		
		concat(str1);
		concat(str2);
		concat(str3);
		concat(str4);
	}
	
	static void concat(String[] str) {
		String val = " " ;
		for(int i=0;i<str.length;i++) {
			if(str[i]!=null)
				val=val.concat(str[i]);
		}
		System.out.print(val);
	}

}