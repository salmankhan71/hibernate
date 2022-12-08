package com.gufran; 

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String barand;
	private int price;
	@ManyToOne
	private Alien alien;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBarand() {
		return barand;
	}
	public void setBarand(String barand) {
		this.barand = barand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Alien getAlien() {
		return alien;
	}
	public void setAlien(Alien alien) {
		this.alien = alien;
	}
	public Laptop(int lid, String barand, int price, Alien alien) {
		super();
		this.lid = lid;
		this.barand = barand;
		this.price = price;
		this.alien = alien;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", barand=" + barand + ", price=" + price + ", alien=" + alien + "]";
	}
	
	

}
