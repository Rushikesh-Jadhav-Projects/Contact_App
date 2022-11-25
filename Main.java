package Contact_App;


	import java.util.*;
	class Contact
	{
	 private String fName,lName,phNum,emailAdd;
	 public Contact(String fName, String lName, String phNum,String 
	emailAdd)
	 {
	 this.fName=fName;
	 this.lName=lName;
	 this.phNum=phNum;
	 this.emailAdd=emailAdd;
	 }
	 public void setFname(String fName)
	 {
	 this.fName=fName;
	 }
	 public void setLname(String lName)
	 {
	 this.lName=lName;
	 }
	 public void setPhNum(String phNum)
	 {
	 this.phNum=phNum;
	 }
	 public void setEmailAdd(String emailAdd)
	 {
	 this.emailAdd=emailAdd;
	 }
	 public String getFname()
	 {
	 return fName;
	 }
	 public String getLname()
	 {
	 return lName;
	 }
	 public String getPhNum()
	 {
	 return phNum;
	 }
	 public String getEmailAdd()
	 {
	 return emailAdd;
	 }
	}
	class DAOLayer
	{
	 public Contact searchPerson(ArrayList<Contact> al,String info)
	 {
	 Iterator<Contact> it=al.iterator();
	 while(it.hasNext())
	 {
	 if(it.next().getFname()==info)
	 {
	 Contact c=it.next();
	 System.out.println("Name:"+c.getFname());
	 System.out.println("LastName:"+c.getLname());
	 System.out.println("Phone:"+c.getPhNum());
	 System.out.println("Email:"+c.getEmailAdd());
	 return it.next();
	 }
	 }
	 return null;
	 }
	 public void addContact(ArrayList<Contact> al)
	 {
	 Iterator<Contact> it=al.iterator();
	 while(it.hasNext())
	 {
	 Contact c=it.next();
	 System.out.println("Name:"+c.getFname());
	 System.out.println("LastName:"+c.getLname());
	 System.out.println("Phone:"+c.getPhNum());
	 System.out.println("Email:"+c.getEmailAdd());
	 }
	 }
	}
	public class Main
	{
	 public static void main(String []args)
	 {
	 Scanner sc=new Scanner(System.in);
	 ArrayList<Contact> al=new ArrayList<Contact>();
	 String choice=sc.nextLine();
	 if(choice.equals("1"))
	 {
	 String fn=sc.nextLine();
	 String ln=sc.nextLine();
	 String ph=sc.nextLine();
	 String e=sc.nextLine();
	 String fn1=sc.nextLine();
	 String ln1=sc.nextLine();
	 String ph1=sc.nextLine();
	 String e1=sc.nextLine();
	 Contact c1=new Contact(fn,ln,ph,e);
	 Contact c2=new Contact(fn1,ln1,ph1,e1);
	 al.add(c1);
	 al.add(c2);
	 DAOLayer obj1=new DAOLayer();
	 obj1.addContact(al);
	 }
	 else{
	 String fn=sc.nextLine();
	 DAOLayer obj=new DAOLayer();
	 obj.searchPerson(al,fn);
	 }
	 }
	}
