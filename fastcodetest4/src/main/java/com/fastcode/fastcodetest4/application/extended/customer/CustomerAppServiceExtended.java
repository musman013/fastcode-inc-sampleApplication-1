package com.fastcode.fastcodetest4.application.extended.customer;

import org.springframework.stereotype.Service;
import com.fastcode.fastcodetest4.application.core.customer.CustomerAppService;

import com.fastcode.fastcodetest4.domain.extended.customer.ICustomerRepositoryExtended;
import com.fastcode.fastcodetest4.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.fastcodetest4.commons.logging.LoggingHelper;

@Service("customerAppServiceExtended")
public class CustomerAppServiceExtended extends CustomerAppService implements ICustomerAppServiceExtended {

	public CustomerAppServiceExtended(ICustomerRepositoryExtended customerRepositoryExtended,
				IAddressRepositoryExtended addressRepositoryExtended,ICustomerMapperExtended mapper,LoggingHelper logHelper) {

		super(customerRepositoryExtended,
		addressRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

