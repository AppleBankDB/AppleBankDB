package design.database.apple.controller;

import design.database.apple.model.User;
import design.database.apple.service.AccountService;
import design.database.apple.service.UserService;
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

public class AccountController {
    private final AccountService accountService;

    @GetMapping("/account-category")
    public String getAccountCategory(Model model) {
        return "account/accountCategory";
    }

    @GetMapping("/installment-account-list")
    public String getInstallmentAccountList(Model model) {
        List<HashMap<String, String>> installmentAccount = accountService.getInstallmentAccount();
        model.addAttribute("userInstallmentAccountList", installmentAccount);
        return "account/installmentAccount";
    }

    @GetMapping("/saving-account-list")
    public String getSavingAccountList(Model model) {
        List<HashMap<String, String>> savingAccount = accountService.getSavingAccount();
        model.addAttribute("savingAccountList", savingAccount);
        return "account/savingAccount";
    }

    @GetMapping("/checking-account-list")
    public String getCheckingAccountList(Model model) {
        List<HashMap<String, String>> checkingAccount = accountService.getCheckingAccount();
        model.addAttribute("checkingAccountList", checkingAccount);
        return "account/checkingAccount";
    }

    @GetMapping("/loan-account-list/{id}")
    public String getLoanAccountList(@PathVariable("id") Integer id, Model model) {
        List<HashMap<String, String>> loanAccount = accountService.getLoanAccount(id);
        model.addAttribute("loanAccountList", loanAccount);
        return "account/loanAccount";
    }

    @GetMapping("/card-list")
    public String getCardAccountList(Model model) {
//        List<HashMap<String, String>> cardList = accountService.getCardList();
//        model.addAttribute("cardList", cardList);
        return "account/cardList";
    }

}
