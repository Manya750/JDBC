package Applications;
import Classes.Database;
import java.util.*;

public class DatabaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Database db=new Database();
         int ch=0;
         Scanner sc=new Scanner(System.in);
         do {
              
        	 System.out.println("1.To Create a database");
        	 System.out.println("2. To Create a Table ");
        	 System.out.println("2. To insert a data into a table ");
             System.out.println("4. To update a data ");
             System.out.println("5. To delete a data");
             System.out.println("6. Exit");
        	 System.out.println("Enter your choice ");
        	     ch=sc.nextInt();
        	 
        	
             
        	
        	 switch(ch)
        	 {
        	 case 1:
        		 
        		 db.CreateDatabase();
        		 break;
        		 
        	 case 2: 
        		 db.CreateTable();
        		 break;
        	 case 3:
        		 db.InsertData();
        		 break;
        	 case 4:
        		 db.UpdateData();
        		 break;
        	 case 5:
        		 db.DeleteData();
        		 break;
        		 
        	 case 6:
        		 break;
        	 }
         }while(ch!=0);
         
	}

}
