package huanbao;

import java.util.Scanner;

public class jiami {
	//�����ܷ���|���ܷ���
	public String jiami(String pass){
		char[] a = pass.toCharArray();
		for(int i=0;i<a.length;i++){
			a[i]=(char) (a[i]^40000);
		}
		return pass;
	}
}
