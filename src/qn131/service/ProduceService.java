package qn131.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import qn131.dao.ProduceDao;
import qn131.entity.Produce;
import qn131.mybatis.SqlFactory;

public class ProduceService {
	// ���
	public int add(Produce obj) {// ģ�⵽ǰ��
		SqlSession session = SqlFactory.getSqlSession();
		try {
			ProduceDao dao = session.getMapper(ProduceDao.class);
			int rs = dao.add(obj);
			session.commit();
			return rs;
		} finally {
			session.close();
		}
	}

	// �������
	public int addVast(List<Produce> obj) {// ģ�⵽ǰ��
		SqlSession session = SqlFactory.getSqlSession();
		try {
			ProduceDao dao = session.getMapper(ProduceDao.class);
			int rs = dao.addVast(obj);
			session.commit();
			return rs;
		} finally {
			session.close();
		}
	}
	
	
	// ����ɾ��
	public int delVast(List<String> id) {// ģ�⵽ǰ��
		SqlSession session = SqlFactory.getSqlSession();
		try {
			ProduceDao dao = session.getMapper(ProduceDao.class);
			int rs = dao.dell(id);
			session.commit();
			return rs;
		} finally {
			session.close();
		}
	}
	

	// ����
	public int update(Produce obj) {// ģ�⵽ǰ��
		SqlSession session = SqlFactory.getSqlSession();
		try {
			ProduceDao dao = session.getMapper(ProduceDao.class);
			int rs = dao.update(obj);
			session.commit();
			return rs;
		} finally {
			session.close();
		}
	}

	// ��ѯ
	public List<Produce> selectAll() {// ģ�⵽ǰ��
		SqlSession session = SqlFactory.getSqlSession();
		try {
			ProduceDao dao = session.getMapper(ProduceDao.class);
			return dao.select();
		} finally {
			session.close();
		}
	}

	// �������
	public static Produce getProduce(int i) {
		Produce obj = new Produce();
		obj.setProduce_Code("1" + i);
		obj.setProduce_img("img" + i);
		obj.setProduce_info("info" + i);
		obj.setProduce_info2("info2" + i);
		obj.setProduce_sytle("" + i);
		obj.setProduce_time(new Date());
		return obj;
	}
	

	// ����������servlet����service (ģ��servlet)
	public static void main(String[] args) {
		ProduceService service = new ProduceService();
		
		List<String> list = new ArrayList<String>();
		
		
		
		
		int i = service.delVast(list);
		System.out.println("ɾ�����:"+i);
		
		
//		List<Produce> list = new ArrayList<>();
//		list.add(getProduce(2));
//		list.add(getProduce(3));
//		int i = service.addVast(list);
//		System.out.println("���º�Ľ��:" + i);

//��ѯ		
//		List<Produce> list = service.selectAll();
//		for(Produce obj : list) {
//			System.out.println(obj.getProduce_Code());
//			System.out.println(obj.getProduce_info());
//			System.out.println(obj.getProduce_info3());
//			System.out.println(obj.getProduce_img());
//			System.out.println(obj.getProduce_sytle());
////			System.out.println(obj.getProduce_time());
//			System.out.println("");
//			
//		}

//���		
//			Produce obj = new Produce();
//			obj.setProduce_Code("absc");
//			obj.setProduce_img("img");
//			obj.setProduce_info("info2");
//			obj.setProduce_info3("ss");
//			obj.setProduce_sytle("1");
//			obj.setProduce_time(new Date());
//			
//			System.out.println(service.add(obj));

	}

}
