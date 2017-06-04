package com.example.bxj.model;

public class Good {
	private int gid;// ��Ʒid
	private String gname;// ��Ʒ����
	private float gtuan;// �Ź���
	private float gmen;// �ŵ��
	private int gsold;// ����
	private float gscore;// ��Ʒ����
	private String gcombo;// �ײ;���
	private String gnotice;// ע������
	private Seller seller;// ���
	private String gphoto;// ��ƷͼƬ

	public Good() {
		super();
		
	}

	public Good(int gid, String gname, float gtuan, float gmen, int gsold,
			float gscore, String gcombo, String gnotice, Seller seller,
			String gphoto) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gtuan = gtuan;
		this.gmen = gmen;
		this.gsold = gsold;
		this.gscore = gscore;
		this.gcombo = gcombo;
		this.gnotice = gnotice;
		this.seller = seller;
		this.gphoto = gphoto;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGphoto() {
		return gphoto;
	}

	public void setGphoto(String gphoto) {
		this.gphoto = gphoto;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public float getGtuan() {
		return gtuan;
	}

	public void setGtuan(float gtuan) {
		this.gtuan = gtuan;
	}

	public float getGmen() {
		return gmen;
	}

	public void setGmen(float gmen) {
		this.gmen = gmen;
	}

	public int getGsold() {
		return gsold;
	}

	public void setGsold(int gsold) {
		this.gsold = gsold;
	}

	public float getGscore() {
		return gscore;
	}

	public void setGscore(float gscore) {
		this.gscore = gscore;
	}

	public String getGcombo() {
		return gcombo;
	}

	public void setGcombo(String gcombo) {
		this.gcombo = gcombo;
	}

	public String getGnotice() {
		return gnotice;
	}

	public void setGnotice(String gnotice) {
		this.gnotice = gnotice;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

}
