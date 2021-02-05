package com.xmaven.service.impl;

import com.xmaven.dao.SysUserDao;
import com.xmaven.model.SysUser;
import com.xmaven.service.SysUserService;
import com.xmaven.util.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public void save(SysUser user) {
        sysUserDao.save(user);
    }

    @Override
    public void delete(SysUser user) {
        sysUserDao.delete(user);
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserDao.findAll();
    }

    @Override
    public Page<SysUser> findPage(PageQuery pageQuery) {
        return sysUserDao.findAll(PageRequest.of(pageQuery.getPage(), pageQuery.getSize()));
    }

}
