package ch02.stringLogs;

public class TestLL {
	
	public static void main(String[] args) {
		LLStringLog test_target = new LLStringLog("ant");
/*		test_target.insert("bee");
		test_target.insert("cat");
*/		
		test_target.insert_beginning("bee");
		test_target.insert_beginning("cat");
		System.out.print(test_target.toString());
	}

}
