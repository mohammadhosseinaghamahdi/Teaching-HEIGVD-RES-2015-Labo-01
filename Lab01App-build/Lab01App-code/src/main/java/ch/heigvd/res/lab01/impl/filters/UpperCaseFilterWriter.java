package ch.heigvd.res.lab01.impl.filters;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author Olivier Liechti
 */
public class UpperCaseFilterWriter extends FilterWriter {
  
  public UpperCaseFilterWriter(Writer wrappedWriter) {
    super(wrappedWriter);
  }

  @Override
  public void write(String str, int off, int len) throws IOException {
      for(int i = off ;  i < len + off ; i++)
          write(str.charAt(i));
  }

  @Override
  public void write(char[] cbuf, int off, int len) throws IOException {
    for(int i = off ;  i < len + off ; i++)
        write(cbuf[i]);
  }

  @Override
  public void write(int c) throws IOException {
      c = Character.toUpperCase(c);
      out.write(c);
  }

}
