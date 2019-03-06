package qn131.entity;

import java.util.Date;

/**
 * 产品管理
 * 
 * @author 2673586749
 *
 */
public class Produce {
	
	//产品编号(主键)
	private String Produce_Code;
	
	//产品简介
	private String Produce_info;
	
	//产品明细
	private String Produce_info2;
	
	//产品封面图
	private String Produce_img;
	
	//产品状态   0:未上线   ;  1:上线中
	private String Produce_sytle;
	
	//产品发布时间
	private Date Produce_time;

	public String getProduce_Code() {
		return Produce_Code;
	}

	public void setProduce_Code(String Produce_Code) {
		this.Produce_Code = Produce_Code;
	}

	public String getProduce_info() {
		return Produce_info;
	}

	public void setProduce_info(String produce_info) {
		Produce_info = produce_info;
	}

	public String getProduce_info2() {
		return Produce_info2;
	}

	public void setProduce_info2(String produce_info2) {
		Produce_info2 = produce_info2;
	}

	public String getProduce_img() {
		return Produce_img;
	}

	public void setProduce_img(String produce_img) {
		Produce_img = produce_img;
	}

	public String getProduce_sytle() {
		return Produce_sytle;
	}

	public void setProduce_sytle(String produce_sytle) {
		this.Produce_sytle = produce_sytle;
	}

	public Date getProduce_time() {
		return Produce_time;
	}

	public void setProduce_time(Date produce_time) {
		this.Produce_time = produce_time;
	}
}
