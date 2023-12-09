package design.database.apple.mapper;

import java.util.HashMap;
import java.util.List;

public interface ManageMapper {

    List<HashMap<String, String>> getUserList();
    List<HashMap<String, String>> getProductList();
    List<HashMap<String, String>> getAllProductList();

    void deleteProductById(Integer id);

    void deleteLoanProductById(Integer id);
}
