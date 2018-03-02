package Aula10022018;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


   public class Ex4 {
      public Ex4(String file) throws FileNotFoundException{
         this.path = file;
         this.setFileReader(file);
         this.openConnection();
         this.arrayCreate = false;
      }
      
      private String[] dataFile;
      private final String path;
      private BufferedReader buffReader;
      private boolean arrayCreate;
      private FileReader fileReader;
      
      public void setFileReader(String file) throws FileNotFoundException{
         this.fileReader = new FileReader(file);
      }

      public void closeConnection() throws IOException{
         this.buffReader.close();
         this.fileReader.close();
      }
      public void openConnection() throws FileNotFoundException{
         this.setFileReader(path);
         this.buffReader = new BufferedReader(this.fileReader);
      }
      
      public void createNewArray() throws FileNotFoundException, IOException{
         this.openConnection();
         
         String rows = buffReader.readLine();
         int i = 0;
            
            while(rows != null){
               rows = buffReader.readLine();
               i++;
            }
            
            this.closeConnection();
            
         dataFile = new String[i];
         this.arrayCreate = true;
      }
      
      public void createArraybyFile() throws FileNotFoundException, IOException{
        if(!this.arrayCreate){
         this.openConnection();

         String valueRow;
         valueRow = this.buffReader.readLine();
         
            if(valueRow != null && !valueRow.equals(0)){
               int size = Integer.valueOf(valueRow);
               this.dataFile = new String[size];
               this.arrayCreate = true;
            }
            this.closeConnection();
        }
      }
      
      public void getValues() throws FileNotFoundException, IOException{
         
         String valueRow;
         
         if(this.arrayCreate){
            this.openConnection();
            valueRow = this.buffReader.readLine();
            
            for(int i = 0; i < this.dataFile.length; i++){
               valueRow = this.buffReader.readLine();
               this.dataFile[i] = valueRow;
            }
            
            this.closeConnection();
            System.out.println("Executado com sucesso...");
         }
      }
      
      public void showArray(){
         String values = "Valores: ";
            if(this.arrayCreate)
               for(String each : this.dataFile)
                  values += each + ", ";

         System.out.println(values);   
      }

      public static void main( String[] args ) throws FileNotFoundException, IOException {
         
         Ex4 ex4 = new Ex4(".\\teste.txt");
         ex4.createArraybyFile();

         ex4.getValues();
         ex4.showArray();
         
      }
      
      
      
      
      
      
      
}
