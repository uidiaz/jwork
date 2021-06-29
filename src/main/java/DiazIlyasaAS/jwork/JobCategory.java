package DiazIlyasaAS.jwork;

/**
 * Kelas Enum JobCategory, mendefiniskan data kategori dari pekerjaan.
 * Enum type merupakan sebuah tipe data khusus yang membuat suatu variable
 * menjadi sekumpulan konstanta yang telah ditentukan sebelumnya.
 * Jadi sederhananya Kelas Enum  merupakan sekumpulan variable yang
 * didefinisikan menjadi tipe data konstanta (konstan).
 *
 * @author Diaz Ilyasa Azrurrafi Saiful
 * @version 01-03-2021
 */
public enum JobCategory {
       //Tipe data enum yang sudah diset dengan nilai String konstan
       WebDeveloper("Web Developer"),
       FrontEnd("Front End"),
       BackEnd("Back End"),
       UI("UI"),
       UX("UX"),
       Devops("Devops"),
       DataScientist("Data Scientist"),
       DataAnalyst("Data Analyst");

       /*Instance Variable.
        *Diatur dengan access modifier private
        *Tipe data variablenya adalah String*/
       private String jobcategory;

       /**
        * Sebuah Constructor class Enum yang bernama JobCategory.
        * Access Modifier pada constrcutor ini berjenis private.
        * Parameter digunakan sebagai nilai inputan suatu fungsi ketika fungsi tersebut didefinisikan.
        * Ada parameter yang digunakan untuk konstruktor ini, yang dapat langsung dilihat dibawah.
        *
        * @param jobcategory merupakan nilai inputan untuk variable jobcategory
        */
       JobCategory(String jobcategory){
              this.jobcategory = jobcategory;
       }

       /**
        * Sebuah method yang bernama toString.
        * Method tersebut digunakan untuk merepresentasikan sebuah objek, kedalam tipe String.
        * Return type dari method bertipe String.
        * Access Modifier diatur public.
        * Jadi ketika data enum yang sudah dideklarasikan diatas dipanggil pada kelas lain untuk di print,
        * maka data yang diprint adalah nilai konstan string yang sudah diset pada masing - masing data enum tersebut.
        *
        * @return jobcategory jadi mengembalikkan nilai atau data yang ada didalam variable jobcategory
        */
       public String toString() {
              return jobcategory;
       }
}