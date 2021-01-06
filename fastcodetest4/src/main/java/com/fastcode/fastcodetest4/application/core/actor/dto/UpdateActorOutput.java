package com.fastcode.fastcodetest4.application.core.actor.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateActorOutput {

  	private Integer actorId;
  	private String firstName;
  	private String lastName;
  	private LocalDateTime lastUpdate;

}
