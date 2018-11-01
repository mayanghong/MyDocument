package 王者荣耀;
import java.util.Scanner;

import 王者荣耀.role;
import 角色.ADC;
/**
 * 王者荣耀地图实现   <br>
 *@author szu马扬鸿
 *@version 3.0
 *@update [2018-10-23】
 *homework.java
 */

public class map{	
	int m=20;
	int n=40;
	String [][]field=new String[m][n];
	public void getstring()							//地图的初始化（包含角色的位置）
	{
	for(int i=0;i<20;i++)
		for(int j=0;j<40;j++)
			field[i][j]="😂";
	for(int i=5;i<=7;i++)
		for(int j=5;j<=10;j++)
			field[i][j]="❤";
	for(int i=5;i<=7;i++)
		for(int j=30;j<=35;j++)
			field[i][j]="❤";
	for(int i=13;i<=15;i++)
		for(int j=5;j<=10;j++)
			field[i][j]="❤";
	for(int i=13;i<=15;i++)
		for(int j=30;j<=35;j++)
			field[i][j]="❤";	
	field[1][12]="🐷";
	field[1][27]="🐷";
	field[2][15]="👌";
	field[2][24]="👌";
	field[18][12]="✋";
	field[18][27]="🐷";
	field[17][15]="💧";
	field[17][24]="🈲";
	}

	
	public void displaymap()							//打印地图
	{
		/**
		 *
		 * this method display the first map.
		 * @return
		 */
		for(int i=0;i<20;i++)
		{
			for(int j=0;j<40;j++)
				System.out.print(field[i][j]);
			System.out.println();
		}
		System.out.println();
	}
	
	public void displayrolemap(role r)
	{
		/**
		 * this method display the map after the role move.
		 * @param r
		 * 
		 */
		for(int i=0;i<20;i++)
		{
			for(int j=0;j<40;j++)
				System.out.print(field[i][j]);
			System.out.println();
		}
		System.out.println();
	}
		public void displayrole(role r)						//打印角色属性
	{
		/**
		 * this method show the role .
		 * @param r
		 */
		System.out.println("角色名："+r.name);
		System.out.println("经验值："+r.Exp);
		System.out.println("HP值："+r.HP);
		System.out.println("MP值："+r.MP);
		System.out.println("角色位置：("+r.x+","+r.y+")");
	}
	
	public role rolemove(role r)						//角色移动(每次移动一步)
	{
		/**
		 * 
		 * @param r
		 * @return
		 */
		String str1="up",str2="down",str3="left",str4="right";
		
		if(r.direction.equals(str1))
		{
			if(r.x>0&&field[r.x-1][r.y]!="❤")
			{
				field[r.x-1][r.y]=r.name;
				field[r.x][r.y]="😂";
				r.x--;
			}
		}
		if(r.direction.equals(str2))
		{
			if(r.x<29&&field[r.x+1][r.y]!="❤")
			{
				field[r.x+1][r.y]=r.name;
				field[r.x][r.y]="😂";
				r.x++;
			}
		}
		if(r.direction.equals(str3))
		{
			if(r.y>0&&field[r.x][r.y-1]!="❤")
			{
				field[r.x][r.y-1]=r.name;
				field[r.x][r.y]="😂";
				r.y--;
			}
		}
		if(r.direction.equals(str4))
		{
			if(r.y<29&&field[r.x][r.y+1]!="❤")
			{
				field[r.x][r.y+1]=r.name;
				field[r.x][r.y]="😂";
				r.y++;
			}
		}
		return r;
			
	}
	
}
	