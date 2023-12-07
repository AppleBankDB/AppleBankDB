package design.database.apple.mapper;

import design.database.apple.model.User;

import java.util.HashMap;
import java.util.List;

public interface ProductMapper {

    List<HashMap<String, String>> getFixedDepositProductList();
    List<HashMap<String, String>> getDepositProductList();
    List<HashMap<String, String>> getCheckingAccountProductList();
    List<HashMap<String, String>> getLoanProductList();
    List<HashMap<String, String>> getCardProductList();
    HashMap<String, String> getFixedDepositProductById(Integer id);
}
