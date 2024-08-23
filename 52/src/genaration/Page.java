package genaration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Page {
    private String pageName;
    protected FileWriter myWriter;
    private File file;

    public Page(String pageName ){
        this.pageName=pageName;
        try {
            String filePath = "52/output/"+pageName;

            // Create a File object
            file = new File(filePath);
            if(file.exists()){
                file.delete();
            }
            file.createNewFile();
            myWriter=  new FileWriter("52/output/"+pageName);
        }catch (IOException e) {
            System.out.println("An error occurredddd: " + e.getMessage());
        }
    }
    public void writeOnFile(String code){
        try {
            System.out.println(file.isFile());
            System.out.println(file.getName());
            myWriter.write(code);
            System.out.println("test write on file");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void closeFile(){
        try {
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
