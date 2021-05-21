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

    private String msgConErrCode;

    private String saveErrorMsg;

    private String msgConErrMsg;

    private String invalidData;

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

    public String getInvalidData()
    {
        return invalidData;
    }

    public void setInvalidData(String invalidData)
    {
        this.invalidData = invalidData;
    }

    public String getMsgConErrCode()
    {
        return msgConErrCode;
    }

    public void setMsgConErrCode(String msgConErrCode)
    {
        this.msgConErrCode = msgConErrCode;
    }

    public String getMsgConErrMsg()
    {
        return msgConErrMsg;
    }

    public void setMsgConErrMsg(String msgConErrMsg)
    {
        this.msgConErrMsg = msgConErrMsg;
    }

}
