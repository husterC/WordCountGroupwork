package test1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTest {

	@Before
	public void setUp() throws Exception {   //开始测试前先将输出文件清空
		test1.initialize("1.txt");
	}

	@After
	public void tearDown() throws Exception {  //完成测试将输出文件清空
		test1.initialize("1.txt");
	}

	@Test
	public void testOutputtest1() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd","3"},{"aaa","2"}};
		String s1="ddd 3\r\naaa 2\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}

	@Test
	public void testOutputtest2() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd","5"},{"aaa","4"},{"csa","3"},{"dddda","2"}};
		String s1="ddd 5\r\naaa 4\r\ncsa 3\r\ndddda 2\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}

	@Test
	public void testOutputtest3() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd-d","3"},{"aaa-a","2"}};
		String s1="ddd-d 3\r\naaa-a 2\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
	
	@Test
	public void testOutputtest4() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd-d","3"},{"aaa","2"}};
		String s1="ddd-d 3\r\naaa 2\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
	
	@Test
	public void testOutputtest5() {
		//fail("Not yet implemented");
		String str1[][]={{"abc","3"},{"dda","2"}};
		String s1="abc 3\r\ndda 2\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
	
	@Test
	public void testOutputtest6() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd-d","3"},{"aaa-a","2"}};
		String s1="ddd-d 3\r\naaa-a 2\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
	
	@Test
	public void testOutputtest7() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd-dsss","3"},{"aaa-agg","2"}};
		String s1="ddd-dsss 3\r\naaa-agg 2\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
	
	@Test
	public void testOutputtest8() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd-d","5"},{"aaa-v","4"},{"csa-b","3"},{"dddda","2"}};
		String s1="ddd-d 5\r\naaa-v 4\r\ncsa-b 3\r\ndddda 2\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
	
	@Test
	public void testOutputtest9() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd-d","5"},{"aaa-v","4"},{"csa-b","3"},{"dddda","2"},{"csa-n","2"},{"ddda","1"}};
		String s1="ddd-d 5\r\naaa-v 4\r\ncsa-b 3\r\ndddda 2\r\ncsa-n 2\r\nddda 1\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
	
	@Test
	public void testOutputtest10() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd-d","100"},{"aaa-v","50"},{"csa-b","30"},{"dddda","20"},{"csa-n","15"},{"ddda","10"}};
		String s1="ddd-d 100\r\naaa-v 50\r\ncsa-b 30\r\ndddda 20\r\ncsa-n 15\r\nddda 10\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
	
	@Test
	public void testOutputtest11() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd-d","100"},{"aaa-v","50"},{"csa-b","30"},{"dda-g","20"},{"csa-n","15"},{"ddda-y","10"}};
		String s1="ddd-d 100\r\naaa-v 50\r\ncsa-b 30\r\ndda-g 20\r\ncsa-n 15\r\nddda-y 10\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
	
	@Test
	public void testOutputtest12() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd-d","100"},{"aaa-v","50"},{"csa-b","30"},{"dda-g","20"},{"csa-n","15"},{"ddda-y","10"},{"test","8"},{"ccs","5"}};
		String s1="ddd-d 100\r\naaa-v 50\r\ncsa-b 30\r\ndda-g 20\r\ncsa-n 15\r\nddda-y 10\r\ntest 8\r\nccs 5\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
	
	@Test
	public void testOutputtest13() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd-d","100"},{"aaa-v","50"},{"csa-b","30"},{"dda-g","20"},{"csa-n","15"},{"ddda-y","10"},{"test-f","8"},{"ccs-b","5"}};
		String s1="ddd-d 100\r\naaa-v 50\r\ncsa-b 30\r\ndda-g 20\r\ncsa-n 15\r\nddda-y 10\r\ntest-f 8\r\nccs-b 5\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
	
	@Test
	public void testOutputtest14() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd-d","100"},{"aaa-v","50"},{"csa-b","30"},{"dda-g","20"},{"csa-n","15"},{"ddda-y","10"},{"test-f","8"},{"ccs-b","5"},{"www-g","4"},{"lll-f","3"}};
		String s1="ddd-d 100\r\naaa-v 50\r\ncsa-b 30\r\ndda-g 20\r\ncsa-n 15\r\nddda-y 10\r\ntest-f 8\r\nccs-b 5\r\nwww-g 4\r\nlll-f 3\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
	
	@Test
	public void testOutputtest15() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd-d","1000"},{"aaa-v","500"},{"csa-b","300"},{"dda-g","200"},{"csa-n","150"},{"ddda-y","100"},{"test-f","80"},{"ccs-b","50"},{"www-g","40"},{"lll-f","30"}};
		String s1="ddd-d 1000\r\naaa-v 500\r\ncsa-b 300\r\ndda-g 200\r\ncsa-n 150\r\nddda-y 100\r\ntest-f 80\r\nccs-b 50\r\nwww-g 40\r\nlll-f 30\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
	
	@Test
	public void testOutputtest16() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd-d","100"},{"aaa-v","50"},{"csa-b","30"},{"dda-g","20"},{"csa-n","15"},{"ddda-y","10"},{"test-f","8"},{"ccs-b","5"},{"www-g","4"},{"lll-f","3"},{"wws-g","3"},{"wwo-f","2"}};
		String s1="ddd-d 100\r\naaa-v 50\r\ncsa-b 30\r\ndda-g 20\r\ncsa-n 15\r\nddda-y 10\r\ntest-f 8\r\nccs-b 5\r\nwww-g 4\r\nlll-f 3\r\nwws-g 3\r\nwwo-f 2\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
	
	@Test
	public void testOutputtest17() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd-d","1000"},{"aaa-v","500"},{"csa-b","300"},{"dda-g","200"},{"csa-n","150"},{"ddda-y","100"},{"test-f","80"},{"ccs-b","50"},{"www-g","40"},{"lll-f","30"},{"wws-g","25"},{"wwo-f","20"}};
		String s1="ddd-d 1000\r\naaa-v 500\r\ncsa-b 300\r\ndda-g 200\r\ncsa-n 150\r\nddda-y 100\r\ntest-f 80\r\nccs-b 50\r\nwww-g 40\r\nlll-f 30\r\nwws-g 25\r\nwwo-f 20\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
	
	@Test
	public void testOutputtest18() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd-d","100"},{"aaa-v","50"},{"csa-b","30"},{"dda-g","20"},{"csa-n","15"},{"ddda-y","10"},{"test-f","8"},{"ccs-b","5"},{"www-g","4"},{"lll-f","3"},{"wws-g","3"},{"wwo-f","2"},{"test-e","1"},{"ccs-m","1"}};
		String s1="ddd-d 100\r\naaa-v 50\r\ncsa-b 30\r\ndda-g 20\r\ncsa-n 15\r\nddda-y 10\r\ntest-f 8\r\nccs-b 5\r\nwww-g 4\r\nlll-f 3\r\nwws-g 3\r\nwwo-f 2\r\ntest-e 1\r\nccs-m 1\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
	
	@Test
	public void testOutputtest19() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd-d","1000"},{"aaa-v","500"},{"csa-b","300"},{"dda-g","200"},{"csa-n","150"},{"ddda-y","100"},{"test-f","80"},{"ccs-b","50"},{"www-g","40"},{"lll-f","30"},{"wws-g","25"},{"wwo-f","20"},{"test-e","16"},{"ccs-m","11"}};
		String s1="ddd-d 1000\r\naaa-v 500\r\ncsa-b 300\r\ndda-g 200\r\ncsa-n 150\r\nddda-y 100\r\ntest-f 80\r\nccs-b 50\r\nwww-g 40\r\nlll-f 30\r\nwws-g 25\r\nwwo-f 20\r\ntest-e 16\r\nccs-m 11\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
	
	@Test
	public void testOutputtest20() {
		//fail("Not yet implemented");
		String str1[][]={{"ddd-d","100"},{"aaa-v","50"},{"csa-b","30"},{"dda-g","20"},{"csa-n","15"},{"ddda-y","10"},{"test-f","8"},{"ccs-b","5"},{"www-g","4"},{"lll-f","3"},{"wws-g","3"},{"wwo-f","2"},{"test-e","1"},{"ccs-m","1"},{"wwc-g","1"},{"lsl-f","1"}};
		String s1="ddd-d 100\r\naaa-v 50\r\ncsa-b 30\r\ndda-g 20\r\ncsa-n 15\r\nddda-y 10\r\ntest-f 8\r\nccs-b 5\r\nwww-g 4\r\nlll-f 3\r\nwws-g 3\r\nwwo-f 2\r\ntest-e 1\r\nccs-m 1\r\nwwc-g 1\r\nlsl-f 1\r\n";
		assertEquals(s1,test1.Output(str1,"1.txt"));
	}
}
