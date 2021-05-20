/**
 * 
 */
package com.javamastermind.student.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author lahiru_w
 */
@Configuration
@ConfigurationProperties(prefix = "error-codes")
public class ErrorCodes
{
    private String saveErrorCode;

    private String saveErrorMsg;

    public String getSaveErrorCode()
    {
        return saveErrorCode;
    }

    public void setSaveErrorCode(String saveErrorCode)
    {
        this.saveErrorCode = saveErrorCode;
    }

    public String getSaveErrorMsg()
    {
        return saveErrorMsg;
    }

    public void setSaveErrorMsg(String saveErrorMsg)
    {
        this.saveErrorMsg = saveErrorMsg;
    }

}
