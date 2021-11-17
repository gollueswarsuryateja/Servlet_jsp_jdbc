package demoCollection1;

import java.util.List;
import java.util.Scanner;

public class DemoMain {
	
	  public static void main(String[] args) {
		 MemberBo mb=new MemberBo();
		  List<Member> li=mb.getAllMembers();
		  for(Member m:li) {
			  System.out.println(m);
		  }
		 //entering details by user method 
//		  Scanner s=new Scanner(System.in);
//		  System.out.println("Enter email :");
//		  String email=s.next();
//		  
//		  System.out.println("Enter name :");
//		  String name=s.next();
//		  
//		  System.out.println("Enter mobile :");
//		  String mobile=s.next();
//		  
//		  System.out.println("Enter gender :");
//		  String gender=s.next();
//		  
//		  System.out.println("Enter age :");
//		  int age=s.nextInt();
//		  
//		  Member m1=new Member(email,name,mobile,gender,age);
//		  List<Member> ulist=mb.insertMembers(m1);
//		  for(Member m:ulist) {
//			  System.out.println(m);
//		  }
	}

}
