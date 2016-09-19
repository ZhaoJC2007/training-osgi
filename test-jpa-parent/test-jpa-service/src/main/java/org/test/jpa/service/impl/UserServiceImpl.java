package org.test.jpa.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.test.jpa.entity.User;
import org.test.jpa.service.IUserService;

/** Copyright @ 2007, ST Electronics Info-comm Systems PTE. LTD
 * All rights reserved.
 *
 * This software is confidential and proprietary property of 
 * ST Electronics Info-comm Systems PTE. LTD.
 * The user shall not disclose the contents of this software and shall
 * only use it in accordance with the terms and conditions stated in
 * the contract or licence agreement with ST Electronics Info-comm Systems PTE. LTD.
 *
 * Project Name : test-jpa-service
 * <p>PackageName : org.test.jpa.service.impl </p>
 * <p>ClassName   : UserServiceImpl.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2016年9月19日T上午10:34:27</p>
 *
 * @author Jacob
 * @version 1.0
 *
 */
public class UserServiceImpl implements IUserService{
	private static final long serialVersionUID = 1L;
	public EntityManager entityManager;
	public void add(User user) {
		entityManager.persist(user);
	}

	public List<?> queryAll() {
		Query query = entityManager.createQuery("select a from User a");
		return query.getResultList();
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
