package practice;

import java.util.Scanner;

public class IfEx4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("무슨 과일? : ");
		String fr = sc.next();
		String res;
		if (fr.equals("포도")) {
			res = "달다";
		}else if (fr.equals("수박")) {
			res = "시원하다";
		}else if (fr.equals("딸기")) {
			res = "맛있다";
		}else {
			res = "기타";
		}
		System.out.println(res);
	}
}
