package org.quartz.nlp.baidu.api;

import com.baidu.aip.nlp.AipNlp;
import com.baidu.aip.nlp.ESimnetType;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;

public class TestAPI {
    AipNlp client = ApiClient.getAipNlp() ;


    @Test@Ignore
    public void depParser() throws JSONException {
    //依存句法分析
        String text = "今天天气怎么样";
        // 传入可选参数调用接口
        HashMap<String, Object> options = new HashMap<String, Object>();
        options.put("mode", 1);
        JSONObject res = client.depParser(text, options);
        System.out.println(res.toString(2));
    }

    @Test@Ignore
    public void wordEmbedding() throws JSONException {
    //词向量表示
        String word = "张飞";

        // 传入可选参数调用接口
        HashMap<String, Object> options = new HashMap<String, Object>();

        // 词向量表示
        JSONObject res = client.wordEmbedding(word, options);
        System.out.println(res.toString(2));
    }

    @Test@Ignore
    public void dnnlmCn() throws JSONException {
        //DNN语言模型
        String text = "床前明月光";

        // 传入可选参数调用接口
        HashMap<String, Object> options = new HashMap<String, Object>();

        // DNN语言模型
        JSONObject res = client.dnnlmCn(text, options);
        System.out.println(res.toString(2));
    }

    @Test@Ignore
    public void wordSimEmbedding() throws JSONException {
        //词义相似度
        String word1 = "北京";
        String word2 = "上海";

        // 传入可选参数调用接口
        HashMap<String, Object> options = new HashMap<String, Object>();

        // 词义相似度
        JSONObject res = client.wordSimEmbedding(word1, word2, options);
        System.out.println(res.toString(2));
    }

    @Test@Ignore
    public void simnet() throws JSONException {
        //短文本相似度
        String text1 = "浙富股份";
        String text2 = "万事通自考网";

        // 传入可选参数调用接口
        HashMap<String, Object> options = new HashMap<String, Object>();
        options.put("model", "CNN");

        // 短文本相似度
        JSONObject res = client.simnet(text1, text2, options);
        System.out.println(res.toString(2));
    }
    @Test@Ignore
    public void commentTag() throws JSONException {
        //评论观点抽取
        String text = "三星电脑电池不给力";


        // 获取美食评论情感属性
        JSONObject response = client.commentTag("这家餐馆味道不错", ESimnetType.FOOD, null);
        System.out.println(response.toString());

        // 获取酒店评论情感属性
        response = client.commentTag("喜来登酒店不错", ESimnetType.HOTEL, null);
        System.out.println(response.toString());
    }


}
