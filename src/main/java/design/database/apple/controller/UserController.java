package design.database.apple.controller;

import design.database.apple.model.User;
import design.database.apple.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    @GetMapping("/main")
    public String example(Model model) {
        User user = userService.getUserById(1);
        model.addAttribute("user", user);
        return "main";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute("user") User user, Model model) {
        if (userService.validateLoginCredentials(user.getId(), user.getPassword())) {
            return "redirect:/main";
        } else {
            model.addAttribute("error", "로그인에 실패했습니다. 아이디나 비밀번호를 확인해주세요.");
            return "login";
        }
    }
}