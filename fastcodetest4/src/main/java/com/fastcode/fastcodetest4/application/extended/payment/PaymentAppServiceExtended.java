package com.fastcode.fastcodetest4.application.extended.payment;

import org.springframework.stereotype.Service;
import com.fastcode.fastcodetest4.application.core.payment.PaymentAppService;

import com.fastcode.fastcodetest4.domain.extended.payment.IPaymentRepositoryExtended;
import com.fastcode.fastcodetest4.domain.extended.customer.ICustomerRepositoryExtended;
import com.fastcode.fastcodetest4.domain.extended.rental.IRentalRepositoryExtended;
import com.fastcode.fastcodetest4.domain.extended.staff.IStaffRepositoryExtended;
import com.fastcode.fastcodetest4.commons.logging.LoggingHelper;

@Service("paymentAppServiceExtended")
public class PaymentAppServiceExtended extends PaymentAppService implements IPaymentAppServiceExtended {

	public PaymentAppServiceExtended(IPaymentRepositoryExtended paymentRepositoryExtended,
				ICustomerRepositoryExtended customerRepositoryExtended,IRentalRepositoryExtended rentalRepositoryExtended,IStaffRepositoryExtended staffRepositoryExtended,IPaymentMapperExtended mapper,LoggingHelper logHelper) {

		super(paymentRepositoryExtended,
		customerRepositoryExtended,rentalRepositoryExtended,staffRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

