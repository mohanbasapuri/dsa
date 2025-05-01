package org.designpatterns.prototype;

public class DocumentTemplate implements Cloneable {
    private String title;
    private String content;

    public DocumentTemplate(String title, String content) {
        this.content = content;
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public DocumentTemplate clone() {
        try {
            return (DocumentTemplate) super.clone(); //shallow copy
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void displayDocument() {
        System.out.println("Document Title:" + title);
        System.out.println("Document Content:" + content);
    }

}
