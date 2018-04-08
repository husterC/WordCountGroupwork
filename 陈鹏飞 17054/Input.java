package Input;
import java.io.*;
import java.util.ArrayList;

public class Input {
	
	public static ArrayList<String> Input(String FilePath){
		ArrayList<String> result = new ArrayList<String>();
		File f = new File(FilePath);
		DataInputStream dis = null;
		if(!f.exists()){                                //不是路径的情况
			System.out.println("It's not a correct FilePath");
			return null;
		}
		else if(!f.isFile() && f.exists()){             //不是文件的情况
			System.out.println("It's a directory instead of a file");
			return null;
		}
		try {
            /*创建二进制输入流*/
            dis = new DataInputStream(new FileInputStream(f));
            
            /*循环读取并输出信息*/
            int temp = 0;
            String a = null;
            while(temp != -1 ){   //循环跳过连接的无效字符和有效字符用于计数
            	a = "";
            	while((temp = dis.read())!=-1 && (temp < 65 || (90 < temp && temp < 97) || temp > 122))
            		;
            	if(temp != -1)
            		a = a + (char)temp;
            	while(true){
            		while((temp = dis.read())!=-1 && ((65 <= temp && temp <= 90) || (97 <= temp && temp <= 122)))
            			a = a + (char)temp;
            		if(temp == '-'){
            			temp = dis.read();
            			if((65 <= temp && temp <= 90) || (97 <= temp && temp <= 122)){
            				a = a + (char)'-';
            				a = a + (char)temp;
            			}
            		}
            		else
            			break;
            	}
            	if(!a.equals(""))
            		result.add(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("It's not a correct FilePath");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("I/O create error");
        }
        finally{
            if (dis!=null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("I/O close error");
                }
            }
        }
		return result;
	}
	
}