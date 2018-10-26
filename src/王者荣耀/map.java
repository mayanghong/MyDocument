package 王者荣耀;
import java.util.Scanner;
import 王者荣耀.role;
import 角色.ADC;
public class map{	
	int m=20;
	int n=40;
	String [][]field=new String[m][n];
	public void getstring()
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
	}
	public void displaymap()//打印战场
	{
		for(int i=0;i<20;i++)
		{
			for(int j=0;j<40;j++)
				System.out.print(field[i][j]);
			System.out.println();
		}
		System.out.println();
	}
	public void displayrole(role r)//打印角色属性
	{
		System.out.println("角色名："+r.name);
		System.out.println("经验值："+r.Exp);
		System.out.println("HP值："+r.HP);
		System.out.println("HP值："+r.HP);
		System.out.println("角色位置：("+r.x+","+r.y+")");
	}
	public void rolemove(role r)//角色名，指令，位置
	{
		if(r.direction=="up")
		{
			if(r.x>0&&field[r.x-1][r.y]!="❤")
			{
				field[r.x-1][r.y]=r.name;
				field[r.x][r.y]="😂";
				r.x--;
			}
		}
		if(r.direction=="down")
		{
			if(r.x<29&&field[r.x+1][r.y]!="❤")
			{
				field[r.x+1][r.y]=r.name;
				field[r.x][r.y]="😂";
				r.x++;
			}
		}
		if(r.direction=="left")
		{
			if(r.y>0&&field[r.x][r.y-1]!="❤")
			{
				field[r.x][r.y-1]=r.name;
				field[r.x][r.y]="😂";
				r.y--;
			}
		}
		if(r.direction=="right")
		{
			if(r.y<29&&field[r.x][r.y+1]!="❤")
			{
				field[r.x][r.y+1]=r.name;
				field[r.x][r.y]="😂";
				r.y++;
			}
		}
			
	}
	public static void main(String[] args) {
		role s=new ADC();
		//s.role(name, x, y, HP, MP, Exp, direction);//改
		s.x=10;
		s.y=10;
		s.direction="up";
		s.name="🐷";
		map p=new map();
		p.getstring();
		p.displaymap();
		p.rolemove(s);
		p.displaymap();
		p.displayrole(s);
}
}
	