package map;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map = new HashMap<>();
		//key,value
		map.put(0,10);//Integer타입이면 뭐든 가능
		map.put(8, 10);
		map.put(7, 10);
		map.put(1, 10);
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.get(10));
		map.put(null, null);
		map.put(null, null);//중복이라 저장안됨
		System.out.println(map);
		map.put(8,20);
		map.remove(null);
		System.out.println(map);
		map.put(null, null);
		//for(:map) 불가능합니다 왜? 키와 값 쌍으로 이루어져있기때문에
		Set<Integer> keys=map.keySet();
		for(Integer key : keys) {
			System.out.println("key:" + key+" , value: " + map.get(key)); //null도 나오네? Integer인데도
		}
		System.out.println("value만----");
		for(Integer num:map.values()) {
			System.out.println(num);
		}
	}

}
