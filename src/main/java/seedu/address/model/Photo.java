package seedu.address.model;


import javafx.scene.image.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.imageio.ImageIO;

import static java.util.Objects.requireNonNull;

/**
 * Represents a Photo in the address book.
 */

public class Photo {

    public Image image;
    public String filepath;
    public boolean isValidFilePath = false;
    private final String DEFAULT_PHOTO_URL = "/images/noPhoto.png";
    public Photo(String filepath) {
        requireNonNull(filepath);
        if(filepath.equals("")) {
            this.filepath = DEFAULT_PHOTO_URL;
           // this.image= new Image(getClass().getResource(DEFAULT_PHOTO_URL).toExternalForm());
        } else {
            this.filepath = filepath;
        }
        this.image= new Image(getClass().getResource(DEFAULT_PHOTO_URL).toExternalForm());
        /*try {
            File file = new File("C:/users/pigir/Desktop/NUS/A0155314M.jpg");
            String localUrl = file.toURI().toURL().toString();
            this.image = new Image(localUrl);
            System.out.println(localUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }*/
        isValidFilePath = true;
    }
}
