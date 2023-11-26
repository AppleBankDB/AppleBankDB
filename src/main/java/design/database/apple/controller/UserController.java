package design.database.apple.controller;

import design.database.apple.model.User;
import design.database.apple.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}