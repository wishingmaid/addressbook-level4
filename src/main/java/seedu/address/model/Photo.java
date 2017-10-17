package seedu.address.model;

import static java.util.Objects.requireNonNull;

import javafx.scene.image.Image;

/**
 * Represents a Photo in the address book.
 */

public class Photo {

    private Image image;
    private String filepath;
    private final String DEFAULT_PHOTOURL = "/images/noPhoto.png";
    public Photo(String filepath) {
        requireNonNull(filepath);
        if (filepath.equals("")) {
            this.filepath = DEFAULT_PHOTOURL;
           // this.image= new Image(getClass().getResource(DEFAULT_PHOTO_URL).toExternalForm());
        } else {
            this.filepath = filepath;
        }
        this.image = new Image(getClass().getResource(DEFAULT_PHOTOURL).toExternalForm());
    }
    public String getFilePath(){
        return filepath;
    }

    public Image getImage(){
        return image;
    }

}
