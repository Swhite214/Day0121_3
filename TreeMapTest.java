package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정렬-key
		TreeMap<String,Integer>map = new TreeMap<>();
		map.put("가", 10); //문자열이 key라면 과연 무슨 방식으로 정렬이 됩니까?
		map.put("나나", 200);
		map.put("나", 20);
		map.put("가가", 100);
		//map.put(null, null); null안됨.... 트리는 null안됨 //정렬하려면 값을 비교하기때문
		map.put("aaaaaaaaaaaaaaaaaaaaaaaaaaa", 200);
		//계층형(부모-자식)성질을 이용한 기능(메서드를)제공, 정렬관련된 기능 제공
		System.out.println(map);//걍 이렇게 하면 안되나?
		System.out.println("크기 : " + map.size());
		for(Map.Entry<String, Integer> entry :map.entrySet()) {
			System.out.println(entry);//유니코드로 변환한값의 순으로 정렬됩니다.
		}
	}

}
