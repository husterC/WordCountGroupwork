package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class WordFrequencyTest {
    String param;
    String result;
    String[] result1;
    String res[][];
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	/*{"aaa,bbb,aaa", "aaa2bbb1"},*/ 
        	{"aa","aa1"},
        	{"aa,bb,aa","aa2bb1"},
        	{"aa,bb,cc","aa1bb1cc1"},
        	{"aa,aa","aa2"},
        	{"aa,cc","aa1cc1"},
        	{"aa,bb,cc,dd,ee","aa1bb1cc1dd1ee1"},
        	{"aa,bb,cc,dd,ee,ff","aa1bb1cc1dd1ee1ff1"},
        	{"aa,aa,aa","aa3"},
        	{"aa,bb,aa,aa","aa3bb1"},
        	{"aa,bb,bb,bb","aa1bb3"},
        	{"aa,bb,cc,cc,cc","aa1bb1cc3"},
        	{"aa,bb,bb,cc,cc","aa1bb2cc2"},
        	{"aa,bb","aa1bb1"},
        	{"aa,bb,bb","aa1bb2"},
        	{"aa,bb,cc","aa1bb1cc1"},
        	{"aa,bb,cc,dd","aa1bb1cc1dd1"},
        	{"aa,bb,cc,dd,cc","aa1bb1cc2dd1"},
        	{"aa,bb,cc,dd,bb","aa1bb2cc1dd1"},
        	{"aa,bb,cc,dd,aa","aa2bb1cc1dd1"},
        	{"aa,bb,cc,dd,dd","aa1bb1cc1dd2"}
        });
    }
    
    //构造函数，对变量进行初始化
    public WordFrequencyTest(String param, String result){
        this.param = param;
        this.result = result;
    }

    @Test    
    public void testing() throws Exception{
        result1 = param.split("\\,");
        int i;
        ArrayList<String> param1 = new ArrayList<String>();
        
        for(i=0;i<result1.length;i++) {
        	param1.add(i, result1[i]);
        }
        res = WordFrequency.WordFrequency(param1);
        String str;
        str = "";
        for(i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				str+= res[i][j];
			}
		}
        
        assertEquals(result, str);
    }

}
