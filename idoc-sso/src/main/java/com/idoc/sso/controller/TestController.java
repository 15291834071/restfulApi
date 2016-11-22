package com.idoc.sso.controller;

import com.swagger.idoc.po.TDocInfo;
import com.idoc.sso.service.GetDocInfoByIdService;
/*import org.apache.log4j.Logger;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * CopyRright (c)2014-2016 Haerbin Hearglobal Co.,Ltd
 * Project: idoc-main
 * Comments:
 * Author:cbam
 * Create Date:2016/11/20
 * Modified By:
 * Modified Date:
 * Modified Reason:
 */
@Controller
public class TestController {
    @Autowired
    private GetDocInfoByIdService getDocInfoByIdService;
    @ResponseBody
    @RequestMapping("/find")
    public TDocInfo getDocInfoById() {
        TDocInfo tDocInfo = getDocInfoByIdService.getDocInfoById();
      /*  Logger logger = Logger.getLogger(TestController.class);
        logger.debug("cbamcbam");*/
        return tDocInfo;
    }
}
