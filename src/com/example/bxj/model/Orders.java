package com.example.bxj.model;

import java.util.Date;

public class Orders {
	private int oid;//����Id
	private String ophone;//�������ĵ绰
	private Date otime;//����ʱ��
	private int oamount;//��������
	private float oprice;//�����۸�
	private Good good;//��Ʒ
	private Customer customer;//�˿�
	private int ostate;
	
	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOphone() {
		return ophone;
	}

	public void setOphone(String ophone) {
		this.ophone = ophone;
	}

	public Date getOtime() {
		return otime;
	}

	public void setOtime(Date otime) {
		this.otime = otime;
	}

	public int getOamount() {
		return oamount;
	}

	public void setOamount(int oamount) {
		this.oamount = oamount;
	}

	public float getOprice() {
		return oprice;
	}

	public void setOprice(float oprice) {
		this.oprice = oprice;
	}

	public Good getGood() {
		return good;
	}

	public void setGood(Good good) {
		this.good = good;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getOstate() {
		return ostate;
	}

	public void setOstate(int ostate) {
		this.ostate = ostate;
	}

	public Orders(int oid, String ophone, Date otime, int oamount,
			float oprice, Good good, Customer customer, int ostate) {
		super();
		this.oid = oid;
		this.ophone = ophone;
		this.otime = otime;
		this.oamount = oamount;
		this.oprice = oprice;
		this.good = good;
		this.customer = customer;
		this.ostate = ostate;
	}

	public Orders() {
		super();
	}
	
}
