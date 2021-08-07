package ac.id.atmaluhur.uas_keperluanku;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class MingguTigaPost {

    @SerializedName("idm3")
    @Expose
    private String idm3;
    @SerializedName("nama_barang")
    @Expose
    private String namaBarang;
    @SerializedName("merk")
    @Expose
    private String merk;
    @SerializedName("harga")
    @Expose
    private String harga;

    public String getIdm3() {
        return idm3;
    }

    public void setIdm3(String idm3) {
        this.idm3 = idm3;
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
