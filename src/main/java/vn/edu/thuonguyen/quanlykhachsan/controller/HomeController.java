package vn.edu.thuonguyen.quanlykhachsan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class HomeController {

    @Value("${app.environment}") // Inject giá trị của thuộc tính app.environment
    private String environment;

    @GetMapping("/title")
    public String home() {
        return "Welcome to Quan Ly Khach San API! Running in " + environment + " environment.";
    }

    @GetMapping("/env") // Thêm một endpoint để kiểm tra riêng
    public String getEnvironment() {
        return "Current environment: " + environment;
    }
}