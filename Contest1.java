import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static List<String> splitString(String str, char esc) {
		List<String> answer = new ArrayList<String>();

		// Your Logic goes here

		String curr = "";
		for(char ch: str.toCharArray()) {
			if(ch == esc) {
				answer.add(curr);
				curr = "";
				continue;
			}
			curr += ch;
		}

		if(!(curr.equals(""))) {
			answer.add(curr);
		}

		return answer;
	}

	public static void main(String[] args) {
		String str = "My name is 'Ashok Kumar Gowda' I have 12+ years of experience I work for 'IBM India Pvt Ltd' ";

		List<String> answer = splitString(str, '\'');

		for (String a : answer) {
			System.out.println(a);
		}
	}
}
