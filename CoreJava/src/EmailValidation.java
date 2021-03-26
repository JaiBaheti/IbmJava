
public class EmailValidation {
	public static void main(String[] args) {
		String s1 = "Email@gmailcom";
		
		if(s1.indexOf("@")-s1.lastIndexOf("@")==0)
			if(s1.indexOf(".")-s1.indexOf("@")>3)
				if(s1.length()-s1.indexOf(".")>1)
					if(s1.length()-s1.indexOf("@")>4)
						System.out.println("True");
					else
						System.out.println("False");
	}
}
