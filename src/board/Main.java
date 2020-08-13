package board;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ids = new ArrayList<Integer>(); 
		ArrayList<String> titles = new ArrayList<String>();
		ArrayList<String> bodies = new ArrayList<String>();
		int a = 1;

		while (true) {
			String s = sc.nextLine();
			if(s.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			} else if(s.equals("add")) {
				
				System.out.println("게시물 제목을 입력해주세요");
				String title = sc.nextLine();
				System.out.println("게시물 내용을 입력해주세요");
				String body = sc.nextLine();
				ids.add(a);
				a++;
				titles.add(title);
				bodies.add(body);
				
			} else if(s.equals("list")) {
				
				for(int i = 0; i < titles.size(); i++) {
					System.out.println("번호 : " + ids.get(i));
					System.out.println("제목 : " + titles.get(i));
					System.out.println("-----------------");
				}		
			} else if(s.equals("read")) {
				System.out.println("보고싶은 게시물 번호를 입력해주세요");
				int id = Integer.parseInt(sc.nextLine());
				
				for(int i = 0; i < ids.size(); i++) {
					if(id == ids.get(i)) {
						System.out.println("번호 : " + ids.get(i));
						System.out.println("제목 : " + titles.get(i));
						System.out.println("내용 : " + bodies.get(i));
						break;
					}
				}
			} else if(s.equals("update")) {
				System.out.println("수정하고싶은 게시물 번호를 입력해주세요");
				int id = Integer.parseInt(sc.nextLine());
				
				for(int i = 0; i < ids.size(); i++) {
					if(id == ids.get(i)) {
						System.out.println("새로운 제목");
						String title = sc.nextLine();
						System.out.println("새로운 내용");
						String body = sc.nextLine();
						
						titles.set(i, title);
						bodies.set(i, body);
						break;
					}
				}
			} else if(s.equals("delete")) {
				System.out.println("삭제하고싶은 게시물 번호를 입력해주세요");
				int id = Integer.parseInt(sc.nextLine());
				
				for(int i = 0; i < ids.size(); i++) {
					if(id == ids.get(i)) {
						ids.remove(i);
						titles.remove(i);
						bodies.remove(i);
						break;
					}
				}
			}
		}
	}

}
