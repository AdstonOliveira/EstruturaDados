package LDuplaLigada;
/**
 * @author Adston Oliveira LinhaVerde Informatica
 */
public class List {

   public List(){
   }
   public List(Element element){
      this.setStarter(element);
   }
   
   Element starter;
   Element finisher;
   
   boolean isEmpty(){
      return this.starter == null;
   }
   
   
   private boolean setStarter(Element element){
      if( this.starter == null ){
         this.starter = element; 
         this.finisher = element;
         
         this.starter.next = this.finisher;
         this.starter.previous = this.finisher;
         
         this.finisher.next = this.starter;
         this.finisher.previous = this.starter;
      
         return true;
      }
      return false;
   }
   
   boolean addElement(Element element){
      if( isEmpty() )
         return this.setStarter( element );
      else{
         System.out.println( "Este ultimo: " + this.finisher.getValue() +  "|\n " 
                 + "este é o proximo do ultimo: " + this.finisher.next.getValue() + " 1º:" + this.starter.getValue() );
         
         this.finisher.next = element;
         System.out.println( "Este é ultimo: " + this.finisher.getValue() +  "|\n " 
                 + "este é o proximo: " + this.finisher.next.getValue() );
         
         this.starter.previous = element;
         System.out.println( "Este é primeiro: " + this.starter.getValue() +  "|\n " 
                 + "este é o anterior ao primeiro: " + this.starter.getPrevious().getValue() );
         
         element.next = this.starter;
         System.out.println( "Este é prox do el: " + element.next.getValue() ); 
         
         element.previous = this.finisher;
         
         System.out.println( "Este é ant do el: " + element.previous.getValue() ); 
         
         this.finisher = element;
         
         return true;
      }
   }
   
boolean returnValues(){
   if(!isEmpty()){
      Element temp = this.starter;
      while(temp != this.finisher){
         System.out.println( temp.getValue() );
         temp = temp.next;
      }
      System.out.println( temp.getValue() );
   }
   return false;
}   

   public static void main( String[] args ) {
      Element one = new Element(1);
      Element second = new Element(2);
      List list = new List();
      list.addElement( one );
      list.addElement( second );
      list.returnValues();
      
      
         
      
      
      
   }
}

