package com.fastcode.fastcodetest4.application.extended.authorization.userpermission;

import org.springframework.stereotype.Service;
import com.fastcode.fastcodetest4.application.core.authorization.userpermission.UserpermissionAppService;

import com.fastcode.fastcodetest4.domain.extended.authorization.userpermission.IUserpermissionRepositoryExtended;
import com.fastcode.fastcodetest4.domain.extended.authorization.permission.IPermissionRepositoryExtended;
import com.fastcode.fastcodetest4.domain.extended.authorization.user.IUserRepositoryExtended;
import com.fastcode.fastcodetest4.commons.logging.LoggingHelper;

@Service("userpermissionAppServiceExtended")
public class UserpermissionAppServiceExtended extends UserpermissionAppService implements IUserpermissionAppServiceExtended {

	public UserpermissionAppServiceExtended(IUserpermissionRepositoryExtended userpermissionRepositoryExtended,
				IPermissionRepositoryExtended permissionRepositoryExtended,IUserRepositoryExtended userRepositoryExtended,IUserpermissionMapperExtended mapper,LoggingHelper logHelper) {

		super(userpermissionRepositoryExtended,
		permissionRepositoryExtended,userRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

