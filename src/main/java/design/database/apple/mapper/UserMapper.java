package design.database.apple.mapper;

import design.database.apple.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getUserById(Integer id);

    // 사용자 저장을 위한 메서드
    void saveUser(User user);

    // 사용자 확인을 위한 메서드
    boolean checkUserExistenceById(Integer id);
}
