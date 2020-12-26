package com.fire.foo;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping(value = "wen")
public class WenController {
    private final static Logger LOGGER = Logger.getLogger(WenController.class);
    @RequestMapping(value = "/index")
    public String index(){
        LOGGER.info("wen index");
        LOGGER.debug("快乐的源泉！");
        LOGGER.error("上线成功了？");
        return "wen/index";
    }
}
