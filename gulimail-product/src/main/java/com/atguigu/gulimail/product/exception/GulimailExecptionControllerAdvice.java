package com.atguigu.gulimail.product.exception;

import com.atguigu.common.execption.BizCodeEnume;
import com.atguigu.common.utils.R;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

/**
 * @author luoxu
 * @create 2022-11-01-15:54
 */
//要处理的字段验证
@RestControllerAdvice(basePackages = "com.atguigu.gulimail.product.controller")
public class GulimailExecptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleVaildExecption(MethodArgumentNotValidException e){

        BindingResult bindingResult = e.getBindingResult();

        HashMap<String, String> errMap = new HashMap<>();
        bindingResult.getFieldErrors().forEach(fieldError -> {
            errMap.put(fieldError.getField(),fieldError.getDefaultMessage());
        });
        return R.error(BizCodeEnume.VAILD_EXECPTION.getCode(),BizCodeEnume.UNKNOW_EXECPTION.getMsg()).put("data",errMap);
    }

}
