package ac.id.atmaluhur.uas_keperluanku;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MingguDuaPost {

    @SerializedName("idm2")
    @Expose
    private String idm2;
    @SerializedName("nama_barang")
    @Expose
    private String namaBarang;
    @SerializedName("merk")
    @Expose
    private String merk;
    @SerializedName("harga")
    @Expose
    private String harga;

    public String getIdm2() {
        return idm2;
    }

    public void setIdm2(String idm2) {
        this.idm2 = idm2;
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
