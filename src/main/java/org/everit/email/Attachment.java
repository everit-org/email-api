package org.everit.email;

/**
 * Attachment of an email.
 */
public class Attachment {

  /**
   * Type of the content of the attachment. E.g.: image/png
   */
  public String contentType;

  /**
   * Supplies the content of the attachment via an InputStream.
   */
  public InputStreamSupplier inputStreamSupplier;

  /**
   * Name of the attachment. Should be a simple file name without folders.
   */
  public String name;

  public Attachment withContentType(final String contentType) {
    this.contentType = contentType;
    return this;
  }

  public Attachment withInputStreamSupplier(final InputStreamSupplier inputStreamSupplier) {
    this.inputStreamSupplier = inputStreamSupplier;
    return this;
  }

  public Attachment withName(final String name) {
    this.name = name;
    return this;
  }
}
