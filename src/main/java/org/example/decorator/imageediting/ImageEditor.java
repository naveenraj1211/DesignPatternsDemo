package org.example.decorator.imageediting;

import org.example.decorator.imageediting.utils.Image;

public interface ImageEditor {

    /** Task 1a - Add a method readImage that accepts a filePath and that returns an image {@link decorator.utils.Image}. */

    Image readImage(String filePath);

}
