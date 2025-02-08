package kg.nurtelecom.rpc.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RPCController {
    @GetMapping
    public void get() {
        System.out.println("GET");
    }

    @PostMapping
    public void post() {
        System.out.println("POST");
    }

    @PutMapping
    public void update() {
        System.out.println("PUT");
    }

    @DeleteMapping
    public void delete() {
        System.out.println("DELETE");
    }
}
