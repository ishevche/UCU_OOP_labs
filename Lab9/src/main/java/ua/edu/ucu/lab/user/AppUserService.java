package ua.edu.ucu.lab.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {

    private final AppUserRepository userRepository;

    @Autowired
    public AppUserService(AppUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }

    public void newUser(AppUser user) {
        if (userRepository.findUserByEmail(user.getEmail()).isEmpty()) {
            userRepository.save(user);
        }
    }
}
