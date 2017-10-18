package seedu.address.model;

import java.io.File;
import java.net.MalformedURLException;

import javafx.scene.image.Image;

/**
 * Represents a Photo in the address book.
 */

public class Photo {

    private static final String DEFAULT_PHOTOURL = "/images/noPhoto.png";
    private Image image;
    private String filepath;
    public Photo(String filepath) {
        if (filepath.equals("")) {
            this.filepath = DEFAULT_PHOTOURL;
            this.image = new Image(getClass().getResource(this.filepath).toExternalForm());
        } else {
         try { 
            this.filepath = filepath;
            File file = new File(filepath);
            String localUrl = file.toURI().toURL().toString();
            this.image = new Image(localUrl);
            System.out.println(localUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
            
        }
    }
    public String getFilePath() {
        return filepath;
    }

    public Image getImage() {
        return image;
    }

}
