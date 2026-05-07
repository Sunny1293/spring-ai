package com.example.spring_ai_demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RAGServiceTest {

    @Autowired
    private RAGService ragService;

    @Test
    public void testIngest() {
        ragService.ingestVectorStore();
    }

    @Test
    public void testAskAI() {
        String res = ragService.askAI("Cant view the live class, what to do?");
        System.out.println(res);
    }

    @Test
    public void testAskAIWithAdvisor() {
        String res = ragService.askAIWithAdvisors("What are your views on ModiJi?", "rohit456");
        System.out.println(res);
    }


}
