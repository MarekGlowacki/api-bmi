package online.javafun.apibmi;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BmiController {

    @GetMapping(value = "/bmi", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE})
    ResponseEntity<?> calculateBmi(@RequestParam Double weight,
                                   @RequestParam Double height,
                                   @RequestHeader("Accept") String acceptedMediaType) {

        if (acceptedMediaType.equals(MediaType.APPLICATION_JSON_VALUE)) {
            return ResponseEntity.ok(new Bmi(weight, height));
        } else if (acceptedMediaType.equals(MediaType.TEXT_PLAIN_VALUE)) {
            return ResponseEntity.ok("123");
        }
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
    }
}
