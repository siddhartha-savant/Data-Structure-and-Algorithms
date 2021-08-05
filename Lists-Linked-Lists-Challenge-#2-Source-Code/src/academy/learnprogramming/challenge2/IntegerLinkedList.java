package academy.learnprogramming.challenge2;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    // Solution given in the course is very precise. Check that out once.
    public void insertSorted(Integer value) {

        IntegerNode node = new IntegerNode(value);
        if(isEmpty()){
            node.setNext(head);
            head = node;
            size++;
            return;
        }
        Integer headValue = head.getValue();
        if(value < headValue){
            node.setNext(head);
            head = node;
            size++;
        }else if(value > headValue){
            IntegerNode nextNode = head.getNext();
            if(value < nextNode.getValue()){
                node.setNext(head.getNext());
                head.setNext(node);
                size++;
                return;
            }
            while(true){
                if(value > nextNode.getValue()  && nextNode.getNext()==null) {
                    nextNode.setNext(node);
                    size++;
                    return;
                }else if(value > nextNode.getValue()  && value < nextNode.getNext().getValue()){
                    nextNode.setNext(node);
                    node.setNext(nextNode.getNext());
                    size++;
                    return;
                }
                nextNode = nextNode.getNext();
            }
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
