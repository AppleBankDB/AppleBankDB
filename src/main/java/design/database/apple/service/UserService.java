package design.database.apple.service;

import design.database.apple.mapper.UserMapper;
import design.database.apple.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.regex.Pattern;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserMapper userMapper;

    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }


    @Transactional
    public void saveUser(User user) {
        validateUser(user); // 유효성 검사 수행

        userMapper.saveUser(user);
        log.info("User saved: {}", user);
    }

    public boolean validateLoginCredentials(String id, String password) {
        validateIdAndPassword(id, password);

        // 사용자의 존재 여부 및 비밀번호 검증
        User storedUser = userMapper.getUserById(Integer.valueOf(id));

        // 사용자가 존재하고 비밀번호가 일치하는지 확인
        return storedUser != null && storedUser.getPassword().equals(password);
    }

    private void validateUser(User user) {
        validateUsername(user.getUsername());
        validateEmail(user.getEmail());
        validatePassword(user.getPassword());
    }

    private void validateIdAndPassword(String id, String password) {
        if (StringUtils.isEmpty(id)) {
            throw new IllegalArgumentException("아이디는 공백이 올 수 없습니다.");
        }

        if (StringUtils.isEmpty(password)) {
            throw new IllegalArgumentException("비밀번호는 공백이 올 수 없습니다.");
        }
    }

    private void validateUsername(String username) {
        if (StringUtils.isEmpty(username)) {
            throw new IllegalArgumentException("이름은 공백이 올 수 없습니다.");
        }

    }

    private void validateEmail(String email) {
        if (StringUtils.isEmpty(email)) {
            throw new IllegalArgumentException("이메일은 공백이 올 수 없습니다.");
        }

        // 이메일 형식 확인
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,6}$";
        if (!Pattern.matches(emailRegex, email)) {
            throw new IllegalArgumentException("잘못된 형식 입니다.");
        }
    }

    private void validatePassword(String password) {
        if (StringUtils.isEmpty(password)) {
            throw new IllegalArgumentException("비밀번호는 공백이 올 수 없습니다.");
        }

        // 비밀번호 길이 확인
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }
    }
}