package sq_ch11_ex1.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import sq_ch11_ex1.dto.Payment;
import sq_ch11_ex1.proxy.PaymentsProxy;

@RestController
@AllArgsConstructor
public class PaymentsController {
	
	private final PaymentsProxy proxy;
	
	@PostMapping("/payment")
	public Payment processPayment(@RequestBody Payment payment) {
		String requestId = UUID.randomUUID().toString();
		return proxy.createPayment(requestId, payment);
	}

}
