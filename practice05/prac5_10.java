package practice05;
abstract class PairMap{
protected String keyArray[]; //key���� �����ϴ� �迭
protected String valueArray[]; //value���� �����ϴ� �迭
abstract String get(String key); //key ���� ���� value ����, ������ null ����
abstract void put(String key, String value); //key�� value�� ������ ����,
//������ key�� ������ ���� value�� ����
abstract String delete(String key); //key ���� ���� ������(value�� �Բ�) ����. ������ value ����
abstract int length(); //���� ����� ������ ���� ����
}


class Dictionary extends PairMap {
	private int top;
	public Dictionary(int size)
	{
		keyArray = new String[size];
		valueArray = new String[size];
		top = 0;
	}
	
	String get(String key)
	{
		for(int i=0; i<keyArray.length;i++)
		{
			if(key.equals(keyArray[i]))
			{
				return valueArray[i];
			}
			

		}
		return null;
	}
	
	void put(String key, String value)
	{
		for(int i=0; i<keyArray.length;i++)
		{
			if(key.equals(keyArray[i]))
			{
				valueArray[i] = value;
				break;
			}
		}
		keyArray[top] = key;
		valueArray[top] = value;
		top++;
	}
	
	String delete(String key)
	{
		String s = null;
		for(int i=0;i<keyArray.length; i++)
		{
			if(key.equals(keyArray[i]))
			{
				s = valueArray[i];
				keyArray[i] = null;
				valueArray[i] = null;
			}
		}
		return s;
	}
	
	int length()
	{
		return top;
	}
	

}

public class prac5_10 {
public static void main(String[] args) {
Dictionary dic = new Dictionary(10);
dic.put("Ȳ����", "�ڹ�");
dic.put("���繮", "���̽�");
dic.put("���繮", "C++"); //���繮�� ���� C++�� ����
System.out.println("���繮�� ���� " + dic.get("���繮"));
System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
dic.delete("Ȳ����");
System.out.println("Ȳ������ ���� " + dic.get("Ȳ����")); //������ ������ ����
}
}



