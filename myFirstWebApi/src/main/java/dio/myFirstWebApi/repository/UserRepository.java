package dio.myFirstWebApi.repository;
import dio.myFirstWebApi.hendler.BusinessException;
import dio.myFirstWebApi.hendler.RequiredFieldException;
import dio.myFirstWebApi.model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private void validateUserFields(User user) {
        if (user.getLogin() == null || user.getLogin().isEmpty())
            throw new RequiredFieldException("login");

        if (user.getPassword() == null || user.getPassword().isEmpty())
            throw new RequiredFieldException("password");
    }
    public void save(User user) {
        validateUserFields(user);
        System.out.println("SAVE - Receiving the user in the repository layer");
        System.out.println(user);
    }
    public void update(User user) {
        validateUserFields(user);
        System.out.println("UPDATE - Receiving the user in the repository layer");
        System.out.println(user);
    }

    public void remove(Integer id) {
        System.out.println(String.format("DELETE/id - Receiving the id: %d to remove a user", id));
        System.out.println(id);
    }

    public List<User> listAll(){
        System.out.println("LIST - Listing the system's users");
        List<User> users = new ArrayList<>();
        users.add(new User("joel","1234"));
        users.add(new User("heanna","4321"));
        return users;
    }

    public User finById(Integer id) {
        System.out.println(String.format("FIND/id - Receiving the id: %d to locate a user", id));
        return new User("heanna", "password");
    }
}
