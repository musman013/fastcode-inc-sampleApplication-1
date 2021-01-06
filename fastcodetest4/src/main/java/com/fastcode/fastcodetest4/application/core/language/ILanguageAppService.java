package com.fastcode.fastcodetest4.application.core.language;

import org.springframework.data.domain.Pageable;
import com.fastcode.fastcodetest4.application.core.language.dto.*;
import com.fastcode.fastcodetest4.commons.search.SearchCriteria;

import java.util.*;

public interface ILanguageAppService {
	
	//CRUD Operations
	
	CreateLanguageOutput create(CreateLanguageInput language);

    void delete(Integer id);

    UpdateLanguageOutput update(Integer id, UpdateLanguageInput input);

    FindLanguageByIdOutput findById(Integer id);

    List<FindLanguageByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
    
    //Join Column Parsers

	Map<String,String> parseFilmsJoinColumn(String keysString);
}

