package com.fastcode.fastcodetest4.application.core.store.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GetAddressOutput {

 	private String address;
 	private String address2;
 	private Integer addressId;
 	private String district;
 	private LocalDateTime lastUpdate;
 	private String phone;
 	private String postalCode;
  	private Integer storeStoreId;

}

