package com.web.boom.report.service;

import com.web.boom.report.domain.AppDayPkgKpiDo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ReportService {
    List<AppDayPkgKpiDo> listDayPkg(Map<String, Object> params);

    Integer listDayPkgCount(Map<String, Object> params);
}
