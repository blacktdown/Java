package sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ��¥ : 2020/11/18
 * �̸� : ���ؿ�
 * ���� : Collection set �ǽ��ϱ� ���� p357
 */
public class SetTest {
	public static void main(String[] args) {
		
		//Set ������ ������ ����
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(7);
		set.add(5);
		
		//Set ���� ����
		System.out.println("set ���� ���� : " +set.size());
		
		//Set ���� ���(�ݺ��ڸ� �̿� : Iterator)
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println("���� : " + iter.next());
		}
		
	}

}
