package com.example.bxj.model;

public class Seller {
	private int sid;//id
	private String sphone;//��½�绰
	private String spass;//����
	private String sname;//�������
	private String sadd;//��ҵ�ַ
	private float sscore;//�������
	private String sphoto;//���ͼƬ
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getSpass() {
		return spass;
	}
	public void setSpass(String spass) {
		this.spass = spass;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public float getSscore() {
		return sscore;
	}
	public void setSscore(float sscore) {
		this.sscore = sscore;
	}
	public String getSphoto() {
		return sphoto;
	}
	public void setSphoto(String sphoto) {
		this.sphoto = sphoto;
	}
	public Seller(String sphone, String spass) {
		super();
		this.sphone = sphone;
		this.spass = spass;
	}
	public Seller(int sid, String sphone, String spass, String sname,
			String sadd, float sscore, String sphoto) {
		super();
		this.sid = sid;
		this.sphone = sphone;
		this.spass = spass;
		this.sname = sname;
		this.sadd = sadd;
		this.sscore = sscore;
		this.sphoto = sphoto;
	}
	public Seller() {
		super();
	}
	
}
