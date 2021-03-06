package CodeCracker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CodeCrackerTest {

	@Test
	@DisplayName("Encrypt a single alphabetic character, a")
	void returnACharacterA() {
		CodeCracker codecracker = new CodeCracker();
		String character = "a";
		
		String result = codecracker.encrypt(character);
		String expectedResult = "!";
		
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	@DisplayName("Encrypt a single alphabetic character, b")
	void returnACharacterB() {
		CodeCracker codecracker = new CodeCracker();
		String character = "b";
		
		String result = codecracker.encrypt(character);
		String expectedResult = ")";
		
		assertEquals(expectedResult, result);
		
	}
	/*
	@Test
	@DisplayName("Encrypt 'hello' ")
	void returnHello() {
		CodeCracker codecracker = new CodeCracker();
		String character = "hello";
		
		String result = codecracker.encrypt(character);
		String expectedResult = "$£aad";
		
		assertEquals(expectedResult, result);
		
	}
	
	*/

}
