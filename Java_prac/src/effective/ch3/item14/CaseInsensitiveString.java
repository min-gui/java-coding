package effective.ch3.item14;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

//90page
public class CaseInsensitiveString implements Comparable<CaseInsensitiveString> {

    private final String s;

    public CaseInsensitiveString(String s){
        this.s = Objects.requireNonNull(s);
    }

    //56쪽 수정된 메소드
    @Override
    public boolean equals(Object obj) {
        return obj instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
    }

    @Override
    public int hashCode() {
        return s.hashCode();
    }

    @Override
    public String toString() {
        return s;
    }

    //자바가 제공하는 비교자를 사용해 클래스 비교
    @Override
    public int compareTo(CaseInsensitiveString o) {
        return String.CASE_INSENSITIVE_ORDER.compare(s, o.s);
    }

    public static void main(String[] args) {
        args = new String[]{"23", "3434"};
        Set<CaseInsensitiveString> s = new TreeSet<>();
        for (String arg : args)
            s.add(new CaseInsensitiveString(arg));
        System.out.println(s);
    }
}
