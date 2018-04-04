package WordCount;

public class ListSort {
	public static String[][] ListSort(String [][]list){
		int i,j,tp;
		String temp, temp2;
		for(i=1;i<list.length;i++) {
			temp2 = list[i][1];
			tp = Integer.parseInt(list[i][1]);
			temp = list[i][0];
			for(j=i-1;j>=0;j--) {
				if(tp>Integer.parseInt(list[j][1])) {
					list[j+1][0] = list[j][0];
					list[j+1][1] = list[j][1];
				}
				else if(tp==Integer.parseInt(list[j][1])) {
					if(temp.compareTo(list[j][0])<0) {
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
}