package Java_201208;

import java.util.Scanner;

public class AgeJudgment {
    public static void main(String[] args) {
        //�������������, ����ӡ����ǰ�������������(����18), ����(19-28), ����(29-55), ����(56����)

        Scanner input= new Scanner(System.in);
        System.out.println("�����뵱�����䣺");
        int year =input.nextInt();
        if(year<19){
            System.out.println("��������");
        }else if (year>18&&year<29){
            System.out.println("��������");
        }else if (year>28&&year<56){
            System.out.println("��������");
        }else{
            System.out.println("��������");
        }
    }
}
