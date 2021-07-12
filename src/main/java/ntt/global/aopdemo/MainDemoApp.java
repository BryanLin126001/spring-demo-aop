package ntt.global.aopdemo;

import com.fasterxml.classmate.AnnotationConfiguration;
import ntt.global.aopdemo.dao.AccountDAO;
import ntt.global.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.function.Consumer;


public class MainDemoApp
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        accountDAO.addAccount(new Account(), false);

        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        membershipDAO.addAccount();

        membershipDAO.addMember();

        membershipDAO.goToSleep();

    }
}
