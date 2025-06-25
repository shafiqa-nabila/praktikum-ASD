public class BinaryTreeArray20 {
    Mahasiswa20[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray20() {
        this.dataMahasiswa = new Mahasiswa20[10];
    }

    void populateData(Mahasiswa20[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // Method tambahan untuk tugas praktikum
    void add(Mahasiswa20 data) {
        if (idxLast == dataMahasiswa.length - 1) {
            System.out.println("Array penuh");
            return;
        }
        dataMahasiswa[++idxLast] = data;
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}