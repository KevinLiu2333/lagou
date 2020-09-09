package com.lagou.edu.service.impl;

import com.lagou.edu.dao.AccountDao;
import com.lagou.edu.pojo.Account;
import com.lagou.edu.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author 应癫
 */
@Service("transferService")
public class TransferServiceImpl implements TransferService {


    // 最佳状态
    //如果按照类型无法指定对象,结合使用@Qualifier指定具体的id
    @Autowired
    @Qualifier("accountDao")
//    @Resource//默认按照名称注入,可配置
    private AccountDao accountDao;



    @Override
    public void transfer(String fromCardNo, String toCardNo, int money) throws Exception {

//        try {
//            //开启事务(关闭事务的自动提交)
//            TransactionManager.getInstance().beginTransaction();
        Account from = accountDao.queryAccountByCardNo(fromCardNo);
        Account to = accountDao.queryAccountByCardNo(toCardNo);
        from.setMoney(from.getMoney() - money);
        to.setMoney(to.getMoney() + money);
        accountDao.updateAccountByCardNo(to);
//        int c = 1 / 0;
        accountDao.updateAccountByCardNo(from);
        //提交事务
//            TransactionManager.getInstance().commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            //回滚事务
//            TransactionManager.getInstance().rollback();
//            //抛出异常,便于上层servlet捕获
//            throw e;
//    }
    }
}
