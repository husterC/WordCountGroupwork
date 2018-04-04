package WordCount;

import java.io.*;
import java.util.ArrayList;

public class Input {
	
	public static ArrayList<String> Input(String FilePath){               //实现读取单词个数的功能
		ArrayList<String> result = new ArrayList<String>();
		File f = new File(FilePath);
		DataInputStream dis = null;
		if(!f.isFile() && f.exists()){                    //need improve
			System.out.println("File can not find");
			return result;
		}
		try {
            /*创建二进制输入流*/
            dis = new DataInputStream(new FileInputStream(f));
            
            /*循环读取并输出信息*/
            int temp = 0;
            String a = null;
            while(temp != -1 ){   //循环跳过连接的无效字符和有效字符用于计数
            	a = "";
            	while((temp = dis.read())!=-1 && (temp == '\n' || temp == '\t' || temp == ' ' || temp == ',' || temp == '\r'))
            		;
            	if(temp != -1)
            		a = a + (char)temp;
            	while((temp = dis.read())!=-1 && temp != '\n' && temp != '\t' && temp != ' ' && temp != ',' && temp != '\r')
            		a = a + (char)temp;
            	result.add(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            if (dis!=null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		return result;
	}
	
}
