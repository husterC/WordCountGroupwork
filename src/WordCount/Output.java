package WordCount;

import java.io.*;

public class Output {

	public static void Output(String str[][],File f){
		if(!f.exists()){
			System.out.println("�ļ���������");
		}
		BufferedWriter writer=null;
		try{
			String s="";
			writer=new BufferedWriter(new FileWriter(f));
			for(int i=0;i<str.length&&i<100;i++){
				s+=str[i][0]+" "+str[i][1]+"\r\n";
				writer.write(s);       //������д��
				s="";
			}
		}
		catch (FileNotFoundException e0){
			e0.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try{
				writer.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
