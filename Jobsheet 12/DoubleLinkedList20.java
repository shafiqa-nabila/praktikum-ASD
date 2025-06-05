public class DoubleLinkedList20 {
    Node20 head;
    Node20 tail;

    public DoubleLinkedList20() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa20 data) {
        Node20 newNode = new Node20(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa20 data) {
        Node20 newNode = new Node20(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa20 data) {
        Node20 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
            
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node20 newNode = new Node20(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak ada yang dihapus.");
        } if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak ada yang dihapus.");
        } if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }   
    }

    public Node20 search(String nim) {
        Node20 current = head;
            while (current != null) {
                if (current.data.nim.equals(nim)) {
                    return current;
                }
            current = current.next;
            }
        return null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
        } else {
            Node20 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public void add(Mahasiswa20 data, int index) {
        if (index < 0 || index > size()) {
            System.out.println("Indeks tidak valid.");
            return;
        } if (index == 0) {
            addFirst(data);
            return;
        } if (index == size()) {
        addLast(data);
        return;
        }

        Node20 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        Node20 newNode = new Node20(data);
        newNode.prev = current.prev;
        newNode.next = current;
        current.prev.next = newNode;
        current.prev = newNode;
    }

    public void removeAfter(String keyNim) {
        Node20 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current != null && current.next != null) {
            Node20 toDelete = current.next;
            current.next = toDelete.next;
        if (toDelete.next != null) {
            toDelete.next.prev = current;
        } else {
            tail = current;
        }
        System.out.println("Data setelah " + keyNim + " berhasil dihapus: ");
        toDelete.data.tampil();
        } else {
            System.out.println("Data setelah " + keyNim + " tidak ditemukan.");
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("Indeks tidak valid.");
            return;
        } if (index == 0) {
            removeFirst();
            return;
        } if (index == size() - 1) {
            removeLast();
            return;
        }

        Node20 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        System.out.println("Data berhasil dihapus:");
        current.data.tampil();
    }

    public Mahasiswa20 getFirst() {
        return head != null ? head.data : null;
    }

    public Mahasiswa20 getLast() {
        return tail != null ? tail.data : null;
    }

    public Mahasiswa20 get(int index) {
        if (index < 0 || index >= size()) return null;
            Node20 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        int count = 0;
        Node20 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}







