package CodeCracker;

import java.util.HashMap;

public class CodeCracker {
		
	private static HashMap<String, String> code = new HashMap<String, String>();
		
		static 
		{
		
		code.put("a", "!");
		code.put("b", ")");
		code.put("c", "\"");
		code.put("d", "(");
		code.put("e", "£");
		code.put("f", "*");
		code.put("g", "%");
		code.put("h", "");
		code.put("i", "");
		code.put("j", "");
		code.put("k", "");
		code.put("l", "a");
		code.put("m", "b");
		code.put("n", "c");
		code.put("o", "d");
		code.put("p", "e");
		code.put("q", "f");
		code.put("r", "g");
		code.put("s", "h");
		code.put("t", "i");
		code.put("u", "j");
		code.put("v", "k");
		code.put("w", "l");
		code.put("x", "m");
		code.put("y", "n");
		code.put("z", "o");
		}

	
	
	public String encrypt(String character) {
		return code.get(character);
	}
	
	
}
