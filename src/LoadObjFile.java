import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoadObjFile {

    public static void main(String[] args) throws FileNotFoundException {
       // 1. Load OBJ File
        File wavefront = new File("src/teapot.obj");
        Scanner scanner = new Scanner(wavefront);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}


