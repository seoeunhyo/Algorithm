package D0403;

import java.util.InputMismatchException;
import java.util.Scanner;

public class makeStar {
    /**
     * height와 width의 비율은 사용자 조정하여 조절한다.
     * 우선, 별을 크게 상단, 중단, 하단으로 나눴다. (3:3:3 비율)
     * 입력받는 것은 사용자가 원하는 별의 크기다. 입력받은 수에 임의 조정한 비율을 대입하기 때문에 별이 어느 정도 크기인가 가늠하는 절대적인 지표는 아니다.
     * 사용자의 입력, 별의 상단을 출력하는 반복문, 별의 중단을 출력하는 반복문, 별의 하단을 출력하는 반복문으로 총 3개의 반복문으로 이뤄져있다.
     */
    static boolean flag = true;
    public static void main(String[] args) {

        while (flag) {


            try {
                //사용자에게 임의의 숫자를 입력받음
                System.out.println("별의 크기를 입력하세요. 완벽한 별을 위해서 홀수로 입력하세요.");
                System.out.print("종료를 원한다면 0을 입력하세요: ");
                Scanner sc = new Scanner(System.in);
                int answer = sc.nextInt();
                if (answer == 0) {
                    System.out.println("종료합니다.");
                    flag = false;
                } else if (answer % 2 == 0) {
                    System.out.println("완벽하지 않은 별을 출력합니다.");
                } else {
                    System.out.println("완벽한 별을 출력합니다!");
                }

                //세로, 가로의 비율은 8:13으로 정했으며 조정할 수 있다.
                int height = answer * 9;
                int width = answer * 15;

                //'*'의 출력을 위해 필요한 위치
                int center = width / 2;
                int top = height / 3;
                int middle = top * 2;
                int bottom = top * 3;

                //## 별의 상단 출력 반복문, 반복문이 나누어져 있어 전체 크기를 가늠할 수 없으므로 투포인터를 편의상 사용
                int front = center; //front와 rear를 각각 길의의 절반인 center로 할당
                int rear = center;

            /*
            별은 정 가운데서부터 찍힌다. front는 감소, rear는 증가하여 피라미드 형식으로 '*'을 출력한다.
             */
                for (int i = 0; i < top; i++) {
                    for (int j = 0; j < width; j++) {
                        if (front <= j && j <= rear) { //front와 rear 각각 한 칸씩 감소/증가하므로 그 사이에 있는 공간에 '*'을 출력한다.
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                    front--; //감소
                    rear++;  //증가
                }

            /*
            ## 별의 중단 출력 반복문
            별의 가장 긴 부분을 출력할 수 있다. 때문에 front와 rear를 각각 0과 (가로길이 -1) 둔다.
             */
                front = 0;
                rear = width - 1;

                //이때, 3등분을 했으므로 상단 -> 중단의 범위를 이용하면 된다.
                for (int i = top; i < middle; i++) {
                    for (int j = 0; j < width; j++) {
                        if (front <= j && j <= rear) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                    //상단 출력과는 반대로 front는 증가, rear는 감소한다. 별이 가장 긴 부분부터 시작해 점점 줄어드는 부분이기 때문이다.
                    front++;
                    rear--;
                }
            /*
            ## 별의 하단 출력 반복문
            2개의 if문이 필요하다.
            front와 rear는 별의 중단 부분을 출력했던 지점 그대로다.
            바로 그 아래에 별의 다리(?)를 출력해야 하기 때문이다.
             */
                int startBottom = center;
                int endBottom = center;
                for (int a = middle; a < bottom; a++) {
                    for (int b = 0; b < width; b++) {
                        if (startBottom <= b && b <= endBottom) { //만약 해당 범위에 속하면 출력하지 않는다.
                            //각각 3씩 감소되고 증가되는데, 별의 다리를 출력해보면 3칸씩 자연스럽게 줄어들게 했다.
                            System.out.print(" ");
                        } else if (front - 1 > b || rear + 1 < b) { //이는 별의 음푹 패인 부분에 출력되지 않기 위함
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }

                    }
                    System.out.println();
                    front--;
                    rear++;
                    startBottom -= 3;
                    endBottom += 3;
                }

                System.out.println();
                System.out.println("별 출력을 완료했습니다.\n");
            }catch(InputMismatchException e){
                System.out.println("\n[ERROR]******************숫자만 입력해주십시오.********************");
                System.out.println();
            }
        }
        }

        }



