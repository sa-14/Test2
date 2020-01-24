
public class Department {
	
	
	String deptName;
	String Id;
	String location;
	
	
	
	
	Department () {
		
	}
	
	
	Department (String n, String i){
		 deptName=n;
		 Id=i;
	}
	
	public Department (String n, String  i, String l) {
		
		 deptName=n;
		 Id=i;
		 location=l;
		 
		 
		
	}
	
	
	public static void main(String[] args) {
		Department coo = new Department ();
		Department c = new Department("Department7","76543" );
		Department co = new Department ("Frank ", "12345", " Virginia ");
		
		System.out.println("name: " + c.deptName);
		System.out.println("Id: " + c.Id );
		System.out.println("Location: " + co.location);
		
		System.out.println("DeptName, Id, location: " + co.deptName + co.Id + co.location);
		
		
	
	
	

}
	
}
