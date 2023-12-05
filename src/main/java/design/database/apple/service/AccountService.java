//package design.database.apple.service;
//
//import design.database.apple.mapper.AccountMapper;
//import design.database.apple.mapper.ProductMapper;
//import design.database.apple.mapper.UserMapper;
//import design.database.apple.model.User;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.HashMap;
//import java.util.List;
//
//@Slf4j
//@RequiredArgsConstructor
//@Service
//public class AccountService {
//
//    private final AccountMapper accountMapper;
//
//    public List<HashMap<String, String>> getInstallmentAccountList() {
//        List<HashMap<String, String>> fixedDepositProductList = accountMapper.getFixedDepositProductList();
//        return fixedDepositProductList;
//    }
//
//    public List<HashMap<String, String>> getDepositProductList() {
//        List<HashMap<String, String>> depositProductList = accountMapper.getDepositProductList();
//        return depositProductList;
//    }
//
//    public List<HashMap<String, String>> getCheckingAccountProductList() {
//        List<HashMap<String, String>> checkingAccountProductList = accountMapper.getCheckingAccountProductList();
//        return checkingAccountProductList;
//    }
//
//    public List<HashMap<String, String>> getLoanProductList() {
//        List<HashMap<String, String>> loanProductList = accountMapper.getLoanProductList();
//        return loanProductList;
//    }
//
//    public List<HashMap<String, String>> getCardProductList() {
//        List<HashMap<String, String>> cardProductList = accountMapper.getCardProductList();
//        return cardProductList;
//    }
//
//}