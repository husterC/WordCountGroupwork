package wcInput;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class wcInputTest {

	public ArrayList<String> list = new ArrayList<String>();
	
	@Before
	public void setUp() throws Exception {
	}
	//white_box test
	@Test
	public void testInput_1() {
		list.clear();
		assertEquals(0,wcInput.Input("input1.txt").size());
	}
	@Test
	public void testInput_2() {
		list.clear();
		assertEquals(0,wcInput.Input("input2.txt").size());
	}
	@Test
	public void testInput_3() {
		list.clear();
		list.add("a");
		assertEquals(list,wcInput.Input("input3.txt"));
	}
	@Test
	public void testInput_4() {
		list.clear();
		list.add("a");
		assertEquals(list,wcInput.Input("input4.txt"));
	}
	@Test
	public void testInput_5() {
		list.clear();
		list.add("test");
		assertEquals(list,wcInput.Input("input5.txt"));
	}
	@Test
	public void testInput_6() {
		list.clear();
		list.add("test");
		assertEquals(list,wcInput.Input("input6.txt"));
	}
	@Test
	public void testInput_7() {
		list.clear();
		list.add("to");
		assertEquals(list,wcInput.Input("input7.txt"));
	}
	@Test
	public void testInput_8() {
		list.clear();
		list.add("to-do");
		assertEquals(list,wcInput.Input("input8.txt"));
	}
	@Test
	public void testInput_9() {
		list.clear();
		list.add("the");
		list.add("test");
		assertEquals(list,wcInput.Input("input9.txt"));
	}
	@Test
	public void testInput_10() {
		list.clear();
		assertEquals(null,wcInput.Input("not path"));
	}
	@Test
	public void testInput_11() {
		list.clear();
		assertEquals(null,wcInput.Input("D:\\"));
	}
	
	
	//black-box test
	@Test
	public void testInput_12() {
		list.clear();
		list.add("software");
		assertEquals(list,wcInput.Input("input12.txt"));
	}
	@Test
	public void testInput_13() {
		list.clear();
		list.add("contend-based");
		assertEquals(list,wcInput.Input("input13.txt"));
	}
	@Test
	public void testInput_14() {
		list.clear();
		list.add("let");
		list.add("s");
		assertEquals(list,wcInput.Input("input14.txt"));
	}
	@Test
	public void testInput_15() {
		list.clear();
		list.add("night");
		assertEquals(list,wcInput.Input("input15.txt"));
	}
	@Test
	public void testInput_16() {
		list.clear();
		list.add("I");
		assertEquals(list,wcInput.Input("input16.txt"));
	}
	@Test
	public void testInput_17() {
		list.clear();
		list.add("table");
		assertEquals(list,wcInput.Input("input17.txt"));
	}
	@Test
	public void testInput_18() {
		list.clear();
		list.add("see");
		list.add("box");
		list.add("d");
		list.add("c");
		assertEquals(list,wcInput.Input("input18.txt"));
	}
	@Test
	public void testInput_19() {
		list.clear();
		assertEquals(null,wcInput.Input("wrong path"));
	}
	@Test
	public void testInput_20() {
		list.clear();
		assertEquals(null,wcInput.Input("C:\\"));
	}
}
