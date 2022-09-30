public class Methods {
    String name;

    //생성자 메서드
    Methods(){
        name = "홍길동";

        //생성자 홍길동 출력  아래 메인 함수에서 호출하지 않아도 출력
        System.out.printf("#생성자: %s\n", name);

    }
    //인자가 없는 메서드
    //홍길동이 인자로 들어감
    void printName(){
        System.out.printf("#printName():%s\n", name);
    }

    //인자가 하나인 메서드 오버로딩(name 같은 이름으로 정의)
    // 홍길동이 아닌 김길동이 출력된다.
    void printName(String name){
        System.out.printf("#printName(String name) : %s\n", name );
    }

    void printNames(String...name){
        System.out.println("#printNames(Stirng...name)");
        for (String s : name){
            System.out.println(s);
        }

    }
    int calc (int num1, int num2){
        return num1 + num2;
    }
    public static void main(String[] args){
        //호출
        Methods m = new Methods();
        //인자가 없는 메서드에 홍길동이 들어감
        m.printName();
        m.printName("김길동");
        m.printNames("아무개","홍길동", "김사랑");
        System.out.printf("#calc(int num1, num2: %d", m.calc(50, 20));





    }

}


/*
오버로딩 & 오버라이딩 차이
오버로딩 : 자바의 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메소드가 있더라도
매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메소드를 정의할 수 있다.
 -> 이름이 같고, 매개변수의 개수나 타입이 달라야 한다.

오버라이딩 : 부모 클래스로부터 상속받은 메소드를 자식 클래스에서 재정의하는 것을 오버라이딩이라고 한다.
상속받은 메소드를 그대로 사용할 수도 있지만, 자식 클래스에서 상황에 맞게 변경해야하는 경우 오버라이딩할 필요가 생긴다.
  -> 오버라이딩하고자 하는 메소드의 이름, 매개변수, 리턴 값이 모두 같아야 한다

 */