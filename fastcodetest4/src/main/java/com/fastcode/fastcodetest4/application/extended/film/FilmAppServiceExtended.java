package com.fastcode.fastcodetest4.application.extended.film;

import org.springframework.stereotype.Service;
import com.fastcode.fastcodetest4.application.core.film.FilmAppService;

import com.fastcode.fastcodetest4.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.fastcodetest4.domain.extended.language.ILanguageRepositoryExtended;
import com.fastcode.fastcodetest4.commons.logging.LoggingHelper;

@Service("filmAppServiceExtended")
public class FilmAppServiceExtended extends FilmAppService implements IFilmAppServiceExtended {

	public FilmAppServiceExtended(IFilmRepositoryExtended filmRepositoryExtended,
				ILanguageRepositoryExtended languageRepositoryExtended,IFilmMapperExtended mapper,LoggingHelper logHelper) {

		super(filmRepositoryExtended,
		languageRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

