import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Analise {
	private ArrayList<Hits> hits;
	Map<String, Integer> countMap = new HashMap<String, Integer>();
	
	/**
	 * 
	 */
	public Analise() {
		getIpCounts();
	}

	public void getIpCounts() {
				
		for (int i = 0; i < hits.size(); i++) {
			String key = hits.get(i).getiPaddr();
			if (countMap.containsKey(key)) {
				int count = countMap.get(key);
				count++;
				countMap.put(key, count);
			}else {
				countMap.put(key, 1);
			}
		}
		for (Entry<String, Integer> val : countMap.entrySet()) {
			System.out.println(val.getKey() +"shows up"+ val.getValue());
		}
	}

}
