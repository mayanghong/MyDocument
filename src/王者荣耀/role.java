package ������ҫ;
import java.util.Scanner;
/**
 * @author �����
 */
import java.util.ArrayList;
import ������ҫ.map;
public abstract class role {
	public int x,y; //��ɫλ��
	public String name; //��ɫ��
	public int HP,MP,Exp;//�������� 
	public String direction;//��ɫ�ƶ�����
	public role(String _name,int _x,int _y,int _HP,int _MP,int _Exp)		//role��ʼ��
	{
		/**
		 *
		 * @return
		 */
		name=_name;
		x=_x;
		y=_y;
		HP=_HP;
		MP=_MP;
		Exp=_Exp;
	}
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
}