package seedu.address.model;

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
        } else {
            this.filepath = filepath;
        }
        this.image = new Image(getClass().getResource(DEFAULT_PHOTOURL).toExternalForm());
    }
    public String getFilePath() {
        return filepath;
    }

    public Image getImage() {
        return image;
    }

}
