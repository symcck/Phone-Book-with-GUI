/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje2;

/**
 *
 * @author Asus
 */
public class alfabetikIslemler {
     public void alfabetikSirala(String[] isimler,int size,String[] numaralar)     //Alfabetik siralama icin bir methot.Cok kullanilmasada ...
   {  
      int i,j  ;
      String gecici;        
      for(i=1;i<size;i++)
      {
         for(j=0;j<size-i;j++)
         {
            String tutucu = sirala(isimler[j],isimler[j+1]);
            if (tutucu.equals(isimler[j+1]))
            {   
                gecici = isimler[j];
                isimler[j]=isimler[j+1];
                isimler[j+1]=gecici ;
                
                gecici = numaralar[j];
                numaralar[j] = numaralar[j+1];
                numaralar[j+1]=gecici;
             }
         }
      }
   }
   public int indeks(String kelime , int indeks)                 // İndeks verilen kelimenin kacinci harfinin isleme sokulacagini belirtir.
   {                                                  // isleme alinan harfin alfabetik siradaki karsiligi tamsayi olarak dondurulur.
       String alfabe = " abcçdefgğhıijklmnoöprsştuüyvz";        // charAt(0) = " " bosluk en dusuk en oncelige sahiptir.
        int i = 0,key=0;
        String bos = " ";
        while((key==0))
        {    
           try
           {
            if(kelime.charAt(indeks) == alfabe.charAt(i)) 
            {   
                key = 1;  
            }
            i++ ;   
          }catch(IndexOutOfBoundsException ex)                 // Kodun bu kismi basitce buyuk kucuk harf hassasligini kaldiriyor.
           {                                         // Eger harf buyukse i alfabenin boyutunu asacagindan IndexOutOfBoundsException hatasi 
              i=0;                                   // verilecektir.Bunu burada yakaliyarak buyuk harfin alfabe2 yi kullanarak alfabedeki  
              while((key==0))                          // sirasini donduruyoruz.
              {     
               String alfabe2 = " ABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜYVZ" ;           
               if(kelime.charAt(indeks) == alfabe2.charAt(i)) 
                 {  
                    key = 1;  
                 }
                i++ ;   
           }
           }
        }
        return i ;
       
   }
   public String sirala(String kelime1,String kelime2)        // indeks methodunu kullanarak iki kelimeden alfabetik oncelige sahip 
   {                                             // kelimeyi bulup dondurur.
       int i=0,j=0,sayac=0;
        while((i==j))
        {   
            i= indeks(kelime1,sayac);
            j= indeks(kelime2,sayac);
            sayac++;
            if((sayac==kelime1.length()) || (sayac==kelime2.length()))
            {
                return kelime2;                
            }
                
            
        }
        if(i<j)
            return kelime1 ;
        else 
            return kelime2 ;     
        
    
   }
    
}
