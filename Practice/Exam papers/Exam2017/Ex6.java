import java.util.*;
public class Ex6
{


public static UserAccount lookForFriend(String name,UserAccount user){
      
}
    
public static void main(String[] args){
   ArrayList<UserAccount>  usersList=new ArrayList<UserAccount> ();
   UserAccount user1=new UserAccount("a1","b1","e1");
   UserAccount user2=new UserAccount("a2","b2","e2");
   user2.addFriend(user1);
   UserAccount friend= lookForFriend("a1", user2);
   System.out.println(friend.getName());

}

}
