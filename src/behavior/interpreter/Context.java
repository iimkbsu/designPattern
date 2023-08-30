package behavior.interpreter;

import java.util.StringTokenizer;

public class Context {
	
	private StringTokenizer tokenizer;
	private String currentKeyword;
	
	public Context(String script) {
		
		//Split과 StringTokenizer의 차이
		//split은 배열에 담아서 리턴함, StringTokenizer은 문자열 하나씩 리턴가능
		//split은 공백을 포함, StringTokenizer은 미포함 가능
		
		////StringTokenizer st = new StringTokenizer("문자열"); //띄어쓰기로 토큰화
		//StringTokenizer st = new StringTokenizer("문자열", "구분자"); //구분자로 토큰화 default는 false
		//StringTokenizer st = new StringTokenizer("문자열", "구분자", true/false); //구분자로 토큰화, 구분자 포함할지 여부
		
		//문자열의 띄어쓰기 기준으로 토큰화
		tokenizer = new StringTokenizer(script);
		readNextKeyword();
	}
	
	public String readNextKeyword() {
		if(tokenizer.hasMoreTokens()) {
			currentKeyword = tokenizer.nextToken();
			
		}else {
			currentKeyword = null;
			
		}
		return currentKeyword;
	}
	
	public String getCurrentKeyword() {
		return currentKeyword;
	}
}
