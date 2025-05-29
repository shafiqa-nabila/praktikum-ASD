public class NodeMahasiswa20 {
    Mahasiswa20 data;
    NodeMahasiswa20 next;

    public NodeMahasiswa20(Mahasiswa20 data, NodeMahasiswa20 next) {
        this.data = data;
        this.next = null;
    }
}

class SingleLinkedList20 {
    NodeMahasiswa20 head;
    NodeMahasiswa20 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa20 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(Mahasiswa20 input) {
    NodeMahasiswa20 ndInput = new NodeMahasiswa20(input, null);
    if (isEmpty()) {
        head = ndInput;
        tail = ndInput;
    } else {
        ndInput.next = head;
        head = ndInput;
        }
    }

    public void addLast(Mahasiswa20 input) {
        NodeMahasiswa20 ndInput = new NodeMahasiswa20(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa20 input) {
        NodeMahasiswa20 ndInput = new NodeMahasiswa20(input, null);
        NodeMahasiswa20 temp = head;
        do {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa20 input) {
        if (index < 0) {
            System.out.println("Index salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa20 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa20(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }


}

