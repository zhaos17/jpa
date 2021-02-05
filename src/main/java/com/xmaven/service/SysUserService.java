package com.xmaven.service;

import com.xmaven.model.SysUser;
import com.xmaven.util.PageQuery;
import org.springframework.data.domain.Page;

import java.util.List;

public interface  SysUserService {

    /**
     * 保存用户
     * @param user
     */
    public void save(SysUser user);

    /**
     * 删除用户
     * @param user
     */
    public void delete(SysUser user);

    /**
     * 查询全部用户
     * @return
     */
    public List<SysUser> findAll();

    /**
     * 查询分页数据
     * @return
     */
    public Page<SysUser> findPage(PageQuery pageQuery);
}
