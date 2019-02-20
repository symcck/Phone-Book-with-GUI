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
public class Bilgi {
    private String adSoyad ;
    private ArrayList <String> numaralar = new ArrayList<String>();
    private Bilgi sonra;
    private Bilgi once;
    private String tumNo;      //Arraylist haricinde numaralarin virguller ile ayrilarak tutuldugu degisken
    
    public Bilgi()
    {
        adSoyad = null ;
        numaralar = null ;
        sonra = null ;
        once  = null ;
    }
    public Bilgi(String isim,ArrayList<String> numara)         //Constructor
    {   
        this.adSoyad=isim;
        int size =numara.size(),i=0;
        tumNo="";
        while(i<size)
        {   if(size==(i+1))
            { 
                 numaralar.add(numara.get(i));  
                 tumNo+=numara.get(i);
                 i++;
            } 
            else
            {
                 numaralar.add(numara.get(i));  
                 tumNo+=numara.get(i)+",";
                 i++;
            }
        
        }
        
        
    }
    public Bilgi(String ad,String numara)
    {
        this.adSoyad = ad;
        numaralar.add(numara);
    }
    public void yazdir()
    {
        System.out.print("ad soyad : "+adSoyad);
        int i =0;
        while(i<numaralar.size())
        {
            System.out.print(" : "+numaralar.get(i)+" :");
            i++;
        }
        System.out.println("");     
    }
    
    public String getAdSoyad() {
        return adSoyad;
    }

   
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

  
    public Bilgi getSonra() {
        return sonra;
    }

    /**
     * @param sonra the sonra to set
     */
    public void setSonra(Bilgi sonra) {
        this.sonra = sonra;
    }

    /**
     * @return the once
     */
    public Bilgi getOnce() {
        return once;
    }

    /**
     * @param once the once to set
     */
    public void setOnce(Bilgi once) {
        this.once = once;
    }

    /**
     * @return the numaralar
     */
    public ArrayList <String> getNumaralar() {
        return numaralar;
    }

    /**
     * @param numaralar the numaralar to set
     */
    public void setNumaralar(ArrayList <String> numaralar) {
        this.numaralar = numaralar;
    }

    /**
     * @return the tumNo
     */
    public String getTumNo() {
        return tumNo;
    }

    /**
     * @param tumNo the tumNo to set
     */
    public void setTumNo(String tumNo) {
        this.tumNo = tumNo;
    }

   
   
    
    
   
    
}
