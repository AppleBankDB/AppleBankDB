package design.database.apple.controller;

import design.database.apple.service.ManageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
    public String getUserProductList(Model model) {
        List<HashMap<String, String>> productList = manageService.getProductList();
        model.addAttribute("productList", productList);
        return "Manage/productListManager";
    }

    @GetMapping("/product-deletion")
    public String getProductList(Model model) {
        List<HashMap<String, String>> productList = manageService.getAllProductList();
        model.addAttribute("productList", productList);
        return "Manage/productDeletion";
    }

    @GetMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable("id") Integer id, Model model) {
        manageService.deleteProductById(id);
        manageService.deleteLoanProductById(id);
        return "redirect:/product-deletion";
    }
}
