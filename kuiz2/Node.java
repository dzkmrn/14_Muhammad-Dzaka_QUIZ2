package kuiz2;

public class Node {
        int nomor;
        String nama;
        String noHP;
        Node prev, next;
    
        public Node(Node prev, int nomor, String nama, String noHP, Node next) {
            this.prev = prev;
            this.nomor = nomor;
            this.nama = nama;
            this.noHP = noHP;
            this.next = next;
    
        }

}
