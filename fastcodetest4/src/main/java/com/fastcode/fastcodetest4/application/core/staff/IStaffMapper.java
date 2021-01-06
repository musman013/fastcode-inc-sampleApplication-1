package com.fastcode.fastcodetest4.application.core.staff;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.fastcode.fastcodetest4.domain.core.address.AddressEntity;
import com.fastcode.fastcodetest4.application.core.staff.dto.*;
import com.fastcode.fastcodetest4.domain.core.staff.StaffEntity;
import java.time.*;

@Mapper(componentModel = "spring")
public interface IStaffMapper {

   StaffEntity createStaffInputToStaffEntity(CreateStaffInput staffDto);
   
   
   @Mappings({ 
   @Mapping(source = "entity.address.addressId", target = "addressId"),                   
   @Mapping(source = "entity.address.addressId", target = "addressDescriptiveField"),                    
   }) 
   CreateStaffOutput staffEntityToCreateStaffOutput(StaffEntity entity);
   
    StaffEntity updateStaffInputToStaffEntity(UpdateStaffInput staffDto);
    
    @Mappings({ 
    @Mapping(source = "entity.address.addressId", target = "addressId"),                   
    @Mapping(source = "entity.address.addressId", target = "addressDescriptiveField"),                    
   	}) 
   	UpdateStaffOutput staffEntityToUpdateStaffOutput(StaffEntity entity);

   	@Mappings({ 
   	@Mapping(source = "entity.address.addressId", target = "addressId"),                   
   	@Mapping(source = "entity.address.addressId", target = "addressDescriptiveField"),                    
   	}) 
   	FindStaffByIdOutput staffEntityToFindStaffByIdOutput(StaffEntity entity);


   @Mappings({
   @Mapping(source = "address.address", target = "address"),                  
   @Mapping(source = "address.lastUpdate", target = "lastUpdate"),                  
   @Mapping(source = "foundStaff.staffId", target = "staffStaffId"),
   })
   GetAddressOutput addressEntityToGetAddressOutput(AddressEntity address, StaffEntity foundStaff);
   
}

