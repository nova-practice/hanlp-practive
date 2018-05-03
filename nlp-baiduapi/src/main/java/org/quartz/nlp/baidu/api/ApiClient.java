package org.quartz.nlp.baidu.api;

import com.baidu.aip.nlp.AipNlp;

import static org.quartz.nlp.baidu.api.Config.API_KEY;
import static org.quartz.nlp.baidu.api.Config.APP_ID;
import static org.quartz.nlp.baidu.api.Config.SECRET_KEY;

public class ApiClient {

    // 初始化一个AipNlp
    private static AipNlp aipNlp = new AipNlp(APP_ID, API_KEY, SECRET_KEY);

    private ApiClient(){
        // 可选：设置网络连接参数
        aipNlp.setConnectionTimeoutInMillis(2000);
        aipNlp.setSocketTimeoutInMillis(60000);
        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

    }

    public static AipNlp getAipNlp() {
        return aipNlp;
    }

}
