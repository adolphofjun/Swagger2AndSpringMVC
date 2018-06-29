package com.aisino.api.controller;

import com.aisino.api.bean.DataBean;
import com.aisino.api.bean.ResultMsg;
import com.aisino.api.service.ApiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.Map;

@Controller
@Api(value = "高级平台数据接收接口", description = "高级平台数据接收接口", tags = "API", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiController {
    @Autowired
    private ApiService apiService;

    @RequestMapping(value = "saveData",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "接收数据", notes = "接收数据")
    public ResultMsg saveData(@RequestBody @ApiParam(name = "接受数据", required = true) DataBean bean){

        return null;
    }


}
