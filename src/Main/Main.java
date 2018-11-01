package Main;
import java.util.Scanner;
import 王者荣耀.map;
import 王者荣耀.role;
import 角色.ADC;
import 角色.AP;
import 角色.Cike;
import 角色.Fuzhu;
import 角色.Zhanshi;
/**
 * 
 * @author 马扬鸿,2017192022
 *{@link Main}
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,movetime;
		map p=new map();
		p.getstring();									//地图初始化
		p.displaymap();									//打印地图
		String R=sc.next();							//角色名，判断哪个移动
		String R1="🐷";
		String R2="👌";
		String R3="💧";
		String R4="🈲";
		String R5="✋";
		if(R.equals(R1))										//R1==猪头，AP;
		{
			role ap=new AP(R,1,12,100,100,0);			//构建AP;
			movetime=sc.nextInt();						//移动次数
			String Movedirection[]=new String[movetime];	//移动指令
			int dis[]=new int[movetime];					//每次移动距离
			for(i=0;i<movetime;i++)
			{
			
				Movedirection[i]=sc.next();
				dis[i]=sc.nextInt();
				ap.direction=Movedirection[i];
				for(int j=0;j<dis[i];j++)
				{
					ap=p.rolemove(ap);						//角色移动
					p.displayrolemap(ap);					//角色移动后地图
					p.displayrole(ap);					//角色属性
				}
			}
			
		}
		else if(R.equals(R2))
		{
			role zhanshi=new Zhanshi(R,2,15,200,150,0);	
			movetime=sc.nextInt();						//移动次数
			String Movedirection[]=new String[movetime];	//移动指令
			int dis[]=new int[movetime];					//每次移动距离
			for(i=0;i<movetime;i++)
			{
			
				Movedirection[i]=sc.next();
				dis[i]=sc.nextInt();
				zhanshi.direction=Movedirection[i];
				for(int j=0;j<dis[i];j++)
				{
					zhanshi=p.rolemove(zhanshi);						//角色移动
					p.displayrolemap(zhanshi);					//角色移动后地图
					p.displayrole(zhanshi);					//角色属性
				}
			}
		}
		else if(R.equals(R3))
		{
			role ad=new ADC(R,17,12,100,0,0);	
			movetime=sc.nextInt();						//移动次数
			String Movedirection[]=new String[movetime];	//移动指令
			int dis[]=new int[movetime];					//每次移动距离
			for(i=0;i<movetime;i++)
			{
			
				Movedirection[i]=sc.next();
				dis[i]=sc.nextInt();
				ad.direction=Movedirection[i];
				for(int j=0;j<dis[i];j++)
				{
					ad=p.rolemove(ad);						//角色移动
					p.displayrolemap(ad);					//角色移动后地图
					p.displayrole(ad);					//角色属性
				}
			}
		}
		else if(R.equals(R4))
		{
			role ck=new Cike(R,17,24,100,100,0);
			movetime=sc.nextInt();						//移动次数
			String Movedirection[]=new String[movetime];	//移动指令
			int dis[]=new int[movetime];					//每次移动距离
			for(i=0;i<movetime;i++)
			{
			
				Movedirection[i]=sc.next();
				dis[i]=sc.nextInt();
				ck.direction=Movedirection[i];
				for(int j=0;j<dis[i];j++)
				{
					ck=p.rolemove(ck);						//角色移动
					p.displayrolemap(ck);					//角色移动后地图
					p.displayrole(ck);					//角色属性
				}
			}
		}
		else
		{
			role fuzhu=new Fuzhu(R,18,12,200,100,0);
			movetime=sc.nextInt();						//移动次数
			String Movedirection[]=new String[movetime];	//移动指令
			int dis[]=new int[movetime];					//每次移动距离
			for(i=0;i<movetime;i++)
			{
			
				Movedirection[i]=sc.next();
				dis[i]=sc.nextInt();
				fuzhu.direction=Movedirection[i];
				for(int j=0;j<dis[i];j++)
				{
					fuzhu=p.rolemove(fuzhu);						//角色移动
					p.displayrolemap(fuzhu);					//角色移动后地图
					p.displayrole(fuzhu);					//角色属性
				}
			}
		}
}

}
