package imageviewer.persistence.file;

import imageviewer.model.Image;
import imageviewer.model.RealImage;
import imageviewer.perssitence.ImageLoader;
import imageviewer.ui.swing.SwingBitmap;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class FileImageLoader implements ImageLoader {

    private final String path;

    public FileImageLoader(String path) {
        this.path = path;
    }

    @Override
    public Image load() {
        return new RealImage(new SwingBitmap(loadImage()));
    }

    private BufferedImage loadImage() {
        try {
            return ImageIO.read(new File(path));
        } catch (IOException ex) {
            return null;
        }
    }
}
