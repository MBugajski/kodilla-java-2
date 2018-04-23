package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<>();
    private LinkedList<ForumComment> comments = new LinkedList<>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String postBody) {
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }

    public void addComment(ForumPost thePost, String author, String comment) {
        ForumComment theComment = new ForumComment(thePost, comment, author);
        comments.add(theComment);
    }

    public int getPostsQuantity() {

        return posts.size();
    }

    public int getCommentsQuantity() {

        return comments.size();
    }

    public ForumPost getPost(int postNumber) {

        return posts.get(postNumber);
    }

    public ForumComment getComment(int commentNumber) {

        return comments.get(commentNumber);
    }

    public boolean removePost(ForumPost thePost) {
        if (posts.contains(thePost)) {
            posts.remove(thePost);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeComment(ForumComment theComment) {
        if (comments.contains(theComment)) {
            comments.remove(theComment);
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
