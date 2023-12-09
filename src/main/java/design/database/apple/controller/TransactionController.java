package design.database.apple.controller;

import design.database.apple.service.AccountService;
import design.database.apple.service.TransactionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@Slf4j
@RequiredArgsConstructor
@Controller
public class TransactionController {

    private final TransactionService transactionService;
    private final AccountService accountService;

    @GetMapping("/transaction")
    public String getTransaction(Model model) {
        return "transaction/transactionMain";
    }

    @GetMapping("/transaction/deposit")
    public String getDeposit(Model model) {
        return "/transaction/deposit";
    }

    @PostMapping("/transaction/deposit")
    public String depositProcess(Model model) {
//        if 입금 성공시 입금 성공 페이지
//        입금 실패시 입금 실패 페이지
        return "transaction/transactionMain";
    }

    @GetMapping("/transaction/withdrawal")
    public String getWithdrawal(Model model) {
        return "/transaction/withdrawal";
    }

    @PostMapping("/transaction/withdrawal")
    public String withdrawalProcess(Model model) {
//        if 출금 성공시 출금 성공 페이지
//        출금 실패시 출금 실패 페이지
        return "transaction/transactionMain";
    }

    @GetMapping("/transaction/transfer/{id}")
    public String getTransfer(@PathVariable("id") String id,Model model) {
        HashMap<String, String> account = accountService.getCurrentAccount(id);
        model.addAttribute("account", account);

        return "/transaction/transfer";
    }


    @GetMapping("/get-transferred/{balance}/{firstAccount}/{secondAccount}/{amount}")
    @ResponseBody
    public String getTransfer(@PathVariable("balance") Integer balance,
                                @PathVariable("firstAccount") String firstAccount,
                              @PathVariable("secondAccount") String secondAccount,
                              @PathVariable("amount") Integer amount,
                              Model model) {
        HashMap<String, Object> data = new HashMap<>();
        Integer calculatedAmount = balance - amount;
        data.put("balance",calculatedAmount);
        data.put("accountNumber",firstAccount);

        accountService.updateBalanceByAccountNumber(data);

        HashMap<String, String> account = accountService.getCurrentAccount(secondAccount);
        HashMap<String, Object> data2 = new HashMap<>();
        String.valueOf(account.get("balance"));
        String stringBalance = String.valueOf(account.get("balance"));
        Integer calculatedAmount2 = Integer.parseInt(stringBalance) + amount;
        data2.put("balance",calculatedAmount2);
        data2.put("accountNumber",secondAccount);

        accountService.updateBalanceByAccountNumber(data2);

        return "GOOD";
    }

    @PostMapping("/transaction/transfer")
    public String transferProcess(Model model) {
        return "transaction/transactionMain";
    }

    @GetMapping("/transaction/automaticTransfer")
    public String getAutomaticTransfer(Model model) {
        return "transaction/automaticTransfer";
    }

    @GetMapping("/transaction/automaticTransferAdd")
    public String automaticTransferAdd(Model model) {
        return "transaction/automaticTransferAdd";
    }

    @PostMapping("/transaction/automaticTransferAdd")
    public String automaticTransferAddProcess(Model model) {
//        if 송금등록 성공시 송금 성공 페이지
//        송금등록 실패시 송금 실패 페이지
        return "transaction/transactionMain";
    }

    @GetMapping("/transaction/automaticTransferEdit/{automaticTransferID}")
    public String automaticTransferEdit(@PathVariable Long automaticTransferID, Model model) {
//        model.addAttribute();
//        return "transaction/automaticTransferEdit";
        return "transaction/transactionMain";
    }

    @GetMapping("/get-name/{id}")
    @ResponseBody
    public String handleAsyncRequest(@PathVariable("id") String id) {
        return accountService.getNameByAccountNumber(id);
    }


}
