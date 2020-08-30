package todo;

public class UserValidation {
	public boolean isUserValid(String name,String password) {
		if(name.equals("prachi") && password.equals("1234"))
			return true;
		else
			return false;
	}
}
