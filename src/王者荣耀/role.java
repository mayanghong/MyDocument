package ������ҫ;
import java.util.Scanner;
import java.util.ArrayList;
import ������ҫ.map;
public class role {
	public int x,y; //��ɫλ��
	public String name; //��ɫְҵ
	public int HP,MP,Exp;//�������� 
	public String direction;//��ɫ�ƶ�����
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
	public void up() {				//��ɫ�ƶ�
	}
	public void down(){
	}
	public void left(){
	} 
	public void right(){ 	
	}
}