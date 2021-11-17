package demoCollection1;

import java.util.ArrayList;
import java.util.List;

public class MemberBo {

     public List<Member> getAllMembers(){
    	 List<Member> m=new ArrayList<Member>();
    	 m.add(new Member("eswar@.com","eswar","9898989898","Male",22));
    	 m.add(new Member("teja@.com","teja","9898989398","Male",19));
    	 m.add(new Member("surya@.com","surya","8790989898","Male",30));
    	 m.add(new Member("naidu@.com","naidu","63038989898","Male",33));
    	 m.add(new Member("srinu@.com","srinu","7287989898","Male",28));
    	 return m;
     }
     public List<Member> insertMembers(Member m){
    	 List<Member> mlist=getAllMembers();
    	 mlist.add(m);
    	 return mlist;
     }
     
	
}
