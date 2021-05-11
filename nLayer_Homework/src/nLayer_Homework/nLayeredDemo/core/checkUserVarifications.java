package nLayer_Homework.nLayeredDemo.core;

public class checkUserVarifications {
	public static boolean checkRules(boolean firstName, boolean lastName, boolean password, boolean email) {
		boolean[] array = {firstName, lastName, password, email};
		for(boolean feed:array) {
			if(!feed) {
				return false;
			}
		}
		
		return true;
	}
}
