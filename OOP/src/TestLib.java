import com.ibm.lib.Book;
import com.ibm.lib.LibException;
import com.ibm.lib.Member;

public class TestLib {
	public static void main(String[] args) {	
		Book bk = new Book(1234,"SDF");
		Member mbr = new Member(66,"TYU");
		Member mbr2 = new Member(77,"WES");
		try {
			bk.status();
		} catch (LibException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			mbr.status();
		} catch (LibException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			bk.issue(mbr);
		} catch (LibException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*try {
			bk.issue(mbr2);
		} catch (LibException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			bk.returnBook(mbr2);
			//bk.returnBook(mbr2);
		} catch (LibException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			bk.status();
		} catch (LibException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			mbr.status();
		} catch (LibException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//bk.returnBook(mbr);
		
		try {
			bk.status();
		} catch (LibException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
			//e1.printStackTrace();
		}
		try {
			mbr2.status();
		} catch (LibException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		//bk.returnBook(mbr);
		//bk.returnBook(mbr2);
	}
	
}
