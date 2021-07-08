package com.web.boom.report.controller;

import com.web.boom.common.controller.BaseController;
import com.web.boom.report.domain.AppDayPkgKpiDo;
import com.web.boom.report.domain.ResponseBaseDO;
import com.web.boom.report.service.ReportService;
import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/report")
public class ReportController extends BaseController {

    @Autowired
    private ReportService reportService;

    // 日报相关
    @RequiresPermissions("report:report:report")
    @GetMapping("/day/pkg")
    String dayPkg(Model model) {
        return "report/day_pkg";
    }

    @RequestMapping("/day/pkg/list")
    @ResponseBody
    String list(@RequestParam Map<String, Object> params) {
        Integer page = Integer.valueOf(params.getOrDefault("page", "1").toString());
        Integer limit = Integer.valueOf(params.getOrDefault("limit", "10").toString());
        params.put("offset", (page - 1) * limit);
        params.put("limit", limit);

        Integer count = reportService.listDayPkgCount(params);
        List<AppDayPkgKpiDo> list = reportService.listDayPkg(params);

        ResponseBaseDO res = new ResponseBaseDO<AppDayPkgKpiDo>();
        if (list != null) {
            res.setCount(count);
            res.setCode(0);
            res.setData(list);
        } else {
            res.setCount(0);
            res.setCode(1);
            res.setData(null);
        }
        return JSONObject.toJSONString(res);
    }
}
