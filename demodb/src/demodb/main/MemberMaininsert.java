package demodb.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class MemberMaininsert {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	  //step 2
          Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/genesis_nov","root","root");
	 //step 3
          Statement stmt=c.createStatement();
	 
     //to insert we need values
          Scanner s=new Scanner(System.in);
		  System.out.println("Enter email :");
		  String email=s.next();
		  
		  System.out.println("Enter name :");
		  String name=s.next();
		  
		  System.out.println("Enter mobile :");
		  String mobile=s.next();
		  
		  System.out.println("Enter gender :");
		  String gender=s.next();
	  
		  System.out.println("Enter age :");
		  int age=s.nextInt();
		  
		 boolean b=stmt.execute("insert into member values('"+email+"','"+name+"','"+mobile+"','"+gender+"',"+age+")");
		 System.out.println(b);
		 c.close();
	}

} 
