public class SLLMain20 {
    public static void main(String[] args) {
        SingleLinkedList20 sll = new SingleLinkedList20();

        Mahasiswa20 mhs1 = new Mahasiswa20("20001", "Alvaro", "3A", 3.5);
        Mahasiswa20 mhs2 = new Mahasiswa20("20002", "Cintia", "3B", 3.2);
        Mahasiswa20 mhs3 = new Mahasiswa20("20003", "Bimon", "3A", 3.8);
        Mahasiswa20 mhs4 = new Mahasiswa20("20004", "Dirga", "3C", 3.1);
        
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
