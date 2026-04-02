public  class Main {
public static void main(String[] args) {
int x = 6; 
int y = x++;
int z = ++y;
System.out.println(x + "" + y + "" + z);




// 問題以外
int A = 1;
int A2 = A++; //先に変数に格納されて加算しない
System.out.println(A2 + "：A2です");
int B = 3; B++; // セミコロンで文の命令を終了でインクリメントされる System.out.println(B++);は加算されない
System.out.println(B);
}
} 