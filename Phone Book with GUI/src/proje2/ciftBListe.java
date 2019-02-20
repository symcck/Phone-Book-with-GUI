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
public class ciftBListe {
    private static Node head ;
    private static Node tail ;
    
    
    public ciftBListe(){
        head = null;
        tail = null;
    }
    public boolean bosmu()
    {
        return head == null ;
    }
    
    public void basaekle(String isim,ArrayList<String> numara)  // Cift yonlu bagli listenin basina eleman ekler.
    {
        Node newNode = new Node(isim,numara);
        if(bosmu())
        {
            tail = newNode ;
        }
        else{
            head.setOnceki(newNode);
        }
        newNode.setSonraki(head);
        head = newNode ;
    }
    public void sonaekle(String isim,ArrayList<String> numaralar)  // Cift yonlu bagli listenin sonuna eleman ekler.
    {
        Node newNode = new Node(isim,numaralar) ;
        if(bosmu())
        {
            head = newNode ;
        }
        else
        {   
            tail.setSonraki(newNode);
            newNode.setOnceki(tail);
            
        } 
        tail = newNode ;
    }
    public boolean arkasinaekle(String eslesme,String isim,ArrayList<String> numaralar) // Listemizde verilen bir elemanin arkasina digerini ekler.
    {
        Node aktif = head;
        
        while((aktif.getBas().getAdSoyad()).equals(eslesme)==false)
        {   
            
            aktif= aktif.getSonraki();
            
            if(aktif==null)
               return false; 
        }
        
        Node newNode = new Node (isim,numaralar);
         
        if(aktif==head)
        {
            newNode.setOnceki(null);
            head = newNode ;
                      
        }
        else 
        {
            newNode.setOnceki(aktif.getOnceki());
            aktif.getOnceki().setSonraki(newNode);
                       
        }
        newNode.setSonraki(aktif);
        aktif.setOnceki(newNode);
        
                return true;
    }
   
    public boolean alfabetikEkle(String isim,ArrayList<String> numara)  // Projenin heryerinde kullandigimiz meshur alfabetik oncelige gore
    {   
        String gecici;
        Node aktif=head;
        alfabetikIslemler alfabe = new alfabetikIslemler();
        
        while((aktif!=null))
        {           
 
         gecici= alfabe.sirala(isim,aktif.getBas().getAdSoyad());
         
         if(gecici.equals(isim))
         {      
             arkasinaekle(aktif.getBas().getAdSoyad(),isim,numara);
             return true;
         }
         else
             aktif=aktif.getSonraki();
         if(aktif==null)
         {
             sonaekle(isim,numara);
             return true;
         }
            
       
    }                                           // elemanlari ekleyen methot.
        return true;                                       // İsmi verilen elemanin bagli listeden erisimini keser. 
    }
    /**
     *
     * @param eslesme
     * @return
     */
    public Node seciliSil(String eslesme)                      
    {
        Node aktif = head;
        while(aktif.getBas().getAdSoyad().equals(eslesme)==false)
        {
            aktif = aktif.getSonraki();
            if(aktif==null)
                return null;
        }
        if(aktif==head)
            head = aktif.getSonraki();
        else
            aktif.getOnceki().setSonraki(aktif.getSonraki());
        if (aktif==tail)
            tail = aktif.getOnceki();
        else
            aktif.getSonraki().setOnceki(aktif.getOnceki());
                    
        return aktif;
    }
    public Node seciliBul(String eslesme)                      // İsmi verilen elemanin bulundugu dugumu dondurur.
    {
        Node aktif = head;
        while(aktif.getBas().getAdSoyad().equals(eslesme)==false)
        {
            aktif = aktif.getSonraki();
            if(aktif==null)
                return null;
        }
        return aktif;
    }
    public Node dondur(int konum)                           // Konumu verilen bir dugumu dondurur.Bu methot gereksiz gelebilir ama madem
    {
        int i = 0;
        Node aktif =head;
        while((i!=konum)&&(aktif!=null))
        {
            aktif=aktif.getSonraki();
            i++;
        }
        return aktif;
    }                                         // yazdim kullanayim dedim....
  
  
    public void yazdir()                                 // Bilgileri yazdirmak icin methot.İcerisinde dugum un yazdir methotunu cagiriyor.
    {
        System.out.println("İsimler :  ");
        Node aktif = head ;
        while(aktif!=null)
        {
            aktif.yazdir();
            aktif=aktif.getSonraki();
        }
        System.out.println();
    }
    /**
     * @return the head
     */
    public Node getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * @return the tail
     */
    public Node getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(Node tail) {
        this.tail = tail;
    }
    
    
    
}
