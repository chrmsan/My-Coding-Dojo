package CodeCracker;

public class CodeCracker {	
	
	public String encrypt(String character) {
		return CodeDB.code.get(character);
	}
	
	
}
