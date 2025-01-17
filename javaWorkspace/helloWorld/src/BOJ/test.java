package BOJ;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = Integer.parseInt(input.next());
		int sameNum = 0;
		String str[] = new String[num];
		String temp;
		
		// 입력 
		for(int i = 0 ; i < num ; i++) {
			str[i] = input.next();
		}
		
		// 단어의 길이로 정렬 
		for(int i = 0 ; i < num ; i++) {
			for(int j = i ; j < num ; j++) {
				if(str[i].length() > str[j].length()) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		
		// 길이가 같을 경우 알파벳 순으로 정렬 
		for(int i = 0 ; i < num - 1 ; i++) {
			if((str[i].length() == str[i + 1].length()) && (i != num - 2)) 
				sameNum++;
			else if(i == num - 2) {
				for(int j = num - 2 - sameNum ; j < num - 1 ; j++) {
					for(int k = j ; k < num - 1 ; k++) {
						for(int z = 0 ; z < str[i].length() ; z++) {
							if((int)str[j].charAt(z) > (int)str[k].charAt(z)) {								
								temp = str[j];
								str[j] = str[j + 1];
								str[j + 1] = temp;								
							}
						}
					}
				}
			}
			else {
				if(sameNum == 0) {}
				else {
					for(int j = i - sameNum ; j < i + 1 ; j++) {
						for(int k = j ; k < i + 1 ; k++) {
							for(int z = 0 ; z < str[i].length() ; z++) {
								if((int)str[j].charAt(z) > (int)str[k].charAt(z)) {								
									temp = str[j];
									str[j] = str[j + 1];
									str[j + 1] = temp;								
								}
							}
						}
					}
					
					sameNum = 0;
				}
			}
		}
		
		// 출력 
		System.out.println("");
		for(int i = 0 ; i < num ; i++) {
			if(i != 0 && (str[i] == str[i - 1]))
					continue;
			else
				System.out.println(str[i]);
		}
		
		input.close();
		
	}

}
