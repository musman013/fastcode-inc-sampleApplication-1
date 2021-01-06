package com.fastcode.fastcodetest4.application.extended.store;

import org.springframework.stereotype.Service;
import com.fastcode.fastcodetest4.application.core.store.StoreAppService;

import com.fastcode.fastcodetest4.domain.extended.store.IStoreRepositoryExtended;
import com.fastcode.fastcodetest4.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.fastcodetest4.domain.extended.staff.IStaffRepositoryExtended;
import com.fastcode.fastcodetest4.commons.logging.LoggingHelper;

@Service("storeAppServiceExtended")
public class StoreAppServiceExtended extends StoreAppService implements IStoreAppServiceExtended {

	public StoreAppServiceExtended(IStoreRepositoryExtended storeRepositoryExtended,
				IAddressRepositoryExtended addressRepositoryExtended,IStaffRepositoryExtended staffRepositoryExtended,IStoreMapperExtended mapper,LoggingHelper logHelper) {

		super(storeRepositoryExtended,
		addressRepositoryExtended,staffRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

