package usermanagement.usermanagment.Repositary;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usermanagement.usermanagment.Model.user;

import java.util.List;

@Repository
public class userrepo {

    @Autowired
   private  List<user> users;
    public List<user> UserList(){
       return users;
    }


}
