package com.xmaven.test;

import com.google.common.collect.Lists;
import com.xmaven.model.SysUser;
import com.xmaven.service.SysUserService;
import com.xmaven.util.ListsUtils;
import com.xmaven.util.PageQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author: zhaos
 * @date: 2021/1/5
 */
@SpringBootTest
public class UserTest {

    @Autowired
    private SysUserService sysUserService;

    @Test
    void saveTest() {
        SysUser sysUser = new SysUser();
        sysUser.setName("zhaos1");
        sysUser.setEmail("zhaos@163.com");
        sysUser.setPassword("123456");
        sysUserService.save(sysUser);
    }

    @Test
    void findAllTest() {
        List<SysUser> all = sysUserService.findAll();
        System.out.println(all);
    }

    @Test
    void deleteTest() {
        SysUser sysUser = new SysUser();
        sysUser.setId(1L);
//        sysUser.setName("zhaos1");
//        sysUser.setEmail("zhaos@163.com");
//        sysUser.setPassword("123456");
        sysUserService.delete(sysUser);
    }

    @Test
    void pageTest() {
        PageQuery pageQuery = new PageQuery();
        pageQuery.setPage(0);
        pageQuery.setSize(10);
        Page<SysUser> obj = sysUserService.findPage(pageQuery);
        List<SysUser> sysUsers = obj.getContent();
        System.out.println(sysUsers);
    }

}
