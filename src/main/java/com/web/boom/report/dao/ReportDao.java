package com.web.boom.report.dao;

import com.web.boom.report.domain.AppDayPkgKpiDo;
import org.mapstruct.Mapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Mapper
public interface ReportDao {
    @Transactional(value = "dorisDBTransactionManager")
    List<AppDayPkgKpiDo> listDayPkg(Map<String, Object> map);
    @Transactional(value = "dorisDBTransactionManager")
    Integer listDayPkgCount(Map<String, Object> map);
}
