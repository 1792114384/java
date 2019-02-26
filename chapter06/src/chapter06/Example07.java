package chapter06;

import java.util.*;

public class Example07 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(3);
		hs.add(2);
		hs.add(1);
		System.out.println(hs.size());
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
