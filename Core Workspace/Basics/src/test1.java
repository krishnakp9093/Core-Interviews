
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "gopal";
		try {
			System.out.println(s.charAt(9));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally block");
		}

	}

}
