package effective.ch2.item4;

public class UtilityClass {
    //인스턴스화 막는 절대적인 방법
    private UtilityClass(){
        throw new AssertionError();
    }
}
