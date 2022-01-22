package demo;

import java.io.IOException;

public class Hello {

  public static void main(String[] args) throws IOException {
    try (MyResource resource = new MyResource()) {
      resource.show();
    }
  }

}
