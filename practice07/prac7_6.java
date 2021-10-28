package practice07;
import java.util.*;

class Location {
private String name;
private int longitude, latitude; //�浵, ����
public Location(String name, int longitude, int latitude) {
this.name = name;
this.longitude = longitude;
this.latitude = latitude;
}
public String getName() {
return name;
}
public int getLongitute() {
return longitude;
}
public int getLatitude() {
return latitude;
}
}


public class prac7_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Location> info = new HashMap<String, Location>();
		System.out.println("����, �浵, ������ �Է��ϼ���.");
		for(int i = 0; i < 4; i++) {
		System.out.print(">> ");
		String text = sc.nextLine();
		StringTokenizer st = new StringTokenizer(text, ",");
		String name = st.nextToken().trim();
		int longitude = Integer.parseInt(st.nextToken().trim());
		int latitude = Integer.parseInt(st.nextToken().trim());
		Location location = new Location(name, longitude, latitude);
		info.put(name, location);
		}
		Set<String> key = info.keySet(); //�ؽø� info�� �ִ� ��� Ű Set �÷������� ����
		Iterator<String> it = key.iterator(); //Set�� �����˻��ϴ� ���ͷ����� ����
		System.out.println("---------------------------");
		while (it.hasNext()) {
		String name = it.next();
		Location location = info.get(name); //�̸��� Ű�� �Ͽ� ��ü�� ��´�.
		System.out.print(location.getName() + " ");
		System.out.print(location.getLongitute() + " ");
		System.out.println(location.getLatitude() + " ");
		}
		System.out.println("---------------------------");
		while(true) {
		System.out.print("���� �̸� >> ");
		String name = sc.nextLine();
		if(name.equals("�׸�")) break;
		Location location = info.get(name); // �ؽøʿ��� �̸��� Ű�� �˻�
		if(location == null) { // �̸��� �ؽøʿ� ���ٸ�
		System.out.println(name + "�� �����ϴ�.");
		}
		else { // �ؽøʿ��� �˻��� Student ��ü
		System.out.print(location.getName() + " ");
		System.out.print(location.getLongitute() + " ");
		System.out.println(location.getLatitude());
		}
		}
		sc.close();
		}


}
