package com.xmaven.dao;

import com.xmaven.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface SysUserDao extends JpaRepository<SysUser,Long>, Serializable, JpaSpecificationExecutor<SysUser> {
}
