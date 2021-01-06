package com.fastcode.fastcodetest4.addons.reporting.domain.report;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.time.*;
import com.fastcode.fastcodetest4.addons.reporting.application.report.dto.ReportDetailsOutput;

public interface IReportRepositoryCustom {
	
	Page<ReportDetailsOutput> getAllReportsByUserId(Long userId, String search, Pageable pageable) throws Exception;

}

