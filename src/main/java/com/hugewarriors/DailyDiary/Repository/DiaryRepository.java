package com.hugewarriors.DailyDiary.Repository;

import com.hugewarriors.DailyDiary.Model.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Integer> {
    @Query(value = "Select * FROM diary WHERE user_id = :userId", nativeQuery = true)
    List<Diary> getDiaries(Integer userId);
}
