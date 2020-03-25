package nl.utrecht.hu.opdracht.rest;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ServiceController {

    @GetMapping("/current-date")
    public Map<String, String> currentDate() {
        HashMap<String, String> response = new HashMap<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        response.put("response", dtf.format(now));
        return response;
    }

    @PostMapping("/welcome")
    public Map<String, String> welcome(@RequestBody String name) {
        HashMap<String, String> response = new HashMap<>();
        response.put("response", "Welcome "+name);
        return response;
    }

}
