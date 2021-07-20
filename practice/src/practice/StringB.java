package practice;

public class StringB {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("jump to java");
		System.out.println(sb.toString());
		
		String str = "";
		str += "Hello";
		str += " ";
		str += "jump to java";
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("jump to java");
		sb2.insert(0, "hello ");
		System.out.println(sb2.toString());
		
		StringBuffer sb3 = new StringBuffer();
		sb3.append("Hello jump to java");
		System.out.println(sb3.substring(0, 18));
	}//end main
}//end class
