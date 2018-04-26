package org.quantumcs;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.NLPTokenizer;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {


        System.out.println(HanLP.segment("您好，欢迎使用HanLP！"));
        System.out.println( "Hello World!" );


        List<Term> termList = HanLP.segment("商品和服务");
        System.out.println(termList);

        List<Term> termList2 = NLPTokenizer.segment("中国科学院计算技术研究所的宗成庆教授正在教授自然语言处理课程");
        System.out.println(termList2);

    }
}
