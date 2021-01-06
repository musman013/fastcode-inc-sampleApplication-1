package com.fastcode.fastcodetest4.addons.reporting.application.reportversion.dto;

import org.hibernate.validator.constraints.Length;
import org.json.simple.JSONObject;
import java.time.*;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateReportversionInput {

	private String ctype;
	private String description;
	private JSONObject query;
	@Length(max = 255, message = "reportType must be less than 255 characters")
	private String reportType;
	private String title;
  	private Long userId; 
	private String reportWidth;
	private Long reportId;
	private Boolean isAssignedByDashboard;

}

