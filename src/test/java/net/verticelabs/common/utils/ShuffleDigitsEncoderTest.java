package net.verticelabs.common.utils;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ShuffleDigitsEncoderTest extends TestCase {

	public ShuffleDigitsEncoderTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(ShuffleDigitsEncoderTest.class);
	}

	public void testShuffleAndUnshuffleDigits() {
		ShuffleDigitsEncoder encoder = new ShuffleDigitsEncoder();
		assertEquals("4730376458258519",
				encoder.shuffleDigits("5258340179683574"));
		assertEquals("9778402358135456",
				encoder.shuffleDigits("4730376458258519"));
		assertEquals("6585927570334481",
				encoder.shuffleDigits("9778402358135456"));
		assertEquals("9778402358135456",
				encoder.unshuffleDigits("6585927570334481"));
		assertEquals("4730376458258519",
				encoder.unshuffleDigits("9778402358135456"));
		assertEquals("5258340179683574",
				encoder.unshuffleDigits("4730376458258519"));
	}

}
