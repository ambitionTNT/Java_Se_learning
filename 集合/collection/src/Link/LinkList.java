package Link;

public class LinkList {
    Node header = null;
    public void addElenmet(Object obj){
        if (this.header==null){
            //新建一个结点
            this.header = new Node(obj,null);
        }else {
            //头插法
            //新建一个结点插入
            Node p = new Node(obj,null);
            p.next=this.header.next;
            this.header.next=p;

        }
        /*else{
            //尾插法
            Node current = header;
            while(current.next!=null){
                current=current.next;
            }
            current.next=new Node(obj,null);
        }*/

    }

    private Node findLast(Node node){
        if (node.next==null)
            return node;
        else return findLast(node.next);
    }
    //刪除
    public void removeElement(Object obj){

    }
    public void modifyElement(Object obj){

    }
}
