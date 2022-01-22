package demo;

import java.io.IOException;

public class Hello {

  public static void main(String[] args) throws IOException {
    try (
        MyResource resource1 = new MyResource("aaa");
        MyResource resource2 = new MyResource("bbb");
    ) {
      resource1.show();
      resource2.show();
    }
  }

}
