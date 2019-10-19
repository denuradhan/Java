package jobsheet3;
public class pangkat {
    public int x,n,sum=1;
    void pangkat(){

    }
    int pangkatBruteForce(){
        return (int) Math.pow(x, n);
    }
    void pangkatDivideConquer(int indeks_awal, int indeks_ahir, PangkatProp hasil){
        int indeks_tengah;
        PangkatProp hasil1 = new PangkatProp();
        PangkatProp hasil2 = new PangkatProp();
        
        if(indeks_ahir == indeks_awal){
            hasil.hasil = x;
        }else if(indeks_ahir-indeks_awal==1){
            hasil.hasil = x*x;
        }else{
            indeks_tengah=(indeks_awal+indeks_ahir)/2;
            pangkatDivideConquer(indeks_awal, indeks_tengah, hasil1);
            pangkatDivideConquer(indeks_tengah+1, indeks_ahir, hasil2);
            
            hasil.hasil=hasil1.hasil * hasil2.hasil;
        }
    }   
    }