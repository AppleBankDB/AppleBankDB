package design.database.apple.controller;

import design.database.apple.service.TransactionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RequiredArgsConstructor
@Controller
public class TransactionController {

    private final TransactionService transactionService;

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

    @GetMapping("/transaction/transfer")
    public String getTransfer(Model model) {
        return "/transaction/transfer";
    }

    @PostMapping("/transaction/transfer")
    public String transferProcess(Model model) {
//        if 송금 성공시 송금 성공 페이지
//        송금 실패시 송금 실패 페이지
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




}
