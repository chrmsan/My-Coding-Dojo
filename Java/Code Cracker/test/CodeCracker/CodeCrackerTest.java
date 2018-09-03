package CodeCracker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CodeCrackerTest {

	@Test
	@DisplayName("Encrypt a single alphabetic character")
	void returnACharacter() {
		CodeCracker codecracker = new CodeCracker();
		String character = "a";
		
		String result = codecracker.encrypt(character);
		String expectedResult = "!";
		
		assertEquals(expectedResult, result);
		
	}

}
