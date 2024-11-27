package ie.atu.processpayment;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/payment")
@RestController
public class PaymentController {
    @PostMapping
    private String makePayment(@RequestBody Person person){
        return "Got person details " + person;
    }
}
