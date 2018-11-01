package 王者荣耀;
import java.util.Scanner;
/**
 * @author 马扬鸿
 */
import java.util.ArrayList;
import 王者荣耀.map;
public abstract class role {
	public int x,y; //角色位置
	public String name; //角色名
	public int HP,MP,Exp;//基本属性 
	public String direction;//角色移动方向
	public role(String _name,int _x,int _y,int _HP,int _MP,int _Exp)		//role初始化
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