
import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class CCF_¯ʯ��˵ {
	/**
	 * @author SZU_�����,2017192022
	 * {@code text}
	 * @see role
	 * @see action
	 * @see dieOfRetinue
	 * @see result
	 * @since 5 October 2018
	 */
	//ʹ��List������ҵĽ�ɫ���������Ӻ����������ӳ����Ƴ��������𵽷ǳ���������á�

	public static List<role> p1 = new ArrayList<>();//�������

	public static List<role> p2 = new ArrayList<>();//�������

	 // ���ⶨ������ָ��p1,p2 �����ã����ڽ����غϺ� p1��Ȼ��ʾ������ң�p2Ϊ�������

	public static List<role> firstAttack;

	public static List<role> lastAttack;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		firstAttack = p1;

		lastAttack = p2;

		role hero1 = new role(0, 30);

		role hero2 = new role(0, 30);

		//��Ӣ����ӵ�0λ��

		p1.add(hero1);

		p2.add(hero2);

		int n = Integer.parseInt(scanner.nextLine());

		String[] cmd;

		String temp;

		for (int i = 0; i < n; i++) {

			temp = scanner.nextLine() + " ";//��ÿ��ָ��ĩβ����һ���ո񣬱��������split()�����ָ��ַ�����cmd������

			cmd = temp.split(" ");//ÿ��ָ��ո�ָ�ɼ�����

			if (cmd.length == 4) {//��ʾ�ٻ���ӵ�ָ��(summon��λ�á�������������ֵ������������Ϊ4)

				action(cmd[0], Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]), Integer.parseInt(cmd[3]));

			} else if (cmd.length == 3) {//������ָ��(attack������λ�á��Է�λ�ã�����������Ϊ3)

				action(cmd[0], Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]), 0);

			} else {//�������endָ��  �����غ�

				action(cmd[0], 0, 0, 0);

			}

		}

		//�ж����ֻ�ʤ���Ǻ���

		if (p1.get(0).health <= 0)

			System.out.println(-1);

		else {

			if (p2.get(0).health > 0)

				System.out.println(0);

			else

				System.out.println(1);

		}

		//���˫�����

		result(p1);

		result(p2);

		scanner.close();

	}

	/*

	 * action���������Ƕ�ÿ��ָ����Ϊ��Ӧ����

	 * ��Ϊ�ٻ����ָ��ʱ:operate:summon,a:��ʲôλ���ٻ����,b:��������c:����ֵ

	 * ��Ϊ����ָ��ʱ:operate:attack��a:����λ�ã�b:�Է�λ�ã�c:����ֵΪ0��ֻ��Ϊ����������ָ��

	 * ��Ϊendָ��:operate:end   ����a��b��c����ֵ��Ϊ0��ֻ������������ָ��

	 */

	public static void action(String operate, int a, int b, int c) {

		if (operate.equals("summon"))

			firstAttack.add(a, new role(b, c));//�ٻ�һ�����

		else if (operate.equals("attack")) {

			//��������������ֵ����

			firstAttack.get(a).health -= lastAttack.get(b).attack;

			lastAttack.get(b).health -= firstAttack.get(a).attack;

			dieOfRetinue();//ÿ�ι�����󶼱����ж�˫�����Ƿ����������

		} else {

			//ͨ��firstAttack��lastAttack����˫�����Ӷ�p1һֱ�����֣�p2һֱ�Ǻ��֣�������Ϊ�������ı�

			List<role> t;

			t = firstAttack;

			firstAttack = lastAttack;

			lastAttack = t;

		}

 

	}

	/*

	 * �ж��Ƿ��������������������������Ƴ���λ�õ����

	 */

	public static void dieOfRetinue() {

		for (int i = 1; i < p1.size(); i++) {

			if (p1.get(i).health <= 0)//�ҵ�����ֵС�ڵ���0����ӵ�λ��

				p1.remove(i);//�Ƴ��������

		}

		for (int j = 1; j < p2.size(); j++) {

			if (p2.get(j).health <= 0)

				p2.remove(j);

		}

	}

	/*

	 * ������˫����ɫ�Ľ��

	 */

	public static void result(List<role> L) {

		System.out.println(L.get(0).health);//���Ӣ������ֵ

		System.out.print(L.size() - 1 + " ");//���ʣ�����

		if (L.size() > 1) {//����ӵ�ʱ�����ÿ���������ֵ

			for (int i = 1; i < L.size(); i++)

				System.out.print(L.get(i).health + " ");

			System.out.println();

		} else {//��Ӷ�����

			System.out.println();

		}

	}

 

}

/**

 * �����ɫ������ɫ������ֵ�͹�������װ��role

 */

class role {

	public int health;

	public int attack;

	public role(int a, int h) {

		health = h;

		attack = a;

	}

}
