package com.fastcode.fastcodetest4.addons.reporting.application.reportversion.dto;

import org.json.simple.JSONObject;
import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateReportversionOutput {

	private String ctype;
	private String description;
	private JSONObject query;
	private String reportType;
	private String title;
	private String versiono;
	private Boolean isRefreshed;
  	private Long userId; 
	private String userDescriptiveField;
	private String reportWidth;
	private Long reportId;

}

