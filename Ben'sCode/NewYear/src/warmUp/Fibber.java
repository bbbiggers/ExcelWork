package warmUp;

public class Fibber {
public static void main(String[] args) {
	Fibonochi(9);
}
public static void Fibonochi(int n) {
	if(n == 0) return;
	int temp1 = 1;
	int temp2 = 1;
	int Next = 1;
	System.out.println(Next);
	for(int i = 1; i < n; i++) {
	System.out.println(Next);
	Next = temp1+temp2;
	temp1 = temp2;
	temp2 = Next;
}}
}
