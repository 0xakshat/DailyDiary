package com.hugewarriors.DailyDiary.Controllers;

import com.hugewarriors.DailyDiary.Model.Diary;
import com.hugewarriors.DailyDiary.Service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiaryController {
    private final DiaryService diaryService;

    @Autowired
    public DiaryController(DiaryService diaryService) { this.diaryService = diaryService; }
    @PostMapping(value = "/diary/insert")
    public Diary insertDiary(@RequestBody Diary data){
        return diaryService.insertData(data);
    }

}
