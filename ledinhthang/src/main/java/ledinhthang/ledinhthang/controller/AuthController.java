package ledinhthang.ledinhthang.controller;

import ledinhthang.ledinhthang.entity.User;
import ledinhthang.ledinhthang.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User registered successfully";
    }

    @GetMapping("/login")
    public String login() {
        return "Authenticated successfully!";
    }

    @PostMapping("/logout")
    public String logout() {
        // Với JWT, logout chỉ là phía client tự xóa token
        return "Logout successfully (token should be deleted client-side)";
    }

}