package com.example.bxj.model;

public class Goods {
	private int img;
	// ����
	private String title;
	// ����
	private String description;
	// ʱ��
	private String time;

	// getter �� setter
	public int getImg() {
		return img;
	}

	public void setImg(int img) {
		this.img = img;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Item [img=" + img + ", title=" + title + ", description="
				+ description + ", time=" + time + "]";
	}

}
