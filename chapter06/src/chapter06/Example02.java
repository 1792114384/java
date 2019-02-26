package chapter06;

import java.util.*;

public class Example02 {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		list1.add("zhu");
		list1.add("miao");
		list1.add("wang");
		list1.add("haha");
		System.out.println(list1.subList(1, 3));
		list1.set(0, "gou");
		System.out.println(list1);
		
	}
}
