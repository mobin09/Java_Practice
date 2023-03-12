package stringAssignment;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {

	public static void main(String[] args) {
		String str = "wnwgdy!%abcdwn";
		HashMap<Character, Integer> map = new HashMap<>();
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				// logic for increment the value
				Integer times = map.get(ch);
				map.put(ch, ++times);

			} else {
				map.put(ch, 1);
			}
		}

		// System.out.println(map);

		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() == 1) {
				result += m.getKey();
			}
		}

		System.out.println("Unique Character");
		System.out.println(result);

	}

}
