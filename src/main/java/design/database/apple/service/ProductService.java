package design.database.apple.service;

import design.database.apple.mapper.ProductMapper;
import design.database.apple.mapper.UserMapper;
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
public class ProductService {

    private final ProductMapper productMapper;

    public List<HashMap<String, String>> getFixedDepositProductList() {
        List<HashMap<String, String>> fixedDepositProductList = productMapper.getFixedDepositProductList();
        return fixedDepositProductList;
    }

    public List<HashMap<String, String>> getDepositProductList() {
        List<HashMap<String, String>> depositProductList = productMapper.getDepositProductList();
        return depositProductList;
    }

    public List<HashMap<String, String>> getCheckingAccountProductList() {
        List<HashMap<String, String>> checkingAccountProductList = productMapper.getCheckingAccountProductList();
        return checkingAccountProductList;
    }

    public List<HashMap<String, String>> getLoanProductList() {
        List<HashMap<String, String>> loanProductList = productMapper.getLoanProductList();
        return loanProductList;
    }

    public List<HashMap<String, String>> getCardProductList() {
        List<HashMap<String, String>> cardProductList = productMapper.getCardProductList();
        return cardProductList;
    }

    public HashMap<String, String> getFixedDepositProductById(Integer id) {
        HashMap<String, String> fixedDepositProduct = productMapper.getFixedDepositProductById(id);
        return fixedDepositProduct;
    }

}
