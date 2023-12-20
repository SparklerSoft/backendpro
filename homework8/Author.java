package com.proftelran.org.homework8;

public class Author {

    private String authorBookName;
    private String authorBookSecondName;
    private int yearAuthorBirth;

    public Author(String authorBookName, String authorBookSecondName, int yearAuthorBirth) {
        this.authorBookName = authorBookName;
        this.authorBookSecondName = authorBookSecondName;
        this.yearAuthorBirth = yearAuthorBirth;
    }

    public String getAuthorBookName() {
        return authorBookName;
    }

    public void setAuthorBookName(String authorBookName) {
        this.authorBookName = authorBookName;
    }

    public String getAuthorBookSecondName() {
        return authorBookSecondName;
    }

    public void setAuthorBookSecondName(String authorBookSecondName) {
        this.authorBookSecondName = authorBookSecondName;
    }

    public int getYearAuthorBirth() {
        return yearAuthorBirth;
    }

    public void setYearAuthorBirth(int yearAuthorBirth) {
        this.yearAuthorBirth = yearAuthorBirth;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorBookName='" + authorBookName + '\'' +
                ", authorBookSecondName='" + authorBookSecondName + '\'' +
                ", yearAuthorBirth=" + yearAuthorBirth +
                '}';
    }
}
