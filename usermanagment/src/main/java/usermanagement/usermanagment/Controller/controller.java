package usermanagement.usermanagment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import usermanagement.usermanagment.Model.user;
import usermanagement.usermanagment.Service.service;

import java.util.List;

@RestController
public class controller {
    @Autowired
    service UserService;

    @GetMapping("users")
    public List<user> userList(){

        return UserService.alluser();
    }
    @PostMapping("addusers")
    public String userList( @RequestBody user User){
        return UserService.userList(User);
    }

    @DeleteMapping("removeuser/{id}")
    public String deleteuser(@PathVariable Integer id){
        return UserService.deleteuser(id);
    }
    @PutMapping("updateuserinfo/{id}/{email}")
        public String updateuserinfo(@PathVariable Integer id, @PathVariable String email){
        return UserService.updateuserinfo(id,email);
    }

}
