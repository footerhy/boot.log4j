package yxm.zyf.love;

import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Administrator
 */
@RestController
@RequestMapping(value = "/hospital")
public class HospitalPay {
    /**
     *
     给类初始化日志对象
     */
    private final static Logger logger = Logger.getLogger(HospitalPay.class);

    
    @ResponseBody
    @RequestMapping(value = "pay")
    public void pay(HttpServletRequest req, @RequestBody String a) {
        System.out.println(req.getAttribute("industry"));
        System.out.println(req.getParameter("industry"));
        System.out.println("print pay info.");
    }
    
    @ResponseBody
    @RequestMapping(value = "room")
    public String room() {
        //打印info级别的日志
        LoggerUtil.info(logger, "出参roomdo：{0}", new Object());
        System.out.println(new Object());
        LoggerUtil.debug(logger,"这是debug信息{0}","小嘚嘚");
        LoggerUtil.error(logger,"这是error信息{0}","很严重哟！");
        logger.info("这个确实是info日志的啦！");
        return "room do";
    }
}