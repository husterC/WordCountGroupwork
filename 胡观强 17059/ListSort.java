package WordCount;

public class ListSort {
	public static String[][] listSort(String[][] list){
		int i, j, tp;
		String temp, temp2;
		for(i = 1; i < list.length; i++) {
			temp2 = list[i][1];
			tp = Integer.parseInt(list[i][1]);
			temp = list[i][0];
			for(j = i-1; j >= 0; j--) {
				if(tp > Integer.parseInt(list[j][1])) {
					list[j+1][0] = list[j][0];
					list[j+1][1] = list[j][1];
				}
				else if(tp == Integer.parseInt(list[j][1])) {
					if(temp.compareTo(list[j][0]) < 0) {
						list[j+1][0] = list[j][0];
						list[j+1][1] = list[j][1];
					}
					else {
						break;
					}
				}
				else {
					break;
				}
			}
			list[j+1][0] = temp;
			list[j+1][1] = temp2;
		}
		return list;
	}
	
	public static void quickSort(String[][] list, int low, int high) {
		if(low >= high) {
			return;
		}
		int first = low;
		int last = high;
		int key = Integer.parseInt(list[first][1]);
		String key_2 = list[first][0];
		String key_3 = list[first][1];
		String temp;
		
		while(first < last) {
			while(first < last && Integer.parseInt(list[last][1]) < key) {
				--last;
			}
			while(first < last && key_2.compareTo(list[last][0]) != 1 && Integer.parseInt(list[last][1]) == key) {
				--last;
			}
			temp = list[first][0];
			list[first][0] = list[last][0];
			list[last][0] = temp;
			temp = list[first][1];
			list[first][1] = list[last][1];
			list[last][1] = temp;
			
			while(first < last && Integer.parseInt(list[first][1]) > key) {
				first++;
			}
			while(first < last && key_2.compareTo(list[first][0]) == 1 && Integer.parseInt(list[first][1]) == key) {
				first++;
			}
			temp = list[last][0];
			list[last][0] = list[first][0];
			list[first][0] = temp;
			temp = list[last][1];
			list[last][1] = list[first][1];
			list[first][1] = temp;
		}
		list[first][0] = key_2;
		list[first][1] = key_3;
		quickSort(list, low, first - 1);
		quickSort(list, first + 1, high);
	}
}