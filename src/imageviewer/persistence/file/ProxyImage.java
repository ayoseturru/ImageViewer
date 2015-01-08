package imageviewer.persistence.file;

import imageviewer.model.Bitmap;
import imageviewer.model.Image;
import imageviewer.perssitence.ImageLoader;

public class ProxyImage extends Image {

    private Image realImage;
    private final ImageLoader loader;

    public ProxyImage(ImageLoader loader) {
        this.loader = loader;
    }

    @Override
    public Bitmap getBitmap() {
        checkLoaded();
        return realImage.getBitmap();
    }

    private void checkLoaded() {
        if (realImage == null) {
            realImage = loader.load();
        }
    }
}