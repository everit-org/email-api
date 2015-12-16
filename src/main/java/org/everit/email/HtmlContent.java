package org.everit.email;

import java.util.Collections;
import java.util.Map;

/**
 * HTML contents are built up with HTML content and optional inline images.
 */
public class HtmlContent {

  /**
   * The HTML text.
   */
  public String html;

  /**
   * Map of inline images. The keys are the CID-s that can be used within the src attribute of img
   * elements.
   */
  public Map<String, Attachment> inlineImageByCidMap = Collections.emptyMap();

  public HtmlContent withHtml(final String html) {
    this.html = html;
    return this;
  }

  public HtmlContent withInlineImageByCidMap(final Map<String, Attachment> inlineImageByCidMap) {
    this.inlineImageByCidMap = inlineImageByCidMap;
    return this;
  }
}
