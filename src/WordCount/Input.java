package WordCount;

import java.io.*;
import java.util.ArrayList;

public class Input {
	
	public static ArrayList<String> Input(String FilePath){               //ʵ�ֶ�ȡ���ʸ����Ĺ���
		ArrayList<String> result = new ArrayList<String>();
		File f = new File(FilePath);
		DataInputStream dis = null;
		if(!f.isFile() && f.exists()){                    //need improve
			System.out.println("File can not find");
			return result;
		}
		try {
            /*����������������*/
            dis = new DataInputStream(new FileInputStream(f));
            
            /*ѭ����ȡ�������Ϣ*/
            int temp = 0;
            String a = null;
            while(temp != -1 ){   //ѭ���������ӵ���Ч�ַ�����Ч�ַ����ڼ���
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
