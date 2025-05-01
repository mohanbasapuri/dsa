package org.designpatterns.factory;

public class WebDeveloper implements Developer{
    @Override
    public void bugFix() {
        System.out.println("Bug fixed by Web developer");
    }
}
