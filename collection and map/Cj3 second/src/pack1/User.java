package pack1;

public class User {
	private String userName;
	private int age;
	private String password;
	
	public void setuserName(String userName){
		this.userName=userName;
		}
	public String getUsername(){
		return userName;
		
	}
	public void setAge(int age){
		if (age>0) {
			this.age=age;
			
		} else {
			System.out.println("please enter age above 0");

		}

	}
	public int  getAge(){
		return age;
		
	}
	public void setPassword(String password){
		if (password.length()>=8) {
			this.password=password;
			
		} else {
			System.out.println("password should be maximum or equal to 8 digits");

		}
	}
	public String getPassword(){
		return password;
		
	}

}
