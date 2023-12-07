package design.database.apple.service;

import design.database.apple.mapper.ManageMapper;
import design.database.apple.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class ManageService {

    private final ManageMapper manageMapper;

    public List<HashMap<String, String>> getUserList() {
        List<HashMap<String, String>> userList = manageMapper.getUserList();
        return userList;
    }


}
