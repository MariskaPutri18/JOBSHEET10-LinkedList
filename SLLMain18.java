public class SLLMain18 {
    public static void main(String[] args) {
        LinkedList18 myLinkedList18 = new LinkedList18();
        myLinkedList18.addFirst(100);
        myLinkedList18.addFirst(200);
        myLinkedList18.addFirst(300);
        myLinkedList18.addFirst(400);
        myLinkedList18.print();

        System.out.println("Menambhkan node dengan data 500 dari belakang");
        myLinkedList18.addLast(500);
        myLinkedList18.print();
        System.out.println("Menambahakan node dengan data 50 dari depan");
        myLinkedList18.addFirst(50);
        myLinkedList18.print();
        System.out.println("Menbahkan node dengan data 250 setelah node 200");
        myLinkedList18.insertAfter(200, 250);
        myLinkedList18.print();
        System.out.println("Hapus node depan");
        myLinkedList18.removeFirst();
        myLinkedList18.print();
        System.out.println("Hapus node belakan");
        myLinkedList18.removeLast();
        myLinkedList18.print();
        System.out.println("Hapus node yang memiliki data 300");
        myLinkedList18.remove(300);
        myLinkedList18.print();

       
        
    }
}
