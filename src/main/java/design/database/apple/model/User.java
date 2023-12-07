package design.database.apple.model;

import lombok.Getter;

import java.sql.Date;
import java.sql.Timestamp;

public class User {
    @Getter
    private Integer user_id;
    @Getter
    private String username;
    @Getter
    private String password;
    private Date birthday;
    private String gender;
    private String phone_number;
    @Getter
    private String id; // 로그인 아이디
    @Getter
    private String email;
    private Integer address_id;
    private Integer role_id;
    private Integer credit_score;
    private Timestamp created_at;
    private Timestamp updated_at;
    private String dummy;

}
