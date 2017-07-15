import java.io.File;

/**
 * Created by Zakir on 7/14/17.
 */
public class WebExercise3a {

    public static void doesFileExist(String path){

        try {
            File file = new File(path);
            if(file.exists()){
                System.out.println("File Exist");
            }
            else {
                System.out.println(path + "Doesn't Exist");
            }

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir") + " /src/main/resources/file.txt";
        doesFileExist(filePath);
    }
}