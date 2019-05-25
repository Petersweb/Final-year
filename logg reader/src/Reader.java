import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Reader {
	Scanner scanner;
	File logg;
	public ArrayList<Hits> hits = new ArrayList<>();
	Map<String, Integer> countMap = new HashMap<String, Integer>();

	public void readFile() {
		try {
			scanner = new Scanner(logg);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] data = line.split(" ");
			int response = Integer.parseInt(data[8]);
			int size = Integer.parseInt(data[9]);
			String userAgent = "";
			for (int x = 11; x < data.length; x++) {
				userAgent = userAgent + data[x];
			}
			Hits h = new Hits(data[0], data[5] + " " + data[6], data[7],
					data[3] + data[4], response, size, data[10], userAgent);
			hits.add(h);
		}
		System.out.println(hits.toString());
		getIpCounts();
	}

	/**
	 * @return the hits
	 */
	public ArrayList<Hits> getHits() {
		return hits;
	}
	public void addHit(Hits h) {
		hits.add(h);
	}

	public void setFile(String pathToFile) {
		logg = new File(pathToFile);
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
