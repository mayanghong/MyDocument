package 王者荣耀;
import java.util.Scanner;
import 王者荣耀.role;
public class map{	
	int m=30;
	int n=30;
	String [][]field=new String[m][n];
	public void getstring()
	{
	for(int i=0;i<30;i++)
		for(int j=0;j<30;j++)
			field[i][j]="0";
	field[5][5]="#";
	field[5][25]="#";
	field[25][5]="#";
	field[25][25]="#";	
	}
	public void display()
	{
		for(int i=0;i<30;i++)
		{
			for(int j=0;j<30;j++)
				System.out.print(field[i][j]);
			System.out.println();
		}
		System.out.println();
	}
	public void rolemove(String name,String a,int x,int y)//角色名，指令，位置
	{
		if(a=="up")
		{
			if(x>0)
			{
				field[x-1][y]=name;
				field[x][y]="0";
			}
		}
		if(a=="down")
		{
			if(x<29)
			{
				field[x+1][y]=name;
				field[x][y]="0";
			}
		}
		if(a=="left")
		{
			if(y>0)
			{
				field[x][y-1]=name;
				field[x][y]="0";
			}
		}
		if(a=="right")
		{
			if(y<29)
			{
				field[x][y+1]=name;
				field[x][y]="0";
			}
		}
			
	}
	public static void main(String[] args) {
		role s=new role();
		//s.role(name, x, y, HP, MP, Exp, direction);//改
		s.x=10;
		s.y=10;
		s.direction="up";
		s.name="A";
		map p=new map();
		p.getstring();
		p.display();
		p.rolemove(s.name,s.direction, s.x, s.y);
		p.display();
}
}
	