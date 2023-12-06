package design.database.apple.controller;

import design.database.apple.model.User;
import design.database.apple.service.ProductService;
import design.database.apple.service.UserService;
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
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product-category")
    public String getProductCategory(Model model) {
        return "product/productCategory";
    }

    @GetMapping("/fixed-deposit-product-list")
    public String getFixedDepositProductList(Model model) {
        List<HashMap<String, String>> fixedDepositProductList = productService.getFixedDepositProductList();
        model.addAttribute("fixedDepositProductList", fixedDepositProductList);
        return "product/fixedDepositProductList";
    }

    @GetMapping("/deposit-product-list")
    public String getDepositProductList(Model model) {
        List<HashMap<String, String>> depositProductList = productService.getDepositProductList();
        model.addAttribute("depositProductList", depositProductList);
        return "product/depositProductList";
    }

    @GetMapping("/checking-account-product-list")
    public String getCheckingAccountProductList(Model model) {
        List<HashMap<String, String>> checkingAccountProductList = productService.getCheckingAccountProductList();
        model.addAttribute("checkingAccountProductList", checkingAccountProductList);
        return "product/checkingAccountProductList";
    }

    @GetMapping("/loan-product-list")
    public String getLoanProductList(Model model) {
        List<HashMap<String, String>> loanProductList = productService.getLoanProductList();
        model.addAttribute("loanProductList", loanProductList);
        return "product/loanProductList";
    }

    @GetMapping("/card-product-list")
    public String getCardProductList(Model model) {
        List<HashMap<String, String>> cardProductList = productService.getCardProductList();
        model.addAttribute("cardProductList", cardProductList);
        return "product/cardProductList";
    }

}
