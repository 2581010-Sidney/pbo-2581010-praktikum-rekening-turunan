public class Tabungan extends Rekening {
    private double bungaPersen;

    public Tabungan(String nomor, String pemilik, int saldo, double bungaPersen){
        super(nomor, pemilik, saldo);
        this.bungaPersen = bungaPersen;
    }

    public int tambahBunga() {
        int bunga = (int) Math.round(saldo * bungaPersen / 100);
        setor(bunga); //lewat setor, bukan sado += bunga karena dia mewarisi Rekening
        return bunga;
    }

    @Override //Penanda: subclass menyediakan versi sendiri dari method parent
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("       Tabungan, bunga " + bungaPersen + "% per bulan");
    }
}
