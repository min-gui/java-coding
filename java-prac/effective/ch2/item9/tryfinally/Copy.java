package effective.ch2.item9.tryfinally;

import java.io.*;

// try-finally보다는 try-with-resources를 사용하라
public class Copy {
    private static final int BUFFER_SIZE = 8 * 1024;

    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0)
                    out.write(buf, 0, n);
            } finally {
                out.close();
            }
        } finally {
            //아웃은 실행 안됨.
            in.close();
        }
    }

    public static void main(String[] args) throws IOException {
        String src = "ff";
        String dst = "ss";

        copy(src, dst);

    }
}
