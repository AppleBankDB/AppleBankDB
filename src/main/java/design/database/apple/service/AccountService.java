package design.database.apple.service;

import design.database.apple.mapper.AccountMapper;
import design.database.apple.mapper.ProductMapper;
import design.database.apple.mapper.UserMapper;
import design.database.apple.model.Account;
import design.database.apple.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class AccountService {

    private final AccountMapper accountMapper;

    public List<HashMap<String, String>> getInstallmentAccount() {
        List<HashMap<String, String>> installmentAccount = accountMapper.getInstallmentAccount();
        return installmentAccount;
    }

    public List<HashMap<String, String>> getSavingAccount() {
        List<HashMap<String, String>> savingAccount = accountMapper.getSavingAccount();
        return savingAccount;
    }

    public List<HashMap<String, String>> getCheckingAccount() {
        List<HashMap<String, String>> checkingAccount = accountMapper.getCheckingAccount();
        return checkingAccount;
    }

    public List<HashMap<String, String>> getLoanAccount(Integer id) {
        List<HashMap<String, String>> loanAccount = accountMapper.getLoanAccount(id);
        return loanAccount;
    }

    public Account insertAccount(){
        Account account = new Account();
        accountMapper.insertAccount(account);
        return account;
    }

    public String getNameByAccountNumber(String accountNumber) {
        String name = accountMapper.getNameByAccountNumber(accountNumber);
        return name;
    }

    public HashMap<String, String> getCurrentAccount(String id){
        HashMap<String, String> account = accountMapper.getCurrentAccount(id);
        return account;
    }

    public void insertLoan(Integer id){
        accountMapper.insertLoan(id);
    }

    //미구현///////////////////////////////////////////
//    public List<HashMap<String, String>> getCardList() {
//        List<HashMap<String, String>> cardList = accountMapper.getCardList();
//        return cardList;
//    }

    public void updateBalanceByAccountNumber(HashMap<String, Object> data){
        accountMapper.updateBalanceByAccountNumber(data);
    }
}