package effective.ch2.item3.enumtype;


public enum Elvis {

    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("기다려 자기야, 지금 나갈께!");
    }
    //대부분상황에서 원소가 하나뿐인 열거 타입이 싱글턴틀 만드는 가장 좋은 방법.
    //enum 외의 클래스를 상속해야 한다면 사용할수 없다.

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
