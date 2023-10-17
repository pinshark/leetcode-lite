package com.sicko.model.dto.question;

import lombok.Data;

/**
 * @author zwb
 * 判题用例
 */
@Data
public class JudgeCase {
    /**
     * 输入用例
     */
    private String input;

    /**
     * 输出用例
     */
    private String output;
}
