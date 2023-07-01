package usermanagement.usermanagment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usermanagement.usermanagment.Model.user;
import usermanagement.usermanagment.Repositary.userrepo;

import java.util.ArrayList;
import java.util.List;

@Service
public class service {
     @Autowired
     userrepo UserRepo;

     public List<user> alluser() {
     return UserRepo.UserList();
     }

     public String userList(user User) {
          List <user> adduser = alluser();
         for(user user :adduser){
              adduser.add(User);
             return "user added";
         }
         return "User not found";
     }

    public String deleteuser(Integer id) {
         List<user> alluser = alluser();
         for(user e:alluser){
             if(e.getUserid().equals(id)){
                 alluser.remove(e);
                 return "user removed";
             }
         }
         return "id does not found";
    }

    public String updateuserinfo(Integer id, String email) {
         List<user> alluser = alluser();
         for(user u:alluser){
             if(u.getUserid().equals(id)){
                 u.setUseremail(email);
                 return "user mail id updated";
             }
         }
         return "id does not found";
    }
}
