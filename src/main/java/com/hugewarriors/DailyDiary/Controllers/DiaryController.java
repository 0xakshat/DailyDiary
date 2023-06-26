package com.hugewarriors.DailyDiary.Controllers;

import com.hugewarriors.DailyDiary.Model.Diary;
import com.hugewarriors.DailyDiary.Service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DiaryController {
    private final DiaryService diaryService;

    @Autowired
    public DiaryController(DiaryService diaryService) { this.diaryService = diaryService; }
    @PostMapping(value = "/diary/insert")
    public Diary insertDiary(@RequestBody Diary diary){
        return diaryService.insertData(diary);
    }

    @GetMapping("/diary/get")
    public List<Diary> getDiaries(@PathVariable("userId") Integer userId){
        return diaryService.getDiaries(userId);
    }
}
