package com.fastcode.fastcodetest4.application.extended.staff;

import org.springframework.stereotype.Service;
import com.fastcode.fastcodetest4.application.core.staff.StaffAppService;

import com.fastcode.fastcodetest4.domain.extended.staff.IStaffRepositoryExtended;
import com.fastcode.fastcodetest4.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.fastcodetest4.commons.logging.LoggingHelper;

@Service("staffAppServiceExtended")
public class StaffAppServiceExtended extends StaffAppService implements IStaffAppServiceExtended {

	public StaffAppServiceExtended(IStaffRepositoryExtended staffRepositoryExtended,
				IAddressRepositoryExtended addressRepositoryExtended,IStaffMapperExtended mapper,LoggingHelper logHelper) {

		super(staffRepositoryExtended,
		addressRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

