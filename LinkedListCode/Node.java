public class Node {
    int data;
    Node next; //by default, the values are null since they are class variables
    
    //no arg constructor
    public Node (){

    }
    
    //parameterized constructor
    public Node(int data){
        this.data=data;
    }

    //parameterized constructor when two arguments are passed
    // used particularly when we need to add node in the middle of linked list
    public Node(int data, Node next){
        this.data=data;
        this.next=next; 
    }
}
