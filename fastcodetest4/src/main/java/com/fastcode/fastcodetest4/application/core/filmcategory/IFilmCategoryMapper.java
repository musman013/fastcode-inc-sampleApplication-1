package com.fastcode.fastcodetest4.application.core.filmcategory;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.fastcode.fastcodetest4.domain.core.category.CategoryEntity;
import com.fastcode.fastcodetest4.domain.core.film.FilmEntity;
import com.fastcode.fastcodetest4.application.core.filmcategory.dto.*;
import com.fastcode.fastcodetest4.domain.core.filmcategory.FilmCategoryEntity;
import java.time.*;

@Mapper(componentModel = "spring")
public interface IFilmCategoryMapper {

   FilmCategoryEntity createFilmCategoryInputToFilmCategoryEntity(CreateFilmCategoryInput filmcategoryDto);
   
   
   @Mappings({ 
   @Mapping(source = "entity.category.categoryId", target = "categoryDescriptiveField"),                    
   @Mapping(source = "entity.film.filmId", target = "filmDescriptiveField"),                    
   }) 
   CreateFilmCategoryOutput filmCategoryEntityToCreateFilmCategoryOutput(FilmCategoryEntity entity);
   
    FilmCategoryEntity updateFilmCategoryInputToFilmCategoryEntity(UpdateFilmCategoryInput filmCategoryDto);
    
    @Mappings({ 
    @Mapping(source = "entity.category.categoryId", target = "categoryDescriptiveField"),                    
    @Mapping(source = "entity.film.filmId", target = "filmDescriptiveField"),                    
   	}) 
   	UpdateFilmCategoryOutput filmCategoryEntityToUpdateFilmCategoryOutput(FilmCategoryEntity entity);

   	@Mappings({ 
   	@Mapping(source = "entity.category.categoryId", target = "categoryDescriptiveField"),                    
   	@Mapping(source = "entity.film.filmId", target = "filmDescriptiveField"),                    
   	}) 
   	FindFilmCategoryByIdOutput filmCategoryEntityToFindFilmCategoryByIdOutput(FilmCategoryEntity entity);


   @Mappings({
   @Mapping(source = "film.filmId", target = "filmId"),                  
   @Mapping(source = "film.lastUpdate", target = "lastUpdate"),                  
   @Mapping(source = "foundFilmCategory.categoryId", target = "filmCategoryCategoryId"),
   @Mapping(source = "foundFilmCategory.filmId", target = "filmCategoryFilmId"),
   })
   GetFilmOutput filmEntityToGetFilmOutput(FilmEntity film, FilmCategoryEntity foundFilmCategory);
   
   @Mappings({
   @Mapping(source = "category.categoryId", target = "categoryId"),                  
   @Mapping(source = "category.lastUpdate", target = "lastUpdate"),                  
   @Mapping(source = "foundFilmCategory.categoryId", target = "filmCategoryCategoryId"),
   @Mapping(source = "foundFilmCategory.filmId", target = "filmCategoryFilmId"),
   })
   GetCategoryOutput categoryEntityToGetCategoryOutput(CategoryEntity category, FilmCategoryEntity foundFilmCategory);
   
}

