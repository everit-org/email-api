/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
