package board;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		// 배열 선언
		String[] arr = new String[5];
		
		// 리스트 선언
		ArrayList<String> list = new ArrayList<>();
		
		// 배열 값 추가.
		arr[0] = "aaa";
		arr[1] = "bbb";
		
		// 리스트 값 추가.
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		
		
		// 배열 값 가져오기
		System.out.println(arr[0]);
		
		// 리스트 값 가져오기
		System.out.println(list.get(0));
		
		// 배열 삭제 없음.
		
		// 리스트 삭제
//		list.remove(0);
//		System.out.println(list.get(0));
		
		// 배열 수정
		arr[1] = "ccc";
		System.out.println(arr[1]);
		// 리스트 수정
		list.set(1, "ccc");
		System.out.println(list.get(1));
		
		// 저장한 데이터의 개수 배열 X
		
		// 리스트 
		System.out.println(list.size());
		
		
		
	}

}
