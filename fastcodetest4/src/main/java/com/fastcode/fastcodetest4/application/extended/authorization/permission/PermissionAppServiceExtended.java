package com.fastcode.fastcodetest4.application.extended.authorization.permission;

import org.springframework.stereotype.Service;
import com.fastcode.fastcodetest4.application.core.authorization.permission.PermissionAppService;

import com.fastcode.fastcodetest4.domain.extended.authorization.permission.IPermissionRepositoryExtended;
import com.fastcode.fastcodetest4.commons.logging.LoggingHelper;

@Service("permissionAppServiceExtended")
public class PermissionAppServiceExtended extends PermissionAppService implements IPermissionAppServiceExtended {

	public PermissionAppServiceExtended(IPermissionRepositoryExtended permissionRepositoryExtended,
				IPermissionMapperExtended mapper,LoggingHelper logHelper) {

		super(permissionRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

