package effective.ch2.item3.field;


public class Elvis {

    //public static final 생성 방식
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() { }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }


    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
        //AccessibelObject.setAccessibel 을 사용해 private 을 호출 가능.
        //예외처리 해야된다.
    }
}
