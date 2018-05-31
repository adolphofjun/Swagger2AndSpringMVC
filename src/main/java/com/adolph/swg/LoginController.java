package com.adolph.swg;

import com.adolph.utils.ResultMsg;
import com.adolph.utils.ResultUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/api/login")
public class LoginController {

    @ApiOperation(value = "根据用户获取会见申请列表——", notes = "根据用户获取会见申请列表")
    @ResponseBody
    @RequestMapping(value = "/getUserId/{userId}", method = RequestMethod.GET)
    public ResultMsg test(@PathVariable Long userId){
        System.out.println("========"+userId);
        return  ResultUtil.success("成功","你好");
    }
}
