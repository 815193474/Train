package package01;

import java.io.File;

/**
 * @Author wolf  VX:a815193474
 * @Data 2019-12-05 17:34
 */
public class DeleteFile {
    public static void main(String args[]){
        File file=new File("C:\\Users\\Administrator\\Desktop\\file\\ื๗าต");
        if(file.isDirectory()){
            for (File f:file.listFiles()){
                f.delete();
            }
            file.delete();
        }
        System.out.println("success");
    }
}
