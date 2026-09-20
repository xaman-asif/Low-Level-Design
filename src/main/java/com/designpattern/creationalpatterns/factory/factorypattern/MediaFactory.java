//https://masnun.com/2013/06/21/design-pattern-factory-method.html

package com.designpattern.creationalpatterns.factory.factorypattern;

public class MediaFactory {
  public static Media factory(String mediaType) {
    if (mediaType.equalsIgnoreCase("Audio")) {
      return new Audio();
    } else if (mediaType.equalsIgnoreCase("Video")) {
      return new Video();
    } else if (mediaType.equalsIgnoreCase("Photo")) {
      return new Photo();
    }
    return null;
  }
}
