package se.agilecourse.services;

import org.springframework.stereotype.Service;
import se.agilecourse.model.User;
import java.util.List;

@Service
public interface UserServices {

    public User findByUserName(String username);
    public User findByEmailAddress(String emailAddress);
    public List<User> findByRole(String role);
    public List<User> findAllUsers();
    public User saveAdminUser(User user);
}
