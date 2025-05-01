package org.designpatterns.factory;

public class AndroidDeveloper implements Developer{
    @Override
    public void bugFix() {
        System.out.println("Bug fixed by Android developer");
    }
}
