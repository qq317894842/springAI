package com.system.springai.controller;

import com.system.springai.utils.OpenAiUtils;
import com.theokanning.openai.completion.CompletionChoice;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ai")
@Api(tags = "ChatGPT 问答接口")
public class TestController {

    @GetMapping("ask")
    public StringBuffer ask(String content){
        StringBuffer stringBuffer = new StringBuffer("");
        List<CompletionChoice> questionAnswer = OpenAiUtils.getQuestionAnswer(content);
        for (CompletionChoice completionChoice : questionAnswer) {
            stringBuffer.append(completionChoice.getText());
        }
        return stringBuffer;

    }
}
