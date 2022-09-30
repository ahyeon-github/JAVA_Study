public class Variables {
    int num1;

    static int num2;

    public void printName(String name){
        String prtMsg = name + "Hello";
        System.out.println(prtMsg);
    }

    public static void main(String[] args){
        Variables mc = new Variables();
        mc.num1 = 100;

        Variables.num2 = 50;

        mc.printName("홍길동");
        System.out.printf("%d, %d", mc.num1, Variables.num2);
    }
}


//print : 괄호 안 내용 단순히 출력
//printf : %d, %s 등을 쓰기 위해 사용
//println: 마지막에 개행문자 포함되어 있어 출력 후 한 줄 띄워짐.