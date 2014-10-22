package com.example.capstonegame;

class Weapon
{
	private int Damage;
	private int Type;
	private int[] Sockets;
	
	public int getDamage() {
		return Damage;
	}
	
	public int getType() {
		return Type;
	}
	
	public int[] getSockets() {
		return Sockets;
	}
	
	public void setDamage(int i) {
		Damage = i;
	}
	
	public void setType(int i) {
		Type = i;
	}
	
	public void setSockets(int[] i)
	{
		Sockets = i;
	}
}