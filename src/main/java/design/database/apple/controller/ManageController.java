package design.database.apple.controller;

import design.database.apple.service.ManageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
public class ManageController {

    private final ManageService manageService;

    @GetMapping("/user-list-manager")
    public String getManageCategory(Model model) {
        List<HashMap<String, String>> userList = manageService.getUserList();
        model.addAttribute("userList", userList);
        return "Manage/userListManager";
    }
}
