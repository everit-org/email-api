# email-api

API for handling e-mails in Java.

## Usage

### Setting the subject, the sender and the recipients

    Email email = new Email().withSubject("I need coffee");
    
    // Add the sender with builder pattern
    email.from = new EmailAddress().withAddress("foo@bar.com").withPersonal("Foo Bar");
    
    // Add some recipients with builder pattern
    email.recipients = new Recipients()
        .withTo(Arrays.asList(new EmailAddress[] {
            new EmailAddress().withAddress("target@bar.com")}))
        .withCc(Arrays.asList(new EmailAddress[] {
            new EmailAddress().withAddress("cc@bar.com")}));

### Adding text content

    email.withTextContent("I really need coffee");

### Adding html content with an inline image

    Map<String, Attachment> inlineImages = new HashMap<>;
    
    inlineImages.put("ineedcoffee", new Attachment()
        .withContentType("image/jpg")
        .withName("ineedcoffee.jpg"
        .withInputStreamSupplier(() -> new FileInputStream("/tmp/ineedcoffee.jpg"))));
    
    
    email.withHtmlContent(new HtmlContent()
        .withHtml("<h1>I really need coffee</h1>"
            + "<img src='cid:ineedcoffee' />")
        .withInlineImageByCidMap();

### Adding attachments

    email.withAttachments(Arrays.aslist(
        new Attachment()
            .withContentType("application/pdf")
            .withName("readme.pdf"
            .withInputStreamSupplier(() -> new FileInputStream("/tmp/readme.pdf"))));

### Sending emails

    EmailSender emailSender = getSomeEmailSenderImplementation();
    emailSender.sendEmail(email);

At the moment, an [implementation based on JavaMail API][1] is available. In the future,
we are planning to have a more lightweight module that implements the necessary parts
of SMTP protocol directly.

[1]: https://github.com/everit-org/email-javamail
