package codingtest;

import java.util.Scanner;

public class Back_10828 {
    static int[] stack;
    static int size = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int row = Integer.valueOf(sc.nextLine());

        stack = new int[row];
        for (int i =0; i < row ; i++){
            selectFunc();
        }


    }
    static void selectFunc(){
        String[] partition =sc.nextLine().split(" ");
        if(partition.length==1){
            switch (partition[0]){
                case "pop":
                    System.out.println(pop());
                    break;
                case "top":
                    System.out.println(top());
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                    System.out.println(empty());
                    break;
            }

        }else {
            push(Integer.valueOf(partition[1]));
        }

    }

    static void push(int inputNum) {
        size++;
        stack[size-1] = inputNum;


    }

    static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int result = stack[size-1];

            size--;
            return result;
        }
    }

    static int top() {
        if (size == 0){
            return -1;
        }else {
            return stack[size-1];
        }
    }
    static int size() {
        return size;
    }

    static int empty() {
        if (size == 0){
            return 1;
        }else {
            return 0;
        }
    }

}
