package com.example.granblueutil.taskTest;

import com.plexpt.chatgpt.ChatGPT;
import com.plexpt.chatgpt.util.Proxys;
import org.junit.jupiter.api.Test;

import java.net.Proxy;


public class chatgptTest {
    @Test
    public void test(){
        Proxy proxy = Proxys.http("127.0.0.1", 1080);
        //socks5 代理
        // Proxy proxy = Proxys.socks5("127.0.0.1", 1080);

        ChatGPT chatGPT = ChatGPT.builder()
                .apiKey("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")
                .proxy(proxy)
                .apiHost("https://api.openai.com/") //反向代理地址
                .build()
                .init();

        String res = chatGPT.chat("写一段七言绝句诗，题目是：火锅！");
        System.out.println(res);
    }

}
