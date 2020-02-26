package com.javapractice;
public interface A
{
public void bike(); 



}

class B
{
public void bike() 

{
	System.out.println("run-B");
	}

}

class D extends B implements A
{
	public void bike()
	{
		System.out.println("run2");
		}
	public void bike222()
	{
		System.out.println("fly2");
		}
}
