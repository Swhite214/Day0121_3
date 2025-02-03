package map;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDate;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		//Key,value가 문자열 정해진 Map컬렉션
		//파일위치는 프로젝트이름 하위에 존재해야함
		Reader reader = new FileReader("application.properties");
		properties.load(reader);
		reader.close();
		System.out.println("크기: "+properties.size());
		
		Set<Object> keys = properties.keySet();
		for(Object key :keys) {
			System.out.println(key + "=" + properties.get(key));
		}
		System.out.println();
		for(Map.Entry<Object, Object> entry :properties.entrySet()) {
			System.out.println(entry.getKey()+":" + entry.getValue());
		}
		LocalDate ld = LocalDate.now();
	}

}
