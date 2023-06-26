package com.hugewarriors.DailyDiary.Controllers;

import com.hugewarriors.DailyDiary.Model.Diary;
import com.hugewarriors.DailyDiary.Service.DiaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DiaryController {
    private final DiaryService diaryService;

    @Autowired
    public DiaryController(DiaryService diaryService) { this.diaryService = diaryService; }
    @GetMapping(value = "/diary/insert")
    public ResponseEntity<Diary> insertDiary(@RequestBody Diary diary){
        Diary curDiary = diaryService.insertData(diary);
        return ResponseEntity.ok(curDiary);
    }

    @GetMapping(value = "/diary/get/{userId}")
    public ResponseEntity<List<Diary>> getDiaries(@PathVariable("userId") Integer userId){
        List<Diary> listDiary = diaryService.getDiaries(userId);
        return ResponseEntity.ok(listDiary);
    }
}
