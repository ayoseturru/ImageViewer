package imageviewer.ui;

import imageviewer.model.Image;

public interface ImageViewer {
    public void setImage(Image image);
    public void showPrevImage();
    public void showNextImage();
    public Image getImage();
}
