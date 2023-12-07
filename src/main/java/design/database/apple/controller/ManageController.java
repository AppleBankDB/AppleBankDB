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

    @GetMapping("/manager-category")
    public String getManagerCategory(Model model) {
        return "Manage/managerCategory";
    }

    @GetMapping("/user-list-manager")
    public String getUserList(Model model) {
        List<HashMap<String, String>> userList = manageService.getUserList();
        model.addAttribute("userList", userList);
        return "Manage/userListManager";
    }

    @GetMapping("/product-list-manager")
    public String getProductList(Model model) {
        List<HashMap<String, String>> productList = manageService.getProductList();
        model.addAttribute("productList", productList);
        return "Manage/productListManager";
    }
}
