package com.blogproject.Blog.Application.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "comments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String body;
    private String email;
    private String name;
    @ManyToOne
    @JoinColumn(name="post_id")   //foreign key
    private Post post;


}
