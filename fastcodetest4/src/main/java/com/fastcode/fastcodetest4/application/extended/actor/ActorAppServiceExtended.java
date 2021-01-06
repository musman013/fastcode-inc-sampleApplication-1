package com.fastcode.fastcodetest4.application.extended.actor;

import org.springframework.stereotype.Service;
import com.fastcode.fastcodetest4.application.core.actor.ActorAppService;

import com.fastcode.fastcodetest4.domain.extended.actor.IActorRepositoryExtended;
import com.fastcode.fastcodetest4.commons.logging.LoggingHelper;

@Service("actorAppServiceExtended")
public class ActorAppServiceExtended extends ActorAppService implements IActorAppServiceExtended {

	public ActorAppServiceExtended(IActorRepositoryExtended actorRepositoryExtended,
				IActorMapperExtended mapper,LoggingHelper logHelper) {

		super(actorRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

