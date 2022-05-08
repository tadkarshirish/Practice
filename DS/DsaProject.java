import java.util.*;
class Student {
	static Node arr[]=new Node[101];
Node head;
static class Node 
	{
		int roll;
		String Name;
		String Dept;
		int Marks;
		Node next;
	}
 
 
// Stores the head of the Linked List
// Node head = new Node();
// Check Function to check that if
// Record Already Exist or Not

boolean check(int x)
{
    // Base Case
    if (head == null)
        return false;
 
    Node  t = new Node();
		  t = head;
    // Traverse the Linked List
    while (t != null) {
        if (t.roll == x)
            return true;
			t = t.next;
		}
		return false;
	}
	void printbymarks(){
		    System.out.println(" ***************    TOPPERS   OF THE   CLASS  ***************************");
		    System.out.printf("| Roll No |"); 	
			System.out.printf("           Name         |"); 
			System.out.printf("       Department     |"); 
			System.out.printf("   Marks  |"); 
			System.out.println("\n-----------------------------------------------------------------------");
			
		for(int i=100;i>0;i--){
			if(arr[i]!=null){

				Node temp=arr[i];
				
			System.out.printf("%n| %4d ",temp.roll);System.out.printf("   |");
			System.out.printf(" %16s ",temp.Name);System.out.printf("      |");
			System.out.printf(" %13s ",temp.Dept);System.out.printf("       |");
			System.out.printf(" %5d ",temp.Marks);System.out.printf("   |");
			System.out.println("\n--------------------------------------------------------------------");
			
				//System.out.println(temp.Name);
			}
		}
	}
 void toArray(){
	// System.out.println ("to array");
	 
	Node temp=head;
	int a=0;
	while(temp!=null){
	for(int i=0;i<100;i++){
	if(i==temp.Marks){
		 arr[i]=temp;
	 }
 }
 temp=temp.next;
 }}


	 /*
	 Node temp=head;
	 for(int i=0;i<100;i++){
			System.out.println ("50 out ");
				if(temp!=null);
			// System.out.println ("50  iff");
			 //if(i==temp.Marks){
			//	System.out.println ("52  iff");
			 else{
				 arr[i]=temp;
				temp=temp.next;}
			 }
		 }
 }
*/
	 
 
// Function to insert the record
void Insert_Record(int roll, String Name,String Dept, int Marks)
{
    // if Record Already Exist
    if(check(roll)) {
        System.out.println("Student with this record Already Exists");
        return;
	}

    // Create new Node to Insert Record
    Node t = new Node();//new_Node creation
		t.roll = roll;
		t.Name = Name;
		t.Dept = Dept;
		t.Marks = Marks;
		t.next = null;
 
    // Insert at Begin
    if (head == null ||(head.roll>= t.roll))
     {
        t.next = head;  
        head = t;
    }
    // Insert at End
    else {
        Node c = head;// c pointer
        while (c.next != null && c.next.roll < t.roll) {
            c = c.next;            
         }
        t.next = c.next;///assigning null to t.next
        c.next = t;//added at end position
	}
    System.out.println("Record Inserted Successfully");

	}
 
// Function to search record for any
// students Record with roll number
void Search_Record(int roll)
	{
    // if head is null
    if (head==null) {
        System.out.println("No such Record available");
        return;
    }
	
    // Otherwise
    else {
			Node p = head;
			while (p!=null) {
            if (p.roll == roll) {
				
			System.out.printf("| Roll No |"); 	
			System.out.printf("           Name         |"); 
			System.out.printf("       Department     |"); 
			System.out.printf("   Marks  |"); 
			System.out.println("\n-----------------------------------------------------------------------");
			
			System.out.printf("%n| %4d ",p.roll);System.out.printf("   |");
			System.out.printf(" %16s ",p.Name);System.out.printf("      |");
			System.out.printf(" %13s ",p.Dept);System.out.printf("       |");
			System.out.printf(" %5d ",p.Marks);System.out.printf("   |");
			System.out.println("\n--------------------------------------------------------------------");
				
				
               /* System.out.println("Roll Number");
                System.out.println(p.roll) ;
                System.out.println("Name");
                System.out.println(p.Name);
                System.out.println("Department");
                System.out.println(p.Dept); 
                System.out.println("Marks");
                System.out.println(p.Marks);*/

                return;
            }
            p = p.next;
        }
 
        if (p == null)
                 System.out.println("No such Record");
                 System.out.println("Available");
    }
}
 
// Function to delete record students
// record with given roll number
// if it exist
int Delete_Record(int roll)
{
    Node t = head;
    Node p = null;
 
    // Deletion at Begin
    if (t != null && t.roll == roll) {
		arr[t.Marks]=null;
        head = t.next;
        System.out.println("Record Deleted Successfully ");
		//arr[t.Marks]=null;
        return 0;
    }
 
    // Deletion Other than Begin
    while (t != null && t.roll != roll) {
		arr[t.Marks]=null;
        p = t;
        t = t.next;
		
    }
    if (t == null) {
        System.out.println ("Record does not Exist");
        return -1;}
        p.next = t.next;
        arr[t.Marks]=null;
        t=null;
        System.out.println (" Record Deleted Successfully ");
       // arr[t.Marks]=null;
        return 0;
       
}
 
//Function to display the Student's
//Record
void Show_Record()
{
    Node p = head;
		if (p == null) {
			System.out.println ("No Record Available ");
			}
		else {
             System.out.println(" Index Name Course Marks");
          
        // Until p is not null
		   
       

			System.out.printf("| Roll No |"); 	
			System.out.printf("           Name         |"); 
			System.out.printf("       Department     |"); 
			System.out.printf("   Marks  |"); 
			System.out.println("\n-----------------------------------------------------------------------");
	   while (p != null) {
			
	        System.out.printf("%n| %4d ",p.roll);System.out.printf("   |");
			System.out.printf(" %16s ",p.Name);System.out.printf("      |");
			System.out.printf(" %13s ",p.Dept);System.out.printf("       |");
			System.out.printf(" %5d ",p.Marks);System.out.printf("   |");
			System.out.println("\n--------------------------------------------------------------------");
			
		/*	
		System.out.printf("%n | %9d |",p.roll); 	
          System.out.println("Roll Number of Student :"+p.roll);
          System.out.println("Name of Student :"+p.Name);
          System.out.println ("Department of Student :"+p.Dept);
          System.out.println("Marks of Student :"+p.Marks);
	*/
          p = p.next;
                }
			
      }
}
 
// Driver code
public static void main(String[] args)
{    
    Scanner sc=new Scanner(System.in);
    Student s=new Student();
    s.head = null;
    String Course;
    String Name;
    int Roll, Marks;
	boolean flag;
 
    // Menu-driven program
	System.out.println("************************ Welcome to CDAC Mumbai Record Portal ************************");
	String months[] = {
            "Jan", "Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        Calendar calendar = Calendar.getInstance();
		
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        System.out.println("**************************************************************************************");
	
	do{
				flag=false;
				System.out.println("Enter Your Login Username");
				String User=sc.next().trim();
				System.out.println("Enter Your Login Password");
				String Pass=sc.next().trim();
		
				if((User.equals("User")) && (Pass.equals("Pass")))
				{
					System.out.println("  ***** Login Successful, Welcome Back ! ***** ");
				}
				else{
					flag=true;
					System.out.println("XXXXX   Wrong Credentials, Please Try Again  XXXXX");
				}
			}while(flag);
										System.out.println("");
										System.out.println("Enter your Choice : ");
										System.out.println("");
					while (true) {						
										System.out.println("  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  _ _ _");
										System.out.println(" |  Press 1 : Create a new Record                   |");
										System.out.println(" |  Press 2 : Delete a Record as using roll number      |");
										System.out.println(" |  Press 3 : Student record to Search a Student    |");
										System.out.println(" |  Press 4 : To view all students record           |");
										System.out.println(" |  Press 5 : Check your toppers                    |");
										System.out.println(" |  Press 6 : Exit                                  |");
										System.out.println(" |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  _ _ _|");
		   
        int Choice;
        // Enter Your Choice
        Choice=sc.nextInt();
        if (Choice == 1) {
              sc.nextLine();
              System.out.println("Enter Name of Student");
              Name=sc.nextLine();
              System.out.println("Enter Roll Number of Student");
              Roll=sc.nextInt(); 
           
              System.out.println("Enter Course of Student");
              sc.nextLine();
              Course=sc.nextLine();
              System.out.println("Enter Total Marks of Student");
              Marks=sc.nextInt();
              s.Insert_Record(Roll, Name, Course, Marks);
			 
			  
        }
        else if (Choice == 2) {
                    System.out.println("Enter Roll Number of Student whose ");
                    System.out.println("record is to be deleted");
                    Roll=sc.nextInt();
                    s.Delete_Record(Roll);
        }
        else if (Choice == 3) {
            System.out.println("Enter Roll Number of Student whose ");
            System.out.println ("record you want to Search");
            Roll=sc.nextInt();
            s.Search_Record(Roll);
        }
        else if (Choice == 4) {
            s.Show_Record();
        }
        else if (Choice == 5)
         { 
			 s.toArray();
			 s.printbymarks();
            //System.exit(0);
        }
		
		 else if (Choice == 6)
         { 
			System.out.println ("Than You for Using our service.");
            System.exit(0);
        }
		
		
        else {
          System.out.println("Invalid Choice ");
          System.out.println("Try Again");
        }
		  System.out.println("");
		  System.out.println("");
		  System.out.println("Again Enter your Choice or you can chose other options");
    }
	
	
}}