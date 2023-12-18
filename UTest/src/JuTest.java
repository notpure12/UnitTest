
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JuTest {

	private String firsTwotLetter,lastTwoLetter;
	private int count = 0;
	@Test
	public int square(int x){
		return x*x;
	}
	@Test
	public int countLetterA(String word){
		
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)=='a'|| word.charAt(i)=='A'){
				count++;
			}System.out.println(count);
		}
		return count;
	}
	@Test
	public boolean checkTwoLetter(String letter){
		
		if(letter.length()<=1){
			return false;
		}
		else if(letter.length()==2){
			return true;
		}
		firsTwotLetter = letter.substring(0,2);
		lastTwoLetter = letter.substring(letter.length()-2);
		
		return firsTwotLetter.equals(lastTwoLetter);	
		
	}
	
}
