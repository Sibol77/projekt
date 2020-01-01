package ii.uph.edu.services;

import ii.uph.edu.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
// Własne metody
    void save(User user);

    boolean isUniqueLogin(String login);
}
