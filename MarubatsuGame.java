package hello.java;

import java.util.Scanner;

public class MarubatsuGame {public static void main(String[] args) {
	int ooo = 3;
	int[][] masu = new int[ooo][ooo];

	for(int y=0; y<ooo; y++) {
		for(int x=0; x<ooo; x++) {
			masu[x][y] = 0;

		}
	}
	String mark[] = {" ","〇","×" };
	Scanner sc = new Scanner(System.in);

	for(int turn =0; turn < ooo*ooo; turn++) {
		int k = turn%2+1;
		System.out.println("k"+k+"のターン");

		int putX,putY;
		do {
			System.out.println("横のマスを入力");
			putX = sc.nextInt();
			System.out.println("縦のマスを入力");
			putY = sc.nextInt();
		}while(putX<0 || putY<0 || putX>=ooo || putY>ooo || masu[putX][putY]!=0);
		     masu[putX][putY] = k;

		    for(int y= 0; y<ooo; y++){
		    	String bou = "|";
		    	for(int x=0; x<ooo; x++){
		    		bou+=mark[masu[x][y]]+"|";

		    	}
		    	System.out.println(bou);
		    }

		    int tmp = 0;
		    for(int x=0; x<ooo; x++){
		    	if(masu[x][putY] == k)tmp++;
		    }
		    if(tmp==ooo)win(k);


		    tmp = 0;
		    for(int y=0; y<ooo; y++){
		    	if(masu[putX][y] == k)tmp++;
		    }
		    if(tmp == ooo)win(k);


		    tmp = 0;
		    for(int x=0; x<ooo; x++){
		    	if(masu[x][x]==k)tmp++;
		    }
		    if(tmp == ooo)win(k);
		    tmp =0;
		    for(int x=0; x<ooo;x++){
		    	if(masu[x][ooo-1-x]== k)tmp++;
		    }
		    if(tmp==ooo)win(k);

	}
	System.out.println("決着つかず");

    }
private static void win(int k){
	System.out.println("k"+k+"の勝ち");
	System.exit(0);
}

}




