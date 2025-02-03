package map;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Integer> map = new Hashtable<>(); //table소문자임 왜지?
		map.put("노말",1 );
		map.put("레어",2 );
		map.put("유니크",3 );
		map.put("레전더리",4 );
		map.put("신화",5 );
		System.out.println("크기: "+map.size());
		System.out.println(map.get("name"));
		System.out.println(map.get("유니크"));
		System.out.println(map.get("레전더리"));
		System.out.println(map.get("신화"));
		map.put("신화", 100); //키가 존재한다면 그 키의 밸류가 수정됩니다.
		System.out.println("크기: " + map.size());
		System.out.println(map.get("url"));
		int result = map.remove("레어");
		System.out.println("제거 " + result);
		System.out.println(map);
		//Map.Entry<K, V> entry;//Map인터페이스 안에 Entry라는 중첩 인터페이스입니다.
		
		Set <Map.Entry <String, Integer>> entrySet = map.entrySet();
	
		for(Map.Entry <String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		ZonedDateTime zonedNow = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(zonedNow);
		
		map.forEach((key,value)->{System.out.println(key+"::"+value);});
	}

}
