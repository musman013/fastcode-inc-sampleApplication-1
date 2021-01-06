package com.fastcode.fastcodetest4.application.extended.inventory;

import org.mapstruct.Mapper;
import com.fastcode.fastcodetest4.application.core.inventory.IInventoryMapper;

@Mapper(componentModel = "spring")
public interface IInventoryMapperExtended extends IInventoryMapper {

}

