import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurance {
	public static void main(String args[]) {
		List<String> names = new ArrayList<String>();
		Map<String,Integer> occuranceMap=new HashMap<String,Integer>();
		names.add("ramu");
		names.add("ramu");
		names.add("raju");
		names.add("Hari");
		names.add("raju");
		int count=1;
		for (String name :names ) {
		
			if(occuranceMap.containsKey(name)) {
				int fromMap=occuranceMap.get(name);
				occuranceMap.put(name,fromMap+1);
			}
			else {
				occuranceMap.put(name,count);
			}
		}
		System.out.println(occuranceMap);

	}

}
