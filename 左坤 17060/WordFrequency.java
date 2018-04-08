package WordCount;

import java.util.ArrayList;

public class WordFrequency {
	public static String[][] wordFrequency(ArrayList<String> list){		
		String res[] = new String[list.size()];
		int num[] = new int[list.size()];
		int i,j;
		int sum = 0;
		boolean state;
		for(i=0;i<list.size();i++) {
			state = false;
			if(i==0) {
				res[sum] = list.get(0);
				num[0]++;
				sum++;
			}
			else {			
				for(j=0;j<sum;j++) {
					if(res[j].equals(list.get(i))) {
						num[j]++;
						state = true;
						break;
					}
				}
				if(state == false) {
					res[sum] = list.get(i);
					num[sum]++;
					sum++;
				}
			}
		}
		String[][] str = new String[sum][2];
		for(i=0;i<sum;i++) {
			str[i][0] = res[i];
			str[i][1] = String.valueOf(num[i]);
		}
		return str;
	}
}
