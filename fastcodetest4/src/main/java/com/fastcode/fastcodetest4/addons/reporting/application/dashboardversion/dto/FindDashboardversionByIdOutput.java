package com.fastcode.fastcodetest4.addons.reporting.application.dashboardversion.dto;

import java.time.*;
import java.util.List;

import com.fastcode.fastcodetest4.addons.reporting.application.report.dto.FindReportByIdOutput;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FindDashboardversionByIdOutput {

	private String description;
	private Long id;
	private String title;
	private Boolean isRefreshed;
  	private Long userId; 
	private String userDescriptiveField;
	private List<FindReportByIdOutput> reportDetails;
	private Long versiono;
	
}

