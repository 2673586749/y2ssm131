package qn131.dao;

import java.util.List;

import qn131.entity.Produce;

public interface ProduceDao {

	/**
	 * 更新对象
	 * @param obj
	 * @return
	 */
	int update(Produce obj);
	
	
	
	/**
	 *添加一条记录到 数据库表中
	 *
	 * @param obj
	 * @return
	 */
	int add(Produce obj);
	
	

	/**
	 * 批量添加
	 * @param obj List
	 * @return int
	 */
	int addVast(List<Produce> list);
	
	/**
	 * 批量删除
	 * @param id
	 * @return
	 */
	int dell(List<String> id);
	
	/**
	 *查询全部
	 * 
	 * @param 
	 * @return
	 */
	List<Produce> select();
	
	

	/**
	 *查询全部
	 * 
	 * @param 
	 * @return
	 */
	List<Produce> select2();
}