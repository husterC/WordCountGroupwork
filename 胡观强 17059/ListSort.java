package Test;

public class ListSort {
	static String result;
	
	public static String[][] listSort(String [][]list){
		int i,j,tp;
		String temp, temp2;
		if(list[list.length-1][1] == null) {
			return null;
		}
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
		
		result = "";
		for(i=0;i<list.length;i++) {
			for(j=0;j<list[i].length;j++) {
				result += list[i][j];
			}
		}
		
		return list;
	}
}
