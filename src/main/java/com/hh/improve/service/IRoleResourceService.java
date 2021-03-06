package com.hh.improve.service;


import com.hh.improve.entity.RoleResource;

import java.util.List;

public interface IRoleResourceService extends IBaseService<RoleResource>{
	/**
	 * 根据角色编码，查询其父角色所拥有的资源
	 * @param roleCode
	 * @return
	 */
	List<RoleResource> queryParentRoleResByRoleCode(String roleCode);
	/**
	 * 根据角色编码，查询其后=后代角色所拥有的资源
	 * @param roleCode
	 * @return
	 */
	List<RoleResource> queryChildrenRoleResByRoleCode(String roleCode);
}
