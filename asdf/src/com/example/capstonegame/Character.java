package com.example.capstonegame;

class Character {
	// Character Stats & Info
	private String Name;
	private boolean Gender;		// Male = 0; Female = 1
	private int Health;
	private int Level;
	private int Experience;
	private int Gold;
	private int STR;
	private int DEX;
	private int INT;
	private int ColorAffinity;	
	
	// Character Inventory
	// private Equipment[] inventory;
	
	Character(String name, boolean gender, int hp, int lv, int exp, int gold, int str, int dex, int intel, int color) {
		Name = name;
		Gender = gender;
		Health = hp;
		Level = lv;
		Experience = exp;
		Gold = gold;
		STR = str;
		DEX = dex;
		INT = intel;
		ColorAffinity = color;
	}
	
	// Utility Methods/Functions
	public String getName() {
		return Name;
	}
	
	public boolean getGender() {
		return Gender;
	}
	
	public int getHealth() {
		return Health;
	}
	
	public int getLevel() {
		return Level;
	}
	
	public int getExperience() {
		return Experience;
	}
	
	public int getGold() {
		return Gold;
	}
	
	public int getSTR() {
		return STR;
	}
	
	public int getDEX() {
		return DEX;
	}
	
	public int getINT() {
		return INT;
	}
	
	public int getColorAffinity() {
		return ColorAffinity;
	}
	
	public void setName(String n) {
		Name = n;
	}
	
	public void setName(boolean b) {
		Gender = b;
	}
	
	public void setHealth(int i) {
		Health = i;
	}
	
	public void setLevel(int i) {
		Level = i;
	}
	
	public void setExperience(int i) {
		Experience = i;
	}
	
	public void setGold(int i) {
		Gold = i;
	}
	
	public void setSTR(int i) {
		STR = i;
	}
	
	public void setDEX(int i) {
		DEX = i;
	}
	
	public void setINT(int i) {
		INT = i;
	}
	
	public void setColorAffinity(int i) {
		ColorAffinity = i;
	}
}