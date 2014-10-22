package com.example.capstonegame;

// Equipment will consist of types of items that are 
// found in the Player's inventory (Weapons and Support Gems).
class Equipment
{
	private int id;
	private String name;
	private String description;
	
	public int getID()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setID(int i)
	{
		id = i;
	}
	public void setName(String s)
	{
		name = s;
	}
	
	public void setDescription(String s)
	{
		description = s;
	}
}