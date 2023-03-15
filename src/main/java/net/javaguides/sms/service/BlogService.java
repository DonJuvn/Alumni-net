package net.javaguides.sms.service;

import net.javaguides.sms.entity.Blog;
import net.javaguides.sms.repository.BlogRepository;

public interface BlogService {
    BlogRepository getAllBlogs();

    Blog saveBlog(Blog student);

    Blog getBlogById(Long id);

    Blog updateBlog(Blog student);

    void deleteBlogById(Long id);
}