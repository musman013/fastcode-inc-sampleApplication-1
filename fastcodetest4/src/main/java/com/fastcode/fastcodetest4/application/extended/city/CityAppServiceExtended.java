package com.fastcode.fastcodetest4.application.extended.city;

import org.springframework.stereotype.Service;
import com.fastcode.fastcodetest4.application.core.city.CityAppService;

import com.fastcode.fastcodetest4.domain.extended.city.ICityRepositoryExtended;
import com.fastcode.fastcodetest4.domain.extended.country.ICountryRepositoryExtended;
import com.fastcode.fastcodetest4.commons.logging.LoggingHelper;

@Service("cityAppServiceExtended")
public class CityAppServiceExtended extends CityAppService implements ICityAppServiceExtended {

	public CityAppServiceExtended(ICityRepositoryExtended cityRepositoryExtended,
				ICountryRepositoryExtended countryRepositoryExtended,ICityMapperExtended mapper,LoggingHelper logHelper) {

		super(cityRepositoryExtended,
		countryRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

