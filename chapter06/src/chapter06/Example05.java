package chapter06;

import java.util.*;

public class Example05 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("zhu");
		list.add("miao");
		list.add("wang");
		list.add("haha");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
