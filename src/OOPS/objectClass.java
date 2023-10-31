package OOPS;

class Address
{
	private int hno;

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public Address(int hno) {
		this.hno = hno;
	}
	
}
public class objectClass implements Cloneable {
	
	private int id;
	private String name;
	private Address address;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public objectClass(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		return super.equals(obj);
		objectClass emp = (objectClass)obj;
		if(emp.name.equals(emp.getName()) && id==emp.getId())
			
			return true;
		else
			return false;
		
	}
	@Override  //Deep Cloning 
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
//		return super.clone();
		Address addr = new Address(address.getHno());
		objectClass emp = new objectClass(id,name,addr);
		return emp;
	}
//	@Override
//	public boolean equals(Object o)
//	{
//		return(this == o);
//	}

	public static void main(String[] args) throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
		Address adr1 = new Address(404);
		objectClass emp = new objectClass(1,"Karan",adr1);
		objectClass emp2 = new objectClass(3,"Raj",adr1);
		objectClass emp3 = new objectClass(3,"Raj",adr1);
		objectClass emp4 = (objectClass) emp2.clone();
		emp2.setId(2);
		emp2.setName("User2"); // Changing the id and Name of the emp2 will not affect the clone, it remains the same.
		adr1.setHno(405);
		System.out.println("toString() : " + emp.toString()+" Address4= "+emp.getAddress().getHno());
		System.out.println("hashCode() : " + emp.hashCode());
		System.out.println("equals() : " + emp3.equals(emp2));
		System.out.println("equals() : " + emp3.name.equals(emp2.name));
		System.out.println("getClass() : " + emp.getClass().getName());
		System.out.println("Clone() : Id = "+ emp4.getId()+" Name= "+emp4.getName()+" Address4= "+emp4.getAddress().getHno()+" Address2= "+emp2.getAddress().getHno());
		System.out.println("wait() && notify() in multithreading");

	}


}
