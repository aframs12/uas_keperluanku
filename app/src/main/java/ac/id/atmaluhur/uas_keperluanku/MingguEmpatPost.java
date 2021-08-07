package ac.id.atmaluhur.uas_keperluanku;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class MingguEmpatPost {

    @SerializedName("idm4")
    @Expose
    private String idm4;
    @SerializedName("nama_barang")
    @Expose
    private String namaBarang;
    @SerializedName("merk")
    @Expose
    private String merk;
    @SerializedName("harga")
    @Expose
    private String harga;

    public String getIdm4() {
        return idm4;
    }

    public void setIdm4(String idm4) {
        this.idm4 = idm4;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

}
