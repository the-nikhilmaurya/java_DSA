class first_try
{
    Node head;
    private int size;
    first_try(){
        this.size = 0;
    }

    // defining class node
    class Node{
        Node next;
        String data;
        
        Node (String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add-first
    public void addFirst(String data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // addlast
    public void addLast(String data){
        Node newNode = new Node(data);
 
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null ){
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    // print node
    public void printlist(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    // delete first
    public void removeFirst(){
        if(head == null){
            System.out.println("this is an empty list");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void removeLast(){
        if(head == null){
            System.out.println("this is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
        }
        Node secondlast = head;
        Node lastnode = head.next;
        while (lastnode.next != null){
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public int getSize(){
        return size;
    }

    // reverse the linkedlist using iterative approach
    public void reverseIterate(){

        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;

    }

    // add in the middle 
    public void add(int indx,String data){
        Node newNode = new Node(data);
        Node temp = head;
        int i =0;

        while (i< indx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String args[]){
        
        first_try list = new first_try();
        list.addFirst("book");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");

        // list.addLast("is");
        // list.printlist();
        // list.printlist();

        // list.removeFirst();
        // list.removeLast();
        list.printlist();
        list.add(2,"done" );
        // list.reverseIterate();
        list.printlist();
        System.out.println(list.getSize());

    }
}