package design.database.apple.service;

import design.database.apple.mapper.ProductMapper;
import design.database.apple.mapper.TransactionMapper;
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
public class TransactionService {

    private final TransactionMapper transactionMapper;



}
