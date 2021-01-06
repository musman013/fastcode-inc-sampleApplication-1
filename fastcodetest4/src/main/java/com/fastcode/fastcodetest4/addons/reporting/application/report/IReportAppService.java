package com.fastcode.fastcodetest4.addons.reporting.application.report;

import java.util.List;
import java.util.Map;
import java.time.*;

import org.springframework.data.domain.Pageable;
import com.fastcode.fastcodetest4.commons.search.SearchCriteria;
import com.fastcode.fastcodetest4.addons.reporting.application.report.dto.*;

public interface IReportAppService {

	CreateReportOutput create(CreateReportInput report);

    void delete(Long id, Long userId);

    UpdateReportOutput update(Long id, UpdateReportInput input);

    FindReportByIdOutput findById(Long id);

    List<FindReportByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
     
    List<ReportDetailsOutput> getReports(Long userId,String search, Pageable pageable) throws Exception;

    FindReportByIdOutput findByReportIdAndUserId(Long reportId, Long userId, String version);

    ReportDetailsOutput publishReport(Long userId, Long reportId);
    
    ReportDetailsOutput refreshReport(Long userId, Long reportId);
    
    Map<String,String> parseReportdashboardJoinColumn(String keysString);
    
}

