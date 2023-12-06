package design.database.apple.mapper;

import java.util.HashMap;
import java.util.List;

public interface AccountMapper {

    List<HashMap<String, String>> getInstallmentAccount();
    List<HashMap<String, String>> getSavingAccount();
    List<HashMap<String, String>> getCheckingAccount();
    List<HashMap<String, String>> getLoanAccount();
    List<HashMap<String, String>> getCardList();
}
