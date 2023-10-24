package sq_ch11_ex1.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import sq_ch11_ex1.dto.Payment;

@FeignClient(name = "payments",
						url = "${name.service.url}")
public interface PaymentsProxy {
	@PostMapping("/payment")
	Payment createPayment(
			@RequestHeader String requestId,
			@RequestBody Payment payment);
}
