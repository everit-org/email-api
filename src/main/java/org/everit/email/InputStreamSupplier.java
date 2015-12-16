package org.everit.email;

import java.io.InputStream;

/**
 * Functional interface to open an input streams.
 */
public interface InputStreamSupplier {

  /**
   * Returns the {@link InputStream} that provides the content of an attachment.
   *
   * @return The {@link InputStream} of the attachment.
   */
  InputStream getStream();
}
