package ntt.global.aopdemo.dao;

import org.springframework.stereotype.Component;
import ntt.global.aopdemo.Account;

@Component
public class AccountDAO
{
    public void addAccount(Account account, boolean vipFlag)
    {
        System.out.println(getClass() + " : Doing my db work: add account \n");
    }
}
