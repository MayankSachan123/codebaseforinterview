
public class LoggingCM extends CM {
	// A constructor is not necessary because the Java compiler will add a
	   // no-argument constructor that calls the superclass's no-argument
	   // constructor by default.

		private CM cm;

	   public LoggingCM(CM cm)
	   {
	      this.cm = cm;
	   }
	  
	   public void addContact(Contact contact)
	   {
	      Logger.log(contact.toString());
	      cm.addContact(contact);
	   }

	  
	   public void addContacts(Contact[] contacts)
	   {
	      for (int i = 0; i < contacts.length; i++)
	         Logger.log(contacts[i].toString());
	      cm.addContacts(contacts);
	   }
}
class Logger
{
   static void log(String msg)
   {
   System.out.println(msg);
   }
}