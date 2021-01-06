package com.fastcode.fastcodetest4.application.core.country;

import org.mapstruct.Mapper;
import com.fastcode.fastcodetest4.application.core.country.dto.*;
import com.fastcode.fastcodetest4.domain.core.country.CountryEntity;
import java.time.*;

@Mapper(componentModel = "spring")
public interface ICountryMapper {

   CountryEntity createCountryInputToCountryEntity(CreateCountryInput countryDto);
   
   
   CreateCountryOutput countryEntityToCreateCountryOutput(CountryEntity entity);
   
    CountryEntity updateCountryInputToCountryEntity(UpdateCountryInput countryDto);
    
   	UpdateCountryOutput countryEntityToUpdateCountryOutput(CountryEntity entity);

   	FindCountryByIdOutput countryEntityToFindCountryByIdOutput(CountryEntity entity);


}

