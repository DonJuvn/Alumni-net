package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Blog;
import net.javaguides.sms.repository.BlogRepository;
import net.javaguides.sms.service.BlogService;


@Service
public class BlogServiceImpl implements BlogService{

    private BlogRepository blogRepository;

    public BlogServiceImpl(BlogRepository blogRepository) {
        super();
        this.blogRepository = blogRepository;
    }

//    @Override
//    public List<Blog> getAllBlogs() {return blogRepository.findAll();}

    @Override
    public BlogRepository getAllBlogs() {
        return (BlogRepository) blogRepository.findAll();
    }

    @Override
    public Blog saveBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Blog getBlogById(Long id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public Blog updateBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public void deleteBlogById(Long id) {
        blogRepository.deleteById(id);
    }

}