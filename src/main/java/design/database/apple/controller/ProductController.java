package design.database.apple.controller;

import design.database.apple.model.Account;
import design.database.apple.service.AccountService;
import design.database.apple.service.ProductService;
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
public class ProductController {

    private final ProductService productService;
    private final AccountService accountService;

    @GetMapping("/product-category")
    public String getProductCategory(Model model) {
        model.addAttribute("title", "상품 찾기");
        return "product/productCategory";
    }

    @GetMapping("/fixed-deposit-product-list")
    public String getFixedDepositProductList(Model model) {
        List<HashMap<String, String>> fixedDepositProductList = productService.getFixedDepositProductList();
        model.addAttribute("fixedDepositProductList", fixedDepositProductList);
        model.addAttribute("title", "적금 상품");
        return "product/fixedDepositProductList";
    }

    @GetMapping("/deposit-product-list")
    public String getDepositProductList(Model model) {
        List<HashMap<String, String>> depositProductList = productService.getDepositProductList();
        model.addAttribute("depositProductList", depositProductList);
        model.addAttribute("title", "예금 상품");
        return "product/depositProductList";
    }

    @GetMapping("/checking-account-product-list")
    public String getCheckingAccountProductList(Model model) {
        List<HashMap<String, String>> checkingAccountProductList = productService.getCheckingAccountProductList();
        model.addAttribute("checkingAccountProductList", checkingAccountProductList);
        model.addAttribute("title", "입출금 상품");
        return "product/checkingAccountProductList";
    }

    @GetMapping("/loan-product-list")
    public String getLoanProductList(Model model) {
        List<HashMap<String, String>> loanProductList = productService.getLoanProductList();
        model.addAttribute("loanProductList", loanProductList);
        model.addAttribute("title", "대출 상품");
        return "product/loanProductList";
    }

    @GetMapping("/card-product-list")
    public String getCardProductList(Model model) {
        List<HashMap<String, String>> cardProductList = productService.getCardProductList();
        model.addAttribute("cardProductList", cardProductList);
        model.addAttribute("title", "카드 상품");
        return "product/cardProductList";
    }

    @GetMapping("/fixed-deposit-product/{id}")
    public String applyFixedDepositProduct(@PathVariable Integer id, Model model) {
        HashMap<String, String> fixedDepositProduct = productService.getFixedDepositProductById(id);
        model.addAttribute("fixedDepositProduct", fixedDepositProduct);
        model.addAttribute("title", "적금 상품 신청하기");
        return "product/apply/fixedDepositProduct";
    }

    @GetMapping("/loan-product/{id}")
    public String applyLoanProduct(@PathVariable("id") Integer id, Model model) {
        System.out.println(id);
        HashMap<String, String> loanProduct = productService.getLoanProductById(id);
        List<HashMap<String, String>> termsOfService = productService.getTermsOfServiceById(id);
        List<HashMap<String, String>> productFeature = productService.getProductFeatureById(id);
        model.addAttribute("loanProduct", loanProduct);
        model.addAttribute("termsOfService", termsOfService);
        model.addAttribute("productFeature", productFeature);
        model.addAttribute("title", "대출 상품 신청하기");
        return "product/apply/loanProduct";
    }

    @GetMapping("/complete")
    public String complete(Model model) {
        model.addAttribute("title", "상품 신청 완료");
        Account account = accountService.insertAccount();
        accountService.insertLoan(account.getAccount_id());
        return "product/apply/complete";
    }
}
