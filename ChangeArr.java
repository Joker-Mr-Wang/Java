//package Java_210205;
//
//import java.util.Arrays;
//
////����������������, �����������������.
//public class ChangeArr {
//    public static void main(String[] args) {
//        int[] arr1 = {};
//        int[] arr2 = {1,2,3,4};
//        changeArr(arr1,arr2);
//    }
////������������
//    private static void changeArr(int[] arr1, int[] arr2) {
//        //��ӡһ�½���ǰ
//        System.out.println("����ǰ");
//        System.out.println("arr1"+Arrays.toString(arr1));
//        System.out.println("arr2"+Arrays.toString(arr2));
//        //��������
//        //����һ�����������arr1������
//        int[] arr=new int[arr1.length];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr1[i];
//        }
//        //��arr2�����ݷ�����arr1���档
//        arr1=new int[arr2.length];
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i]=arr2[i];
//        }
//        //��arr1�����ݷ�����arr2���档
//        arr2=new int[arr.length];
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i]=arr[i];
//        }
//        //������
//        System.out.println("������");
//        System.out.println("arr1"+Arrays.toString(arr1));
//        System.out.println("arr2"+Arrays.toString(arr2));
//    }
//}
