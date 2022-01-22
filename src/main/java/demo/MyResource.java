package demo;

import java.io.Closeable;
import java.io.IOException;

public class MyResource implements Closeable {
  private final String message;

  public MyResource(String message) {
    this.message = message;
  }

  @Override
  public void close() throws IOException {
    System.out.println("### close");
  }

  public void show() {
    System.out.println("### show " + this.message);
  }
}
