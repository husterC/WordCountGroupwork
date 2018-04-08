package test1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {	 
	public static void initialize(String filename){  //对文件初始化（清空文件内容）
		File f=new File(filename);
		BufferedWriter writer=null;
		try{
			writer=new BufferedWriter(new FileWriter(f));
			writer.write("");
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
	
	public static String Output(String str[][],String filename){
		File f=new File(filename);
		if(!f.exists()){
			System.out.println("文件名不存在");
		}
		initialize(filename);
		String s1="";
		BufferedWriter writer=null;
		try{
			String s="";
			writer=new BufferedWriter(new FileWriter(f));
			for(int i=0;i<str.length&&i<100;i++){
				s+=str[i][0]+" "+str[i][1]+"\r\n";
				s1+=s;
				writer.write(s);       //将内容写入
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
		return s1;
	}
	
	
	
	public static void main(String[] args){
		String[][] s={{"dd","8"},{"ccc","5"},{"aaa","7"}};
		Output(s,"1.txt");
	}
}
