public class LinkedList18 {
    Node18 head;

    public boolean isEmpty(){
        return (head == null);
    }

    public void print() {
        if (!isEmpty()){
            System.out.print("Isi linked list: ");
            Node18 currentNode18 = head;

            while (currentNode18 != null) {
                System.out.print(currentNode18.data + "\t");
                currentNode18 = currentNode18.next;
                
            }
            System.out.println("");
        }else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input){
        Node18 newNode18 = new Node18(input, null);

        if (isEmpty()) {
            head = newNode18; //newNode = input
        }else {
            newNode18.next = head; //newnode.next = gandengan, dan gandengan tersebut adalah head sebelum input
            head = newNode18; // head 
        }
    }

    public void addLast (int input) {
        Node18 newNode18 = new Node18(input, null);

        if (isEmpty()) {
            head = newNode18;
        }else {
            Node18 currentNode18 = head; // currentnode = key untuk mengecek hingga menemukan null

            while (currentNode18.next != null){ // jika currentnode tidak null maka akan terus mengecek hingga menemukan currentnode yang null
                currentNode18 = currentNode18.next;
            } // jika currentnode next = null akan keluar dari while 

            currentNode18.next = newNode18;
        }
    }

    public void insertAfter(int key,int input) {
        Node18 newNode18 = new Node18(input, null);

        if (!isEmpty()){
            Node18 currentNode18 = head;

            do{
                if (currentNode18.data == key){
                    newNode18.next = currentNode18.next;
                    currentNode18.next = newNode18;
                    break;
                }
                currentNode18 = currentNode18.next;
            } while (currentNode18 != null);

        } else {
            System.out.print("Linked list kosong");
        }
    }

}
