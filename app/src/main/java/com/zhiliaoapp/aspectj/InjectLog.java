package com.zhiliaoapp.aspectj;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by wuguonan on 2017/11/3.
 */
@Aspect
public class InjectLog {

    @Around("call(* android.util.Log.d(..))")
    public Object weaveJoinPoint(ProceedingJoinPoint joinPoint) throws Throwable {
        Log.e("dfdf", "dfdfdf");
        Object[] params = joinPoint.getArgs();
        params[0] = "aop--" + params[0];
        params[1] = "aop--" + params[1];

//        Object result = joinPoint.proceed(params);
        Object result = -1;

        return result;
    }

//    @Before("call(* android.util.Log.d(..))")
//    public void weaveJoinPoint(JoinPoint joinPoint) throws Throwable {
//        Object[] par = joinPoint.getArgs();
//
//        Log.e("dfdf", par[0] + "===" + par[1]);
//    }


//    @Around("execution(* com.zhiliaoapp.aspectj.MainActivity.testA(..))")
//    public Object weaveJoinPoint2(ProceedingJoinPoint joinPoint) throws Throwable {
//        Log.d("dfdf", "dfdfdf");
//        Object[] params = joinPoint.getArgs();
//        params[0] = "aop--" + params[0];
//
//        Object result = joinPoint.proceed(params);
//
//        return result;
//    }
}
