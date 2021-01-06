package com.fastcode.fastcodetest4.application.extended.authorization.user;

import org.springframework.stereotype.Service;
import com.fastcode.fastcodetest4.application.core.authorization.user.UserAppService;

import com.fastcode.fastcodetest4.domain.extended.authorization.user.IUserRepositoryExtended;
import com.fastcode.fastcodetest4.domain.core.authorization.userpreference.IUserpreferenceRepository;
import com.fastcode.fastcodetest4.addons.reporting.domain.dashboardversion.*;
import com.fastcode.fastcodetest4.addons.reporting.domain.dashboardversionreport.*;
import com.fastcode.fastcodetest4.addons.reporting.domain.reportversion.*;
import com.fastcode.fastcodetest4.commons.logging.LoggingHelper;

@Service("userAppServiceExtended")
public class UserAppServiceExtended extends UserAppService implements IUserAppServiceExtended {

	public UserAppServiceExtended(IDashboardversionRepository dashboardversionRepository,IReportversionRepository reportversionRepository,IDashboardversionreportRepository reportDashboardRepository,IUserRepositoryExtended userRepositoryExtended,
				IUserpreferenceRepository userpreferenceRepository,IUserMapperExtended mapper,LoggingHelper logHelper) {

		super(dashboardversionRepository,reportversionRepository,reportDashboardRepository,userRepositoryExtended,
		userpreferenceRepository,mapper,logHelper);

	}

 	//Add your custom code here
 
}

