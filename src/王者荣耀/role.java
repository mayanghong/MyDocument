package 王者荣耀;
import java.util.Scanner;
import java.util.ArrayList;
import 王者荣耀.map;
public class role {
	public int x,y; //角色位置
	public String name; //角色职业
	public int HP,MP,Exp;//基本属性 
	public String direction;//角色移动方向
	public void role(String name,int x,int y,int HP,int MP,int Exp,String direction)
	{
		this.name=name;
		this.x=x;
		this.y=y;
		this.HP=HP;
		this.MP=MP;
		this.Exp=Exp;
		this.direction=direction;
	}
	public void up() {				//角色移动
	}
	public void down(){
	}
	public void left(){
	} 
	public void right(){ 	
	}
}