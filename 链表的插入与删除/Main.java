package Java_210219;

public class Main {
    //�����������ܽ�������
    public static Node createNode(){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        return a;
    }
    //���������ܽ�������
    public static Node createDummyNode(){
        Node dummy = new Node(0);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        dummy.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        return dummy;
    }
    //������
    public static void main(String[] args) {
        //1.0����һ������
       Node head = createNode();
       //1.1ͷ��һ�����
//         head =headInsert(head,1);
//         printLink(head);//Node{10} Node{1} Node{2} Node{3} Node{4}
       //1.2�м�һ�����
//        head =nodeInsert(head,3,10);
//        printLink(head);//Node{1} Node{2} Node{10} Node{3} Node{4}
       //1.3β��һ�����
//        head =tailInsert(head,10);//Node{1} Node{2} Node{3} Node{4} Node{10}
//        printLink(head);
        //1.4ͷɾһ�����
        head =headDelete(head,head.next);
        //printLink(head);
        //1.5�м�ɾ�����
        //1.5.1������ֵ����ɾ��

        //printLink(head);
        //1.5.2�����±����ɾ��

        //printLink(head);
        //1.6βɾһ�����

        //printLink(head);
        //2.0����һ�������ܽ�������
        Node dummyHead = createDummyNode();
        //2.1����һ����㣨ͷ����������м�������ƣ�β���벻���������������ͬ��
//        dummyHead =tailDummyInsert(dummyHead,10);
//        printDummyLink(dummyHead);//Node{10} Node{1} Node{2} Node{3} Node{4}
    }

    private static Node headDelete(Node head, Node next) {
        return head;
    }


    //2.1����������Ĳ���
    private static Node tailDummyInsert(Node head, int i) {
        //1Ѱ�ҵ�����������ǰһ�����
        Node prev =head;
        //2.���½ڵ�ŵ�ԭ�Ƚ���ǰ��
        Node newNode = new Node(i);
        newNode.next=prev.next;
        //���½ڵ�ŵ�ԭ�Ƚ���ǰһ�����ĺ���
        prev.next=newNode;
        return head;
    }

    //1.3β������
    private static Node tailInsert(Node head, int i) {
        Node cur =head;
        //1.Ѱ�ҵ�β�����
        while (cur !=null){
            if (cur.next==null){
                break;
            }
            cur=cur.next;
        }
        //2.���½ڵ����β��
        Node newNode = new Node(i);
        cur.next=newNode;
        return head;
    }

    //1.2�м����
    private static Node nodeInsert(Node head, int val  , int i) {
        //1Ѱ�ҵ�����������ǰһ�����
        Node prev =head;
        while (prev!=null&&prev.next!=null){
            if (prev.next.val==val){
                break;
            }
            prev=prev.next;
        }
        //2.���½ڵ�ŵ�ԭ�Ƚ���ǰ��
        Node newNode = new Node(i);
        newNode.next=prev.next;
        //���½ڵ�ŵ�ԭ�Ƚ���ǰһ�����ĺ���
        prev.next=newNode;
        return head;
    }

    //1.1ͷ�巨
    private static Node headInsert(Node head, int i) {
        //1�½ڵ�newNode
        Node newNode =new Node(i);
        //2.���½ڵ��ԭ�Ƚ���ǰ��
        newNode.next=head;
        //3�޸�head������,ָ���½ڵ�
        head=newNode;
        return head;
    }
    //��������(�п��ܽڵ�)
    private static void printDummyLink(Node head) {
        while (head.next!=null){
            System.out.print(head.next+" ");
            head=head.next;
        }
    }
    //��������(�޿��ܽڵ�)
    private static void printLink(Node head) {
        while (head!=null){
            System.out.print(head+" ");
            head=head.next;
        }
    }


}
