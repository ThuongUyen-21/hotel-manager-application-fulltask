package vn.edu.thuonguyen.quanlykhachsan.service;

import org.springframework.stereotype.Service;

@Service // Đánh dấu đây là một Spring Service component
public class UserService {

    // Đây là nơi bạn sẽ viết business logic liên quan đến người dùng
    // Ví dụ:
    public String getWelcomeMessage() {
        return "Welcome from User Service!";
    }

    // Các phương thức khác như registerUser, findUserById, v.v. sẽ được thêm vào
    // đây sau.
}
