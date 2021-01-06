package com.fastcode.fastcodetest4.addons.reporting.application.report.dto;

import org.json.simple.JSONObject;
import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ReportDetailsOutput {

	private Long id;
	private Boolean isPublished;
	private String ctype;
	private String description;
	private JSONObject query;
	private String reportType;
	private String title;
	private String reportVersion;
	private String reportWidth;
  	private Long userId; 
	private String ownerDescriptiveField;

}

