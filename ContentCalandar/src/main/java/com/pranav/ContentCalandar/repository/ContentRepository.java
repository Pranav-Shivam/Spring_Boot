package com.pranav.ContentCalandar.repository;

import com.pranav.ContentCalandar.model.Content;
import com.pranav.ContentCalandar.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentRepository extends ListCrudRepository<Content,Integer> {
    public List<Content> findContentByKeyword(String key);

    @Query("""
            SELECT * FROM content
            WHERE status=:status
            """)
    public List<Content> findContentByStatus(@Param("status")Status status);

}
