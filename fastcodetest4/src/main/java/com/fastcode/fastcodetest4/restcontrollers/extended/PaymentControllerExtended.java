package com.fastcode.fastcodetest4.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.fastcodetest4.restcontrollers.core.PaymentController;
import com.fastcode.fastcodetest4.application.extended.payment.IPaymentAppServiceExtended;
import com.fastcode.fastcodetest4.application.extended.customer.ICustomerAppServiceExtended;
import com.fastcode.fastcodetest4.application.extended.rental.IRentalAppServiceExtended;
import com.fastcode.fastcodetest4.application.extended.staff.IStaffAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.fastcodetest4.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/payment/extended")
public class PaymentControllerExtended extends PaymentController {

		public PaymentControllerExtended(IPaymentAppServiceExtended paymentAppServiceExtended, ICustomerAppServiceExtended customerAppServiceExtended, IRentalAppServiceExtended rentalAppServiceExtended, IStaffAppServiceExtended staffAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		paymentAppServiceExtended,
    	customerAppServiceExtended,
    	rentalAppServiceExtended,
    	staffAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

