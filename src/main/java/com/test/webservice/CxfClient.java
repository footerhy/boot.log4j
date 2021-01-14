package com.test.webservice;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * @ClassName:CxfClient
 * @Description:webservice客户端：
 *                 该类提供两种不同的方式来调用webservice服务
 *              1：代理工厂方式
 *              2：动态调用webservice
 * @author Jerry
 * @date:2018年4月10日下午4:14:07
 */
public class CxfClient {


    public static void main(String[] args) {
        CxfClient.main2();
    }



    /**
     * 2：动态调用
     */
    public static void main2() {
        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://127.0.0.1:9090/greet?wsdl");
        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));
        Object[] objects = new Object[0];
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("greeting", "maple");
            System.out.println("返回数据:" + objects[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}