package chapter06;

import java.util.*;

public class Example10 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("1", "zhu");
		map.put("2", "miao");
		map.put("3", "wnag");
		Set KeySet = map.keySet();
//		Iterator it = KeySet.iterator();
//		while (it.hasNext()) {
//			Object key = it.next();
//			Object value = map.get(key);
//			System.out.println(key + ":" + value);
//		}
		
		Set entrySet = map.entrySet();
		Iterator it = entrySet.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry)(it.next()); //获取集合中键值对映射
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + ":" + value);
		}
	}

}
