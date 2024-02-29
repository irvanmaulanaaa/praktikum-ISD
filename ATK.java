public class ATK implements Comparable<ATK> {
    
   String kodeBrg;
   String jenisBrg;
   String namaBrg;
   int stokBrg;

   public ATK (String kodeBrg, String jenisBrg, String namaBrg, int stokBrg) {
        this.kodeBrg = kodeBrg;
        this.jenisBrg = jenisBrg;
        this.namaBrg = namaBrg;
        this.stokBrg = stokBrg;
   }

   public String getKodeBrg() {
     return kodeBrg;
   }

   public void setKodeBrg(String kodeBrg) {
     this.kodeBrg = kodeBrg;
   }

   public String getJenisBrg() {
     return jenisBrg;
   }

   public void setJenisBrg(String jenisBrg) {
     this.jenisBrg = jenisBrg;
   }

   public String getnamaBrg() {
     return namaBrg;
   }

   public void setNamaBrg(String namaBrg) {
     this.namaBrg = namaBrg;
   }

   public int getStokBrg() {
     return stokBrg;
   }

   public void setStokBrg(int StokBrg) {
     this.stokBrg = stokBrg;
   }

    @Override
    public String toString() {
        return "ATK [Kode barang = " + kodeBrg + ", Jenis barang = " + jenisBrg + ", Nama barang = " + namaBrg + ", Stok barang = " + stokBrg + "]";
    }

    @Override
    public int compareTo(ATK o) {
        return this.getKodeBrg().compareTo(o.getKodeBrg());
    }
}
