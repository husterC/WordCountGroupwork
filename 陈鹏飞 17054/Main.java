package WordCount;

import java.io.File;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		ArrayList<String> inFile = new ArrayList<String>();
		inFile = Input.Input(args[0]);
		String[][] outFile = null;
		outFile = WordFrequency.wordFrequency(inFile);
		outFile = ListSort.ListSort(outFile);
		File f = new File("outFile.txt");
		Output.Output(outFile,f);
		Input.Input(args[0]);
		
	}
}
