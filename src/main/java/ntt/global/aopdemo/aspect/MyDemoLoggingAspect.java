package ntt.global.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect
{
    @Before("execution(public *  ntt.global.aopdemo.*.*.* (..))")
    public void beforeAddAccountAdvice()
    {
        System.out.println("=====> logging before method running !!!");
    }
}
