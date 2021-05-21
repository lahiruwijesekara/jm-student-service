/**
 * 
 */
package com.javamastermind.student.advicer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javamastermind.student.domain.ErrorResponse;
import com.javamastermind.student.filter.MultipleReadHttpRequest;
import com.javamastermind.student.util.ErrorCodes;

/**
 * @author lahiru_w
 */
@ControllerAdvice
public class ExceptionHandlerController
{
    @Autowired
    ErrorCodes errorCodes;

    @ExceptionHandler(HttpMessageConversionException.class)
    @ResponseBody
    public ResponseEntity<Object> httpMessageConversion(HttpMessageConversionException ex,
        MultipleReadHttpRequest request)
    {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setErrorCode(errorCodes.getMsgConErrCode());
        errorResponse.setErrorDescription(errorCodes.getMsgConErrMsg());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
