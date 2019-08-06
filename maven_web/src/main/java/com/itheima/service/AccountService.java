package com.itheima.service;


import java.util.List;

import com.itheima.domain.Account;

public interface AccountService {

    // 查询所有账户
    public List<Account> findAll();

    // 保存帐户信息
    public void saveAccount(Account account);

}
