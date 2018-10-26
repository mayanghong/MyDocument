package Main;
import java.util.Scanner;
import 王者荣耀.map;
import 王者荣耀.role;
import 角色.ADC;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
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
