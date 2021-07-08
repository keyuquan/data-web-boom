package com.web.boom.report.service.impl;

import com.web.boom.report.dao.ReportDao;
import com.web.boom.report.domain.AppDayPkgKpiDo;
import com.web.boom.report.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    ReportDao reportDao;

    @Override
    public List<AppDayPkgKpiDo> listDayPkg(Map<String, Object> params) {
        return reportDao.listDayPkg(params);
    }

    @Override
    public Integer listDayPkgCount(Map<String, Object> params) {
        return reportDao.listDayPkgCount(params);
    }
}
