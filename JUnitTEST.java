package jUnitWordOccurrences;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTEST {

	@Test
	public void test() {
		WordOccurrence test = new WordOccurrence ();
		int output = test.inputNumber(20);
		assertEquals (20, output);
		
	}

}
