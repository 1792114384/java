package chapter06;

import java.util.*;

public class Example06 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("zhu");
		list.add("miao");
		list.add("wang");
		list.add("haha");
		for (Object obj : list) {
			System.out.println(obj);
		}
		int[] arr = { 3, 2, 6 };
		for (Object obj : arr) {
			System.out.println(obj);
		}
	}

}
