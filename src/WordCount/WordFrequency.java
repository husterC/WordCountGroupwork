package WordCount;

import java.util.ArrayList;


public class WordFrequency {
	public static String[][] WordFrequency(ArrayList<String> list){		
		String res[] = new String[1000];
		int num[] = new int[1000];
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
					num[i]++;
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
