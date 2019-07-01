import java.util.Map;
import java.util.HashMap;

public class TestMap {
	public static void main(String []args) {
		Map<String, Integer> nilai = new HashMap<String, Integer>();

		nilai.put("Budi", 30);
		nilai.put("Agus", 50);
		nilai.put("Budi", 70);
		Map<String, List<Integer>> nilais = new HashMap<String, LIst<Integer>>();
		for (String k: nilai.keySet()) {
		}
		for(Integer n: nilai.values()) {
		}
		for(Map.Entry<String, Integer> e: nilai.entrySet()) {
			e.getKey();
			e.getValue();
		}
	}
}
