package com.github.andrey_ul.telegram_bot;

import com.github.romankh3.image.comparison.ImageComparisonUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImage;

@DisplayName("Unit-level testing for ImageComparator")
class ImageComparatorTest {

    private final ImageComparator comparator = new ImageComparator();

    // Сравниваем две картинки между собой
    @Test
    public void shouldConfirmImageNotTheSame() {
        // given
        BufferedImage image1 = ImageComparisonUtil.readImageFromResources("image1.png");
        BufferedImage image2 = ImageComparisonUtil.readImageFromResources("image2.png");

        // when
        boolean theSameImages = comparator.isTheSameImages(image1, image2);

        // then
        Assertions.assertFalse(theSameImages);
    }

    // Сравниваем картинку саму с собой
    @Test
    public void shouldConfirmImagesTheSame() {
        // given
        BufferedImage image1 = ImageComparisonUtil.readImageFromResources("image1.png");

        // when
        boolean theSameImages = comparator.isTheSameImages(image1, image1);

        // then
        Assertions.assertTrue(theSameImages);
    }

}