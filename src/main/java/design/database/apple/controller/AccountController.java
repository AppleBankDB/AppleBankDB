package design.database.apple.controller;

import design.database.apple.model.User;
import design.database.apple.service.AccountService;
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

public class AccountController {
    private final AccountService accountService;

    @GetMapping("/account-category")
    public String getProductCategory(Model model) {
        return "account/accountCategory";
    }

    @GetMapping("/installment-account-list")
    public String getFixedDepositProductList(Model model) {
        List<HashMap<String, String>> installmentAccount = accountService.getInstallmentAccount();
        model.addAttribute("userInstallmentAccountList", installmentAccount);
        return "account/installmentAccount";
    }

    @GetMapping("/saving-account-list")
    public String getDepositProductList(Model model) {
        List<HashMap<String, String>> savingAccount = accountService.getSavingAccount();
        model.addAttribute("depositProductList", savingAccount);
        return "account/savingAccountList";
    }

    @GetMapping("/checking-account-list")
    public String getCheckingAccountProductList(Model model) {
        List<HashMap<String, String>> checkingAccount = accountService.getCheckingAccount();
        model.addAttribute("checkingAccountProductList", checkingAccount);
        return "account/checkingAccountList";
    }

    @GetMapping("/loan-account-list")
    public String getLoanProductList(Model model) {
        List<HashMap<String, String>> loanAccount = accountService.getLoanAccount();
        model.addAttribute("loanProductList", loanAccount);
        return "account/loanAccountList";
    }

    @GetMapping("/card-list")
    public String getCardProductList(Model model) {
        List<HashMap<String, String>> cardList = accountService.getCardList();
        model.addAttribute("cardList", cardList);
        return "account/cardList";
    }
}
