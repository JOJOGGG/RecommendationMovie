package com.movie.os.repository;

import com.movie.os.model.DictionaryEntity;
import com.movie.os.model.MovieScoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Johson on 2020/5/30.
 */
public interface DictionaryRepository extends JpaRepository<DictionaryEntity, Integer> {

    public List<DictionaryEntity> findByParent(Integer parent);

}
