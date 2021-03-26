import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodingClass {
	public static void main(String[] args) {
		String pwd ="Hey";
		System.out.println(pwd);
		
		Encoder encode= Base64.getEncoder();
		String encodPwd = encode.encodeToString(pwd.getBytes());
		System.out.println(encodPwd);
		
		Decoder decod = Base64.getDecoder();
		String deoPwd=new String(decod.decode(encodPwd.getBytes()));
		System.out.println(deoPwd);
	}
}
