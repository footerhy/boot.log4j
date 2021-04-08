package com.example.boot.controller;

import com.alibaba.fastjson.JSONObject;
import com.util.ImageUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Administrator
 * @description: 用于处理Pdf相关的请求
 */
@Controller
@RequestMapping("pdf")
public class PdfController {

    @PostMapping("to/image")
    public void pdfToImage(@RequestParam("file") MultipartFile file, HttpServletResponse response) throws Exception{
        ImageUtils.pdfToImage(file,response);
    }

    @ResponseBody
    @RequestMapping(value = "/index")
    public String index(@RequestBody JSONObject object){
        String file = object.containsKey("file") ? object.getString("file") : "C:\\Users\\Administrator\\Desktop\\第十八周亲子作业_20210408223223.pdf";
        try {
            List<String> list = ImageUtils.pdf2Image(file);
            if(list != null && list.size() > 0){
                return list.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "200";
    }

}