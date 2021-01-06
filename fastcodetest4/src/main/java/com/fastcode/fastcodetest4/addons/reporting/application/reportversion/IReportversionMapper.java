package com.fastcode.fastcodetest4.addons.reporting.application.reportversion;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.time.*;
import com.fastcode.fastcodetest4.addons.reporting.application.reportversion.dto.CreateReportversionInput;
import com.fastcode.fastcodetest4.addons.reporting.application.reportversion.dto.CreateReportversionOutput;
import com.fastcode.fastcodetest4.addons.reporting.application.reportversion.dto.FindReportversionByIdOutput;
import com.fastcode.fastcodetest4.addons.reporting.application.reportversion.dto.GetUserOutput;
import com.fastcode.fastcodetest4.addons.reporting.application.reportversion.dto.UpdateReportversionInput;
import com.fastcode.fastcodetest4.addons.reporting.application.reportversion.dto.UpdateReportversionOutput;
import com.fastcode.fastcodetest4.addons.reporting.domain.reportversion.ReportversionEntity;
import com.fastcode.fastcodetest4.domain.core.authorization.user.UserEntity;


@Mapper(componentModel = "spring")
public interface IReportversionMapper {
	ReportversionEntity createReportversionInputToReportversionEntity(CreateReportversionInput reportversionDto);

	@Mappings({ 
		@Mapping(source = "userId", target = "userId"),
		@Mapping(source = "user.userName", target = "userDescriptiveField"),
		@Mapping(source = "report.id", target = "reportId")
		
	}) 
	CreateReportversionOutput reportversionEntityToCreateReportversionOutput(ReportversionEntity entity);

	@Mappings({ 
		@Mapping(source = "userId", target = "userId"),
		@Mapping(source = "version", target = "reportVersion")
	}) 
	ReportversionEntity reportversionEntityToReportversionEntity(ReportversionEntity entity,Long userId, String version);

	ReportversionEntity updateReportversionInputToReportversionEntity(UpdateReportversionInput reportversionDto);

	@Mappings({  
		@Mapping(source = "userId", target = "userId"),
		@Mapping(source = "user.userName", target = "userDescriptiveField"),
		@Mapping(source = "report.id", target = "reportId")                   
	}) 
	UpdateReportversionOutput reportversionEntityToUpdateReportversionOutput(ReportversionEntity entity);

	@Mappings({ 
		@Mapping(source = "userId", target = "userId"),
		@Mapping(source = "user.userName", target = "userDescriptiveField"), 
		@Mapping(source = "report.id", target = "reportId")                  
	}) 
	FindReportversionByIdOutput reportversionEntityToFindReportversionByIdOutput(ReportversionEntity entity);


	@Mappings({
		@Mapping(source = "user.id", target = "id"),
		@Mapping(source = "reportversion.reportVersion", target = "reportVersion"),
	})
	GetUserOutput userEntityToGetUserOutput(UserEntity user, ReportversionEntity reportversion);

}
