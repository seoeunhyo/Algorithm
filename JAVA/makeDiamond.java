package D0403;

import java.util.Scanner;

public class makeDiamond {
    static boolean flag = true;
    public static void main(String[] args) {

        while (flag) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("도형의 크기를 입력해 주세요.");
                System.out.print("종료를 원한다면, 0번을 눌러주세요.");
                System.out.println();
                int size = sc.nextInt();
                if(size == 0){
                    System.out.println("마름모 출력하기를 종료합니다.\n");
                    flag = false;
                }else{
                    System.out.println(size + "크기의 마름모를 출력합니다.\n");
                }


                /*
                 * 정삼각형부터 출력한다.
                 */
                for (int i = 1; i <= size; i++) {
                    //공백은 1,2,3과 같이 늘어나야한다. i가 증감이기 때문에 단순하게 크기에서 i를 빼도 가능하다.
                    System.out.print(" ".repeat(size - i));
                    //마찬가지로 *도 늘어난다.
                    System.out.println("*".repeat((2 * i) - 1));

                }

                /*
                 * 역삼각형을 출력한다. 가장 긴 줄은 상단 for문에서 출력했기 때문에 size-1로 시작함으로써 출력하지 않는다.
                 */
                for (int i = size - 1; i >= 1; i--) {
                    //i는 3,2,1로 줄어들지만, 공백은 반대로 1,2,3과 같이 늘어나야한다.
                    System.out.print((" ".repeat(size - i)));
                    //*은 가장 긴 줄을 제외하고 출력한다. 점점 줄어들어야한다.
                    System.out.println("*".repeat((2 * i) - 1));

                }
            }catch(Exception e){
                System.out.println("\n숫자 외 다른 것은 입력하지 마세요.\n");
            }
        }
    }


}
