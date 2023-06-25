package com.hugewarriors.DailyDiary.Service;

import com.hugewarriors.DailyDiary.Model.Diary;
import com.hugewarriors.DailyDiary.Repository.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DiaryService {
    private final DiaryRepository diaryRepository;

    @Autowired
    public DiaryService(DiaryRepository diaryRepository) {
        this.diaryRepository = diaryRepository;
    }

    public Diary insertData(Diary data) {
        data.setCreatedAt(LocalDateTime.now());
        data.setUpdatedAt(LocalDateTime.now());
        return diaryRepository.save(data);
    }
}