package com.example.surgehacksproject.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import  com.example.surgehacksproject.Server;


@CrossOrigin(origins = "http://localhost:8080")
@Controller
@RequestMapping("/hello")
public class TestAPIController {

    @Autowired
    private Server server ;

    @GetMapping("/hello/list")
    public ResponseEntity<String> createFood(@RequestBody String foodJson) {
        return ResponseEntity.ok(server.getFood());
    }

    @GetMapping("/search")
    public ResponseEntity<String> searchFood(@RequestParam String foodName) {
        return ResponseEntity.ok(server.searchFood(foodName));
    }

}
