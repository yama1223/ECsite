package com.internousdev.hukusyuu2.dto;

public class BuyItemDTO {
	
	private int id;
	private String itemName;
	private String itemPrice;
	private String selectItem;
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public String getItemName(){
		return itemName;
	}
	
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	
	public String getItemPrice(){
		return itemPrice;
	}
	
	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}
	
	public String getSelectItem(){
		return selectItem;
	}
	
	public void setSelectItem(String selectItem){
		this.selectItem = selectItem;
	}
}
