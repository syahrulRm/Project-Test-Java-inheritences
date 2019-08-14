

class kendaraan {
    
    String NamaMobil;
    String Pemilik;
    int NomerPlat;
    String Warna;
    
    kendaraan (String nm,String pmk, int i){
        
        NamaMobil = nm ;
        Pemilik = pmk ;
        NomerPlat = i ;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }
       
}
