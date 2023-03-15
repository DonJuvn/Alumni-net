package net.javaguides.sms.repository;

import net.javaguides.sms.entity.Blog;
import net.javaguides.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface BlogRepository extends CrudRepository<Blog, Long>  , JpaSpecificationExecutor<Blog> {

}
