package com.blogproject.Blog.Application.service;

import com.myblog.payload.PostDto;
import com.myblog.payload.PostResponse;

public interface PostService {

    PostDto savePost(PostDto postDto);

    void deletePostById(long id);

    PostDto getPostById(long id);

    PostDto updatePost(long id, PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
}
