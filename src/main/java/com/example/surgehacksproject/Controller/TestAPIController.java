package com.example.surgehacksproject.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import  com.example.surgehacksproject.server;



@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/hello")
public class TestAPIController {

    @Autowired
    private server;

    @GetMapping("/search")
    public ResponseEntity<String> searchFood(@RequestParam String query) {
        return ResponseEntity.ok(server.searchFood(query));
    }


    

}
