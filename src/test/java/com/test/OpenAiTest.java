package com.test;

import com.system.springai.utils.OpenAiUtils;
import com.theokanning.openai.completion.CompletionChoice;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class OpenAiTest {

    /**
     * 测试问答
     */
    @Test
    public void testQA(){
        List<CompletionChoice> questionAnswer = OpenAiUtils.getQuestionAnswer("写一首诗，春游，七言格式");
        for (CompletionChoice completionChoice : questionAnswer) {
            System.out.println(completionChoice.getText());
        }
    }

    /**
     * 测试面试题生成
     */
    @Test
    public void testInterview(){
        List<CompletionChoice> results = OpenAiUtils.getInterviewQuestion("redis");
        for (CompletionChoice completionChoice : results) {
            System.out.println(completionChoice.getText());
        }
    }

}
