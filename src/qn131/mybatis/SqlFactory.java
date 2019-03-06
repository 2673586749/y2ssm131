package qn131.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 
 * 类似BaseDao
 * 
 * @author 2673586749
 *
 */
public class SqlFactory {
	private final static SqlSessionFactory sqlSessionFactory;
	
	static{
		String resource = "config/mybatis-config.xml";
		InputStream inputStream;
		SqlSessionFactory temp = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			temp =new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = temp;
	}
	
	//【等价于】 Connection
	public static SqlSession getSqlSession() {
		return sqlSessionFactory.openSession();
	}
}
