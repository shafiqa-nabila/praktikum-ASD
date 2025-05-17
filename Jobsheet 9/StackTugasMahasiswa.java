public class StackTugasMahasiswa {
    Mahasiswa20[] stack;
    int top;
    int size;

public StackTugasMahasiswa(int size) {
    this.size = size;
    this.stack = new Mahasiswa20[size];
    this.top = -1;
}

public boolean isFull() {
    if (top == size - 1) {
        return true;
    } else {
        return false;
    }
}

public boolean isEmpty() {
    if (top == -1) {
        return true;
    } else {
        return false;
    }
}

public void push(Mahasiswa20 mhs) {
    if (!isFull()) {
        top++;
        stack[top] = mhs;
    } else {
        System.out.println("Stack penuh! Tidak bisa menambahkan Tugas Lagi.");
    }
}

public Mahasiswa20 pop() {
    if (!isEmpty()) {
        Mahasiswa20 mhs = stack[top];
        top--;
        return mhs;
    } else {
        System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
        return null;
    }
}

public Mahasiswa20 peek() {
    if (!isEmpty()) {
        return stack[top];
    } else {
        System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
        return null;
    }
}

public void print() {
    for (int i = 0; i <= top; i++) {
        System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);  
    }
    System.out.println("");
}

public String konversiDesimalkeBiner(int nilai) {
    StackKonversi20 stack = new StackKonversi20();
    while (nilai > 0) {
        int sisa = nilai % 2;
        stack.push(sisa);
        nilai = nilai / 2;
    }
    String biner = new String();
    while (!stack.isEmpty()) {
        biner += stack.pop();
    }
    return biner;
}
    public Mahasiswa20 bottom() {
    if (!isEmpty()) {
        return stack[0];
    } else {
        return null;
    }
}
    public int jumlahTugas() {
    return top + 1;
}
}
