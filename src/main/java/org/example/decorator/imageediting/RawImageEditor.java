package org.example.decorator.imageediting;

import org.example.decorator.imageediting.utils.Image;
import org.example.decorator.imageediting.utils.ImageUtils;

/**
 * TODO: Task 2 - Implement the ImageEditor interface to simply reads and return the image without any modifications.
 * Methods you can use
 * 1. {@link decorator.utils.ImageUtils#read(String)}
 * 2. {@link decorator.utils.ImageUtils#render(Image)}
 */
public class RawImageEditor implements ImageEditor {
    @Override
    public Image readImage(String filePath) {
        return ImageUtils.read(filePath);
    }
}
