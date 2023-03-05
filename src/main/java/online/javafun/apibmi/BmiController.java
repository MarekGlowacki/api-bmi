package online.javafun.apibmi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BmiController {

    @GetMapping("/bmi")
    Bmi calculateBmi(@RequestParam Double weight,
                     @RequestParam Double height) {
        return new Bmi(weight, height);
    }
}
