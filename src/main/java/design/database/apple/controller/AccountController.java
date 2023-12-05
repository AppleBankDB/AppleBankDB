//package design.database.apple.controller;
//
//import design.database.apple.service.ProductService;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.HashMap;
//import java.util.List;
//
//public class AccountController {
//    private final AccountService accountService;
//
//    @GetMapping("/account-category")
//    public String getProductCategory(Model model) {
//        return "account/accountCategory";
//    }
//
//    @GetMapping("/installment-account-list")
//    public String getFixedDepositProductList(Model model) {
//        List<HashMap<String, String>> fixedDepositProductList = accountService.getFixedDepositProductList();
//        model.addAttribute("fixedDepositProductList", fixedDepositProductList);
//        return "account/installmentAccountList";
//    }
//
//    @GetMapping("/deposit-product-list")
//    public String getDepositProductList(Model model) {
//        List<HashMap<String, String>> depositProductList = productService.getDepositProductList();
//        model.addAttribute("depositProductList", depositProductList);
//        return "product/depositProductList";
//    }
//
//    @GetMapping("/checking-account-product-list")
//    public String getCheckingAccountProductList(Model model) {
//        List<HashMap<String, String>> checkingAccountProductList = productService.getCheckingAccountProductList();
//        model.addAttribute("checkingAccountProductList", checkingAccountProductList);
//        return "product/checkingAccountProductList";
//    }
//
//    @GetMapping("/loan-product-list")
//    public String getLoanProductList(Model model) {
//        List<HashMap<String, String>> loanProductList = productService.getLoanProductList();
//        model.addAttribute("loanProductList", loanProductList);
//        return "product/loanProductList";
//    }
//
//    @GetMapping("/card-product-list")
//    public String getCardProductList(Model model) {
//        List<HashMap<String, String>> cardProductList = productService.getCardProductList();
//        model.addAttribute("cardProductList", cardProductList);
//        return "product/cardProductList";
//    }
//}
