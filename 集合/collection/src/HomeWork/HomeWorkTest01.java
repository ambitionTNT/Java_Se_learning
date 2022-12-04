package HomeWork;
/*
编写程序实现单向链表数据结构：
    public class Node {
        Object data;
        Node next;
    }
    public class MyLinkedList{
        Node header;
        ....
        // 添加数据的方法
        // 删除数据的方法
        // 修改数据的方法
        // 查找数据的方法
        // 打印集合中每个元素的方法
    }

    最后编写测试程序
 */
public class HomeWorkTest01 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.EntryList("A");
        myLinkedList.EntryList("b");
        myLinkedList.EntryList("c");
        myLinkedList.EntryList("F");
        myLinkedList.EntryList("G");
        myLinkedList.EntryList("J");
        myLinkedList.EntryList("K");
        myLinkedList.EntryList("L");
        myLinkedList.EntryList("M");
        myLinkedList.EntryList("N");
        myLinkedList.EntryList("O");
        myLinkedList.EntryList("P");
        myLinkedList.modifyList(2,"B");
        myLinkedList.delList("A");

        myLinkedList.printList();

        System.out.println("0------------------");

        System.out.println(myLinkedList.FindList(1).obj);
    }
}

class Node{
    Object obj;
    Node next;

    public Node(Object obj, Node next) {
        this.obj = obj;
        this.next = next;
    }
}

class MyLinkedList{
    Node header;
    // 添加数据的方法

    public MyLinkedList() {
        this.header = null;
    }

    public void EntryList(Object o){
        if (this.header==null){
            System.out.println("插入开始");
            this.header = new Node(o,null);
        }
        else{//采用头插法
            System.out.println("插入成功");
            /*Node temp = this.header;
            this.header = new Node(o,temp);*/
            Node tail = this.header;
            while (tail.next!=null){
                tail=tail.next;
            }
            tail.next = new Node(o,null);
        }


    }
    // 删除数据的方法
    public boolean delList(Object o ){
        Node temp = this.header;
        if (o.equals(this.header.obj)){
            this.header = this.header.next;
            return true;
        }
        while (temp!=null){
            if (o.equals(temp.next.obj)){
                break;
            }else{
                temp = temp.next;
            }
        }
        if (temp!=null){
            temp.next = temp.next.next;
            return true;
        }
        else{
            return false;
        }



    }
    // 修改数据的方法

    public boolean modifyList(int i ,Object dest){
        if (i<1){
            return false;
        }

        Node mode = FindList(i);
        mode.obj=dest;
        return true;

    }
    // 查找数据的方法
    public Node FindList(int i){
        Node temp = header;
        int j = 1;
        if (i == 1){
            return header;
        }
        if (i<1){
            return null;
        }
        while (temp!=null&&j<i){
            temp = temp.next;
            j++;
        }
        return temp;
    }
    // 打印集合中每个元素的方法
    public void printList(){
        Node temp = header;
        while (temp!=null){
            System.out.println(temp.obj);
            temp = temp.next;
        }
    }
}
