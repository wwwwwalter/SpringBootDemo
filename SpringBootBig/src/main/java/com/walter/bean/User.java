package com.walter.bean;

import java.util.Date;


public class User {
    private int id;
    private String username;
    private Date birthday;


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"username\":\"")
                .append(username).append('\"');
        sb.append(",\"birthday\":")
                .append(birthday);
        sb.append('}');
        return sb.toString();
    }
}
