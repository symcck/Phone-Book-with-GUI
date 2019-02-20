/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje2;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Node  {
    private  Node onceki ;
    private  Node sonraki ;
    private  Bilgi bas;
    private  Bilgi son;
            
       
    public Node(String isim,ArrayList<String> numara)
    {   
        Bilgi aktif = new Bilgi(isim,numara);
        if(bas==null)
            bas = aktif ;
        else
            bas.setOnce(aktif);
        aktif.setSonra(bas);
        bas = aktif ;
    }
    public void yazdir()
    {
        Bilgi aktif = bas;
       
            aktif.yazdir();
            aktif=aktif.getSonra();  
    }

    /**
     * @return the onceki
     */
    public Node getOnceki() {
        return onceki;
    }

    /**
     * @param onceki the onceki to set
     */
    public void setOnceki(Node onceki) {
        this.onceki = onceki;
    }

    /**
     * @return the sonraki
     */
    public Node getSonraki() {
        return sonraki;
    }

    /**
     * @param sonraki the sonraki to set
     */
    public void setSonraki(Node sonraki) {
        this.sonraki = sonraki;
    }

    /**
     * @return the bas
     */
    public Bilgi getBas() {
        return bas;
    }

    /**
     * @param bas the bas to set
     */
    public void setBas(Bilgi bas) {
        this.bas = bas;
    }

    /**
     * @return the son
     */
    public Bilgi getSon() {
        return son;
    }

    /**
     * @param son the son to set
     */
    public void setSon(Bilgi son) {
        this.son = son;
    }

    /**
     * @return the bilgiErisim
     */
  

   
    
}
