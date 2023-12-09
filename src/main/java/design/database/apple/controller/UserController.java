package design.database.apple.controller;

import design.database.apple.model.User;
import design.database.apple.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    @GetMapping("/main")
    public String home(Model model) {
        User user = userService.getUserById(1);
        model.addAttribute("user", user);
        return "/main";
    }
    @GetMapping("/accountCheck")
    @ResponseBody
    public ResponseEntity<String> userCheck(@RequestParam(value = "id") String id, @RequestParam(value = "pw") int pw, Model model) {
        String checkingId = "chicken";
        int checkingPw = 1234;

        if (checkingId.equals(id) && checkingPw == pw) {
            return ResponseEntity.ok("correct");
        } else {
            return ResponseEntity.ok("incorrect");
        }
    }


}