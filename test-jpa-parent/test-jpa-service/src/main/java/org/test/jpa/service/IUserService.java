package org.test.jpa.service;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import org.test.jpa.entity.User;

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
 * <p>PackageName : org.test.jpa.service </p>
 * <p>ClassName   : IUserService.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2016年9月19日T上午10:30:15</p>
 *
 * @author Jacob
 * @version 1.0
 *
 */
public interface IUserService extends Serializable {

	public void add(User user);
	
	public List<?> queryAll();
	
}
