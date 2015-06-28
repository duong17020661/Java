package Ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		String str = "Ha Noi oi Ha Noi";
		StringBuilder builder = new StringBuilder();
		List<String> list = new ArrayList<String>();
		
		for (int i = 0; i <= str.length(); i++) {
			if (i != str.length()) {
				if (str.charAt(i) != ' ') {
					builder.append(str.charAt(i));
				} else {
					list.add(builder.toString());
					builder = new StringBuilder();
				}
			} else {
				list.add(builder.toString());
			}
		}
		System.out.println(list);
		HashMap<String, Integer> countMap = new HashMap<>();
		for (String obj: list) {
			Integer i = countMap.get(obj);
			if (i == null) {
				i = 0;
			}
			countMap.put(obj, i + 1);
		}
		System.out.println(countMap);
	}
	
}
