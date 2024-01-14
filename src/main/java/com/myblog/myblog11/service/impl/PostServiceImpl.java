package com.myblog.myblog11.service.impl;

import com.myblog.myblog11.payload.PostDto;
import com.myblog.myblog11.repository.PostRepository;
import com.myblog.myblog11.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private  PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
       this.postRepository=postRepository;
    }

    @Override
    public PostDto CreatePost(PostDto postDto) {

        return null;
    }
}
