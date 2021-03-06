package Java_210219;

public class Main {
    //创建不带傀儡结点的链表
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
    //创建带傀儡结点的链表
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
    //主程序
    public static void main(String[] args) {
        //1.0创建一个链表
       Node head = createNode();
       //1.1头插一个结点
//         head =headInsert(head,1);
//         printLink(head);//Node{10} Node{1} Node{2} Node{3} Node{4}
       //1.2中间一个结点
//        head =nodeInsert(head,3,10);
//        printLink(head);//Node{1} Node{2} Node{10} Node{3} Node{4}
       //1.3尾插一个结点
//        head =tailInsert(head,10);//Node{1} Node{2} Node{3} Node{4} Node{10}
//        printLink(head);
        //1.4头删一个结点
        head =headDelete(head,head.next);
        //printLink(head);
        //1.5中间删除结点
        //1.5.1按照数值进行删除

        //printLink(head);
        //1.5.2按照下标进行删除

        //printLink(head);
        //1.6尾删一个结点

        //printLink(head);
        //2.0创建一个带傀儡结点的链表
        Node dummyHead = createDummyNode();
        //2.1插入一个结点（头插和在链表中间插入类似，尾插与不带傀儡链表大致相同）
//        dummyHead =tailDummyInsert(dummyHead,10);
//        printDummyLink(dummyHead);//Node{10} Node{1} Node{2} Node{3} Node{4}
    }

    private static Node headDelete(Node head, Node next) {
        return head;
    }


    //2.1带傀儡链表的插入
    private static Node tailDummyInsert(Node head, int i) {
        //1寻找到所需插入结点的前一个结点
        Node prev =head;
        //2.将新节点放到原先结点的前面
        Node newNode = new Node(i);
        newNode.next=prev.next;
        //将新节点放到原先结点的前一个结点的后面
        prev.next=newNode;
        return head;
    }

    //1.3尾部插入
    private static Node tailInsert(Node head, int i) {
        Node cur =head;
        //1.寻找到尾部结点
        while (cur !=null){
            if (cur.next==null){
                break;
            }
            cur=cur.next;
        }
        //2.将新节点插入尾部
        Node newNode = new Node(i);
        cur.next=newNode;
        return head;
    }

    //1.2中间插入
    private static Node nodeInsert(Node head, int val  , int i) {
        //1寻找到所需插入结点的前一个结点
        Node prev =head;
        while (prev!=null&&prev.next!=null){
            if (prev.next.val==val){
                break;
            }
            prev=prev.next;
        }
        //2.将新节点放到原先结点的前面
        Node newNode = new Node(i);
        newNode.next=prev.next;
        //将新节点放到原先结点的前一个结点的后面
        prev.next=newNode;
        return head;
    }

    //1.1头插法
    private static Node headInsert(Node head, int i) {
        //1新节点newNode
        Node newNode =new Node(i);
        //2.将新节点放原先结点的前面
        newNode.next=head;
        //3修改head的引用,指向新节点
        head=newNode;
        return head;
    }
    //遍历链表(有傀儡节点)
    private static void printDummyLink(Node head) {
        while (head.next!=null){
            System.out.print(head.next+" ");
            head=head.next;
        }
    }
    //遍历链表(无傀儡节点)
    private static void printLink(Node head) {
        while (head!=null){
            System.out.print(head+" ");
            head=head.next;
        }
    }


}
