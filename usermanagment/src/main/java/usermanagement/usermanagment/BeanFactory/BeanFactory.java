package usermanagement.usermanagment.BeanFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import usermanagement.usermanagment.Model.Type;
import usermanagement.usermanagment.Model.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Configuration
public class BeanFactory {
 @Bean
    public List<user> alluser(){
        user init= new user(1,"sagar","sagar89669@gmail.com","8966930789", Type.CUSTOMER, LocalDate.of(1999,10,9));
        List<user> userinit= new ArrayList<>();
        userinit.add(init);
        return userinit;

    }
}
