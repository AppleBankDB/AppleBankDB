package design.database.apple.mapper;

import design.database.apple.model.Account;

import java.util.HashMap;
import java.util.List;

public interface AccountMapper {

    List<HashMap<String, String>> getInstallmentAccount();
    List<HashMap<String, String>> getSavingAccount();
    List<HashMap<String, String>> getCheckingAccount();
    List<HashMap<String, String>> getLoanAccount(Integer id);

    //미구짐
    List<HashMap<String, String>> getCardList();

    Integer insertAccount(Account account);

    void insertLoan(Integer id);

    String getNameByAccountNumber(String accountNumber);

    HashMap<String, String> getCurrentAccount(String id);

    void updateBalanceByAccountNumber(HashMap<String, Object> data);
}
