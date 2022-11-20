public class Hitung {
    Integer totalPemasukan=0,totalPengeluaran=0;

    Hitung() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getTotalPemasukan() {
        return totalPemasukan;
    }

    public void setTotalPemasukan(Integer totalPemasukan) {
        this.totalPemasukan = totalPemasukan;
    }

    public Integer getTotalPengeluaran() {
        return totalPengeluaran;
    }

    public void setTotalPengeluaran(Integer totalPengeluaran) {
        this.totalPengeluaran = totalPengeluaran;
    }

    public void totalPemasukan(Integer jumlah,BarangMasuk barangMasuk){
        setTotalPemasukan(jumlah*barangMasuk.getHarga());
    }

    public void totalPengeluaran(Integer jumlah, BarangKeluar barangKeluar){
        setTotalPengeluaran(jumlah*barangKeluar.getHarga());
    }
}
