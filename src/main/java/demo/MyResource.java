package demo;

import java.io.Closeable;
import java.io.IOException;

public class MyResource implements Closeable {
  @Override
  public void close() throws IOException {
    System.out.println("### close");
  }

  public void show() {
    System.out.println("### show");
  }
}
