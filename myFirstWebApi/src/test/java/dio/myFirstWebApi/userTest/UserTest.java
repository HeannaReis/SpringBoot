package dio.myFirstWebApi.userTest;

import dio.myFirstWebApi.model.User;
import dio.myFirstWebApi.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testConstructor() {
        User user = new User("joel", "1234");
        Assertions.assertEquals("joell", user.getLogin());
        Assertions.assertEquals("1234", user.getPassword());
    }

    @Test
    public void testRemove() {
        UserRepository repository = new UserRepository();
        Integer id = 1234;
        repository.remove(id);
        // Verificar se o id foi impresso no console
        // Se estiver usando uma IDE como o IntelliJ, o console pode ser acessado na guia "Run" na parte inferior da tela
    }
}