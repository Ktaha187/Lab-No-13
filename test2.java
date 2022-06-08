package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {

	@Test
	public void test() {
		count_A obj = new count_A();
		int output = obj.countA("AAAaaasss");
		assertEquals(6,output);
	}

}
