package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {

	@Test
	public void test() {
		square obj = new square();
		int output = obj.square(5);
		assertEquals(25,output);
	}

}
