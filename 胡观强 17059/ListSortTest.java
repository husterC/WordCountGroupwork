package Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ListSortTest {
	private static ListSort listSort = new ListSort();
    String param;
    String result;
    String result1[];
    String res[][];
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	//错误推测法
        	{"aaa,1,,3", "3aaa1"},
        	{"aaa,2,aaa,3","aaa3aaa2"},
        	{"a,1,b,2,c,3","c3b2a1"},
        	{"a,1,b,2,c,3,d,4","d4c3b2a1"},
        	{"a,1,b,2,c,3,d,4,e,6","e6d4c3b2a1"},
        	{"a,1,b,2,c,3,d,4,e,5,f,6","f6e5d4c3b2a1"},
        	{"a,1,b,2,c,3,d,4,e,5,f,6,g,7","g7f6e5d4c3b2a1"},
        	{"a,1,b,2,c,3,d,4,e,5,f,6,g,7,h,8","h8g7f6e5d4c3b2a1"},
        	{"a,1,b,2,c,3,d,4,e,5,f,6,g,7,h,8,i,9","i9h8g7f6e5d4c3b2a1"},
        	{"a,1,b,2,c,3,d,4,e,5,f,6,g,7,h,8,i,9,j,100","j100i9h8g7f6e5d4c3b2a1"},
        	
        	/*//基本路径测试
        	{"aaa,1,aaa", null},
            {"", null},
            {"aaa,2,bbb,1", "aaa2bbb1"},
            {"aaa,1,bbb,2", "bbb2aaa1"},
            {"bbb,1,aaa,1", "aaa1bbb1"},*/
            
            
            
        });
    }
    
    //构造函数，对变量进行初始化
    public ListSortTest(String param, String result){
        this.param = param;
        this.result = result;
    }

    @Test    
    public void testing() throws Exception{
        result1 = param.split("\\,");
        int i,j;
        if(result1.length%2 == 0) {
        	res = new String[result1.length/2][2];
        }
        else {
        	res = new String[result1.length/2+1][2];
        }
        for(i=0;i<result1.length/2;i++) {
        	for(j=0;j<2;j++) {
        		res[i][j] = result1[i*2+j];
        	}
        }
        listSort.listSort(res);
        
        assertEquals(result, listSort.result);
    }

}
