package ac.id.atmaluhur.uas_keperluanku;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class MingguSatuPost {

    @SerializedName("idm1")
    @Expose
    private String idm1;
    @SerializedName("nama_barang")
    @Expose
    private String namaBarang;
    @SerializedName("merk")
    @Expose
    private String merk;
    @SerializedName("harga")
    @Expose
    private String harga;

    public String getIdm1() {
        return idm1;
    }

    public void setIdm1(String idm1) {
        this.idm1 = idm1;
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