/**
 * Merupakan class untuk Location yang dapat menambah lokasi.
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 18 Maret 2021
 */

public class Location
{
    
    private String province;    //variable province
    private String city;        //variable city
    private String description; //variable description

    /**
     * Untuk membuat objek baru
     @param province provisi lokasi
     @param city kota lokasi
     @param description deskripsi lokasi
     */
    public Location(String province, String city, String description)
    {
        this.province = province;
        this.city = city;
        this.description = description;
    }

    /**
     * Sebuah getter untuk mendapatkan data province
     * @return objek province
     */
    public String getProvince()
    {
        return province;
    }

    /**
     * Sebuah getter untuk mendapatkan data city
     * @return objek city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * Sebuah getter untuk mendapatkan data descriprion
     * @return objek description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sebuah setter untuk mengisi ulang provinsi dari objek
     * @param province provinsi dari lokasi
     */
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    /**
     * Sebuah setter untuk mengisi ulang kota dari objek
     * @param city kota dari lokasi
     */
    public void setCity(String city)
    {
        this.city = city;
    }
    
    /**
     * Sebuah setter untuk mengisi ulang deskripsi dari objek
     * @param id deskripsi dari lokasi
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * Untuk mengeprint data
     */
    public void printData()
    {
        System.out.println(getProvince());  //print provinsi lokasi
        System.out.println(getCity());
        System.out.println(getDescription());
    }
}
