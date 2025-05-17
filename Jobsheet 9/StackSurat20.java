public class StackSurat20 {
    Surat20[] data;
    int top;

    public StackSurat20(int kapasitas) {
        data = new Surat20[kapasitas];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public void push(Surat20 s) {
        if (!isFull()) {
            data[++top] = s;
        } else {
            System.out.println("Stack penuh, tidak dapat menambahkan surat!");
        }
    }

    public Surat20 pop() {
        if (!isEmpty()) {
            return data[top--];
        } else {
            System.out.println("Stack kosong, tidak ada surat yang dapat diproses.");
            return null;
        }
    }

    public Surat20 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                data[i].tampilkan();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }

    public void printAll() {
        for (int i = top; i >= 0; i--) {
            data[i].tampilkan();
        }
    }
}

