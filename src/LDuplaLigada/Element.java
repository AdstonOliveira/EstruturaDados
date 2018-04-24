package LDuplaLigada;
/**
 * @author Adston Oliveira LinhaVerde Informatica
 */
public class Element {

   public Element(int value){
      this.setValue( value );
   }
   public Element(){
      
   }
   
   int value;
   Element next;
   Element previous;

   public int getValue() {
      return value;
   }

   public void setValue( int value ) {
      this.value = value;
   }

   public Element getNext() {
      return next;
   }

   public void setNext( Element next ) {
      this.next = next;
   }

   public Element getPrevious() {
      return previous;
   }

   public void setPrevious( Element previous ) {
      this.previous = previous;
   }
   
   



   
}
