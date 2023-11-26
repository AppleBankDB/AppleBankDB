package design.database.apple.service;

import design.database.apple.mapper.UserMapper;
import design.database.apple.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserMapper userMapper;

    public User getUserById(Integer id) {
        User user = userMapper.getUserById(id);
        return user;
    }

}
