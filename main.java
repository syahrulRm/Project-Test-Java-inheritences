/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 class main {
    
    public static void main(String[] args) {
        
        mobil sk, sk1;
        
        sk = new mobil (
        "avanza","romlah",2314,"Mini Bus");
        sk.setWarna("hijau");
        sk1 = new mobil (
        "pick up","jiung",2315,"Truck");
        sk1.setWarna("Orange");
        
        System.out.println(
                "\n Nama Mobil :"
                +sk.NamaMobil
                +"\n Nama Pemilik :"
                +sk.Pemilik
                +"\n Nomer Plat :"
                +sk.NomerPlat
                +"\n Warna :"
                +sk.getWarna()
                +"\n Jenis Mobil :"
                +sk.Jenis);
        System.out.println(
                "\n Nama Mobil :"
                +sk1.NamaMobil
                +"\n Nama Pemilik :"
                +sk1.Pemilik
                +"\n Nomer Plat :"
                +sk1.NomerPlat
                +"\n Warna :"
                +sk1.getWarna()
                +"\n Jenis Mobil :"
                +sk1.Jenis);
    }
    
}
