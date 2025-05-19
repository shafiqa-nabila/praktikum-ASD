public class AntrianLayananTugas {
    Mahasiswa20[] data;
    int front, rear, size, max;

    AntrianLayananTugas(int n) {
        max = n;
        data = new Mahasiswa20[max];
        front = -1;
        rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void enqueue(Mahasiswa20 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
    }

    Mahasiswa20 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Mahasiswa20 mhs = data[front];
        front = (front + 1) % max;
        size--;
        if (isEmpty()) {
            front = -1;
            rear = -1;
        }
        return mhs;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Daftar Antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    void clear() {
        front = -1;
        rear = -1;
        size = 0;
    }

    int getJumlahAntrian() {
        return size;
    }
}
