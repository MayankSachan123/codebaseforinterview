
public class CMDemo {

	public static void main(String[] args) {
		Contact[] contacts = { new Contact(), new Contact(), new Contact() };
	      LoggingCM lcm = new LoggingCM(new CM());
	      lcm.addContacts(contacts);

	}

}
